/*
 * Copyright (c) 2012, Yunnan Yuan Xin technology Co., Ltd.
 *
 * All rights reserved.
 */
package com.yuanxin.app.app.controller.client;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuanxin.app.app.appobject.OrgAO;
import com.yuanxin.app.app.appobject.OrgUserAO;
import com.yuanxin.app.app.appobject.TenantAO;
import com.yuanxin.app.app.appobject.UserAO;
import com.yuanxin.app.app.dao.customized.AppUserAllowCustomziedMapper;
import com.yuanxin.app.app.dao.customized.AppUserCustomziedMapper;
import com.yuanxin.app.app.dao.customized.OrgUserCustomziedMapper;
import com.yuanxin.app.app.dao.customized.UserUserCustomziedMapper;
import com.yuanxin.app.app.dao.gen.OrgGeneratedMapper;
import com.yuanxin.app.app.dao.gen.OrgUserGeneratedMapper;
import com.yuanxin.app.app.dao.gen.TenantGeneratedMapper;
import com.yuanxin.app.app.dao.gen.UserGeneratedMapper;
import com.yuanxin.app.app.dto.request.SyncOrgRequest;
import com.yuanxin.app.app.dto.request.SyncTenantRequest;
import com.yuanxin.app.app.entity.gen.OrgUser;
import com.yuanxin.app.app.entity.gen.User;
import com.yuanxin.app.app.service.IOrgService;
import com.yuanxin.app.app.service.ITenantService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;
import com.yuanxin.framework.service.ServiceResult;

/**
 * App控制器。
 * 
 */
@Controller
@RequestMapping(value = "/client/app")
public class AppController {

	private static Logger LOG = LoggerFactory.getLogger(AppController.class);

	@Resource
	private ITenantService tenantService;

	@Resource
	private TenantGeneratedMapper tenantGeneratedMapper;

	@Resource
	private IOrgService orgService;

	@Resource
	private OrgGeneratedMapper orgGeneratedMapper;

	@Resource
	private OrgUserGeneratedMapper orgUserGeneratedMapper;

	@Resource
	private UserGeneratedMapper userGeneratedMapper;

	@Resource
	private AppUserAllowCustomziedMapper appUserAllowCustomziedMapper;

	@Resource
	private AppUserCustomziedMapper appUserCustomziedMapper;

	@Resource
	private OrgUserCustomziedMapper orgUserCustomziedMapper;
	
	@Resource
	private UserUserCustomziedMapper userUserCustomziedMapper;
	

	@RequestMapping(value = "/deleteOrg", method = { RequestMethod.POST })
	@ResponseBody
	public Object deleteOrg(@RequestBody SyncOrgRequest org, Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		ServiceResult<Boolean> ret = new ServiceResult<>();
		try {
			orgGeneratedMapper.deleteByPrimaryKey(org.getId());
			orgUserCustomziedMapper.deleteByOrgId(org.getId());

			ret.setSucceed(true);
			ret.setData(true);
			ret.setMsg(org.getId());
			return ret;
		} catch (Exception ex) {
			ret.setSucceed(false);
			ret.setData(false);
			ret.setMsg("failed");
			return ret;
		}
	}

	@RequestMapping(value = "/syncOrg", method = { RequestMethod.POST })
	@ResponseBody
	public Object syncOrg(@RequestBody SyncOrgRequest org, Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		ServiceResult<Boolean> ret = new ServiceResult<>();
		int i = 0;
		OrgAO orgAo = new OrgAO();
		orgAo.setId(org.getId());
		orgAo.setLocation(org.getLocation());
		orgAo.setName(org.getName());
		orgAo.setParentId(org.getParentId());
		orgAo.setShortName(org.getShortName());
		orgAo.setSort(org.getSort());
		orgAo.setTenantId(org.getTenantId());
		OrgAO o = orgGeneratedMapper.selectByPrimaryKey(org.getId());
		if (null != o) {
			i = orgGeneratedMapper.updateByPrimaryKey(orgAo);
		} else {
			i = orgGeneratedMapper.insertSelective(orgAo);
		}

		if (i > 0) {
			ret.setSucceed(true);
			ret.setData(true);
			ret.setMsg(orgAo.getId());
			return ret;
		}

		ret.setSucceed(false);
		ret.setData(false);
		ret.setMsg("failed");
		return ret;
	}

