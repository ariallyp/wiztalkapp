package com.yuanxin.app.app.wsdl.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuanxin.app.app.appobject.OrgAO;
import com.yuanxin.app.app.appobject.OrgUserAO;
import com.yuanxin.app.app.appobject.TenantAO;
import com.yuanxin.app.app.appobject.UserAO;
import com.yuanxin.app.app.dao.customized.AppUserAllowCustomziedMapper;
import com.yuanxin.app.app.dao.customized.AppUserCustomziedMapper;
import com.yuanxin.app.app.dao.customized.OrgUserCustomziedMapper;
import com.yuanxin.app.app.dao.customized.UserCustomziedMapper;
import com.yuanxin.app.app.dao.gen.OrgGeneratedMapper;
import com.yuanxin.app.app.dao.gen.OrgUserGeneratedMapper;
import com.yuanxin.app.app.dao.gen.TenantGeneratedMapper;
import com.yuanxin.app.app.dao.gen.UserGeneratedMapper;
import com.yuanxin.app.app.wsdl.entity.SeOrganization;
import com.yuanxin.app.app.wsdl.entity.SeUser;
import com.yuanxin.app.app.wsdl.entity.SeUserOrganization;
import com.yuanxin.app.app.wsdl.util.WCFUtil;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;

@Service
public class SyncDbService {

	private static Logger LOG = LoggerFactory.getLogger(SyncDbService.class);

	@Resource
	private OrgUserGeneratedMapper orgUserGeneratedMapper;

	@Resource
	private UserGeneratedMapper userGeneratedMapper;

	@Resource
	private OrgGeneratedMapper orgGeneratedMapper;

	@Resource
	private TenantGeneratedMapper tenantGeneratedMapper;

	@Resource
	private AppUserAllowCustomziedMapper appUserAllowCustomziedMapper;

	@Resource
	private UserCustomziedMapper userCustomziedMapper;

	@Resource
	private AppUserCustomziedMapper appUserCustomziedMapper;

	@Resource
	private OrgUserCustomziedMapper orgUserCustomziedMapper;

	@Value("${easc.appId}")
	private String appId;

	@Value("${easc.getAllOrganizationMethodName}")
	private String getAllOrganizationMethodName;

	@Value("${easc.getAllSeUserMethodName}")
	private String getAllSeUserMethodName;

	@Value("${easc.getAllUserOrgInfoMethodName}")
	private String getAllUserOrgInfoMethodName;

	@Value("${easc.isSyncTenantId}")
	private String isSyncTenantId;

	@Value("${easc.tenantIdOrgId}")
	private String tenantIdOrgId;

	@Value("${easc.wsdlsite}")
	private String wsdlsite;

	@Value("${easc.appwsdl}")
	private String appwsdl;

	public void syncdb() throws Exception {

		wsdlLoactionCache.getInstance().setWsdlsite(wsdlsite);
		wsdlLoactionCache.getInstance().setAppwsdl(appwsdl);

		long beginSynOrgMillis = System.currentTimeMillis();
		LOG.info("开始同步Org表的毫秒数为：" + beginSynOrgMillis);
		syncOrg();
		long endSynOrgMillis = System.currentTimeMillis();
		LOG.info("Org表同步完成时的毫秒数为：" + endSynOrgMillis);
		LOG.info("同步Org表一共花费了：" + (endSynOrgMillis - beginSynOrgMillis) + "毫秒");

		long beginSynUserMillis = System.currentTimeMillis();
		LOG.info("开始同步User表的毫秒数为：" + beginSynUserMillis);

		syncUser();
		long endSynUserMillis = System.currentTimeMillis();
		LOG.info("User表同步完成时的毫秒数为：" + endSynUserMillis);
		LOG.info("同步User表一共花费了：" + (endSynUserMillis - beginSynUserMillis) + "毫秒");

		long beginSynOrgUserMillis = System.currentTimeMillis();
		LOG.info("开始同步OrgUser表的毫秒数为：" + beginSynOrgUserMillis);

		syncUserOrg();
		long endSynOrgUserMillis = System.currentTimeMillis();
		LOG.info("OrgUser表同步完成时的毫秒数为：" + endSynOrgUserMillis);
		LOG.info("同步OrgUser表一共花费了：" + (endSynOrgUserMillis - beginSynOrgUserMillis) + "毫秒");

	}