	@RequestMapping(value = "/syncOrgUser", method = { RequestMethod.POST })
	@ResponseBody
	public Object syncOrgUser(@RequestBody OrgUser orguser, Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		ServiceResult<Boolean> ret = new ServiceResult<>();
		int i = 0;
		OrgUserAO orguserAo = new OrgUserAO();
		orguserAo.setId(orguser.getId());
		orguserAo.setOrgId(orguser.getOrgId());
		orguserAo.setUserId(orguser.getUserId());
		orguserAo.setSort(orguser.getSort());

		OrgUserAO ou = orgUserGeneratedMapper.selectByPrimaryKey(orguser.getId());
		if (null != ou) {
			i = orgUserGeneratedMapper.updateByPrimaryKey(orguserAo);
		} else {
			i = orgUserGeneratedMapper.insertSelective(orguserAo);
		}

		if (i > 0) {
			ret.setSucceed(true);
			ret.setData(true);
			ret.setMsg(orguserAo.getId());
			return ret;
		}

		ret.setSucceed(false);
		ret.setData(false);
		ret.setMsg("failed");
		return ret;
	}

	
	@RequestMapping(value = "/deleteUser", method = { RequestMethod.POST })
	@ResponseBody
	public Object deleteUser(@RequestBody User user, Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		ServiceResult<Boolean> ret = new ServiceResult<>();
		try {
			userGeneratedMapper.deleteByPrimaryKey(user.getUid());

			appUserAllowCustomziedMapper.deleteByUserId(user.getUid());

			appUserCustomziedMapper.deleteByUserId(user.getUid());

			orgUserCustomziedMapper.deleteByUserId(user.getUid());
			
			userUserCustomziedMapper.deleteByUserId(user.getUid());

			ret.setSucceed(true);
			ret.setData(true);
			ret.setMsg(user.getUid());
			return ret;
		} catch (Exception ex) {
			ret.setSucceed(false);
			ret.setData(false);
			ret.setMsg("failed");
			return ret;
		}

		
	}
	
	@RequestMapping(value = "/SyncUser", method = { RequestMethod.POST })
	@ResponseBody
	public Object syncUser(@RequestBody User user, Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());

		ServiceResult<Boolean> ret = new ServiceResult<>();
		int i = 0;
		UserAO u = userGeneratedMapper.selectByPrimaryKey(user.getUid());
		UserAO userAo = new UserAO();
		userAo.setUid(user.getUid());
		userAo.setArea(user.getArea());
		userAo.setAvatar(user.getAvatar());
		userAo.setCreated(user.getCreated());
		userAo.setEmail(user.getEmail());
		userAo.setLevel(user.getLevel());
		userAo.setMobile(user.getMobile());
		userAo.setName(user.getName());
		userAo.setNickName(user.getNickName());
		userAo.setPassword(user.getPassword());
		userAo.setpYInitial(user.getpYInitial());
		userAo.setpYQuanPin(user.getpYQuanPin());
		userAo.setRand(user.getRand());
		userAo.setStatus(user.getStatus());
		userAo.setTel(user.getTel());
		userAo.setTenantId(user.getTenantId());
		userAo.setUpdated(user.getUpdated());
		if (null != u) {
			userAo.setUid(u.getUid());
			userAo.setAvatar(u.getAvatar());
			userAo.setTel(u.getTel());
			userAo.setMobile(u.getMobile());
			i = userGeneratedMapper.updateByPrimaryKey(userAo);
		} else {
			i = userGeneratedMapper.insertSelective(userAo);
		}
		if (i > 0) {
			ret.setSucceed(true);
			ret.setData(true);
			ret.setMsg(user.getUid());
			return ret;
		}

		ret.setSucceed(false);
		ret.setData(false);
		ret.setMsg("failed");
		return ret;

		// return null;
	}

	@RequestMapping(value = "/SyncTenant", method = { RequestMethod.POST })
	@ResponseBody
	public Object SyncTenant(@RequestBody SyncTenantRequest req, Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		LOG.info("name %s", req.getName());
		ServiceResult<Boolean> ret = new ServiceResult<>();
		int i = 0;
		TenantAO t = tenantGeneratedMapper.selectByPrimaryKey(req.getId());
		TenantAO to = new TenantAO();
		to.setId(req.getId());
		to.setCode(req.getCode());
		to.setCreated(req.getCreated());
		to.setCustomerId(req.getCustomerId());
		to.setName(req.getName());
		to.setStatus(req.getStatus());
		to.setUpdated(req.getUpdated());
		if (null != t) {
			i = tenantGeneratedMapper.updateByPrimaryKey(to);
		} else {
			i = tenantGeneratedMapper.insertSelective(to);
		}
		if (i > 0) {
			ret.setSucceed(true);
			ret.setData(true);
			ret.setMsg(req.getId());
			return ret;
		}

		ret.setSucceed(false);
		ret.setData(false);
		ret.setMsg("failed");
		return ret;
		// return null;
	}

	@RequestMapping(value = "/SyncQuota", method = { RequestMethod.POST })
	@ResponseBody
	public Object SyncQuota(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());

		return null;
	}

	@RequestMapping(value = "/SessionStat", method = { RequestMethod.POST })
	@ResponseBody
	public Object SessionStat(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/GetSession", method = { RequestMethod.POST })
	@ResponseBody
	public Object GetSession(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/user/auth", method = { RequestMethod.POST })
	@ResponseBody
	public Object auth(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/getTenantList", method = { RequestMethod.POST })
	@ResponseBody
	public Object getTenantList(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/getOrgList", method = { RequestMethod.POST })
	@ResponseBody
	public Object getOrgList(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/getOrgUserList", method = { RequestMethod.POST })
	@ResponseBody
	public Object getOrgUserList(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/addOrgUser", method = { RequestMethod.POST })
	@ResponseBody
	public Object addOrgUser(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/removeOrgUser", method = { RequestMethod.POST })
	@ResponseBody
	public Object removeOrgUser(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

	@RequestMapping(value = "/erweima", method = { RequestMethod.POST })
	@ResponseBody
	public Object getAppOperationList(Model model, HttpServletRequest request) {
		LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
		LOG.info("SessionId %s", request.getSession().getId());
		return null;
	}

}