	private void syncOrg() throws Exception {
		try {
			List<SeOrganization> seOrganizations = WCFUtil.getSeOrganizations(appId, getAllOrganizationMethodName);
			for (SeOrganization seOrganization : seOrganizations) {
				if (isSyncTenantId.equals("true") && seOrganization.getId().equals(tenantIdOrgId)) {
					if (seOrganization.getIsDeleted()) {
						tenantGeneratedMapper.deleteByPrimaryKey(seOrganization.getId());
						orgUserCustomziedMapper.deleteByOrgId(seOrganization.getId());
					} else {

						TenantAO tenantAO = new TenantAO();
						tenantAO.setId(seOrganization.getId());
						tenantAO.setName(seOrganization.getName());
						tenantAO.setCode("1");
						tenantAO.setStatus(0);
						tenantAO.setCustomerId("2");
						tenantAO.setUpdated(new Date());
						tenantAO.setCreated(new Date());
						TenantAO o = tenantGeneratedMapper.selectByPrimaryKey(seOrganization.getId());
						if (null != o) {
							tenantGeneratedMapper.updateByPrimaryKey(tenantAO);
						} else {
							tenantGeneratedMapper.insertSelective(tenantAO);
						}

					}

				} else if (!seOrganization.getId().equals(tenantIdOrgId)) {
					if (seOrganization.getIsDeleted()) {
						orgGeneratedMapper.deleteByPrimaryKey(seOrganization.getId());
						orgUserCustomziedMapper.deleteByOrgId(seOrganization.getId());
					} else {
						if (isCurrentTenantChildren(seOrganizations, seOrganization.getParentId(), tenantIdOrgId)) {
							OrgAO orgAo = new OrgAO();
							orgAo.setId(seOrganization.getId());
							orgAo.setName(seOrganization.getName());
							orgAo.setParentId(seOrganization.getParentId());
							orgAo.setShortName(seOrganization.getCode());
							orgAo.setSort(seOrganization.getSeqNo());
							orgAo.setLocation("");
							orgAo.setTenantId(tenantIdOrgId);
							OrgAO o = orgGeneratedMapper.selectByPrimaryKey(seOrganization.getId());
							if (null != o) {
								orgGeneratedMapper.updateByPrimaryKey(orgAo);
							} else {
								orgGeneratedMapper.insertSelective(orgAo);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}

	private boolean isCurrentTenantChildren(List<SeOrganization> seOrganizations, String parentId, String tenantId) {

		if (parentId.endsWith(tenantId)) {
			return true;
		}
		for (SeOrganization seOrganization : seOrganizations) {
			if (seOrganization.getId().equals(parentId)) {
				return isCurrentTenantChildren(seOrganizations, seOrganization.getParentId(), tenantId);
			} else {
				return false;
			}
		}

		return false;
	}

	private void syncUser() throws Exception {
		try {
			List<SeUser> seUsers = WCFUtil.getSeUers(appId, getAllSeUserMethodName);
			for (SeUser seUser : seUsers) {

				if (seUser.getIsDeleted()) {

					userGeneratedMapper.deleteByPrimaryKey(seUser.getId());

					appUserAllowCustomziedMapper.deleteByUserId(seUser.getId());

					userCustomziedMapper.deleteByUserId(seUser.getId());

					appUserCustomziedMapper.deleteByUserId(seUser.getId());

					orgUserCustomziedMapper.deleteByUserId(seUser.getId());
				} else {
					UserAO userAo = new UserAO();
					userAo.setUid(seUser.getId());

					userAo.setEmail(seUser.getEmail());
					userAo.setLevel(0);
					userAo.setName(seUser.getTrueName());
					userAo.setNickName(seUser.getTrueName());
					userAo.setTenantId(tenantIdOrgId);
					
					userAo.setpYQuanPin(seUser.getName());
					userAo.setRand(0);
					userAo.setStatus(0);
					//userAo.setMobile("");

					userAo.setUpdated(new Date());

					long l = Long.parseLong(seUser.getCreateDate().substring(6, 19));

					userAo.setCreated(new Date(l));
					UserAO u = userGeneratedMapper.selectByPrimaryKey(seUser.getId());
					if (null != u) {
						userAo.setMobile(u.getMobile());
						userAo.setAvatar(u.getAvatar());
						userAo.setTel(u.getTel());
						userAo.setUid(u.getUid());
						userAo.setPassword(u.getPassword());
						userGeneratedMapper.updateByPrimaryKey(userAo);
					} else {
						userAo.setMobile("");
						userAo.setPassword("202cb962ac59075b964b07152d234b70");
						userGeneratedMapper.insertSelective(userAo);
					}
				}

			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}

	private void syncUserOrg() throws Exception {
		try {
			List<SeUserOrganization> seUserOrganizations = WCFUtil.getSeUserOrganizations(appId,
					getAllUserOrgInfoMethodName);

			for (SeUserOrganization seUserOrganization : seUserOrganizations) {
				OrgAO o = orgGeneratedMapper.selectByPrimaryKey(seUserOrganization.getOrganizationId());
				if (null != o) {
					OrgUserAO orguserAo = new OrgUserAO();
					orguserAo.setId(seUserOrganization.getId());
					orguserAo.setOrgId(seUserOrganization.getOrganizationId());
					orguserAo.setUserId(seUserOrganization.getUserId());
					orguserAo.setSort(0);

					OrgUserAO ou = orgUserGeneratedMapper.selectByPrimaryKey(seUserOrganization.getId());
					if (null != ou) {
						orgUserGeneratedMapper.updateByPrimaryKey(orguserAo);
					} else {
						orgUserGeneratedMapper.insertSelective(orguserAo);
					}
				}

			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}
}
