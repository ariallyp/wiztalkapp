package com.yuanxin.app.app.controller.client;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import com.yuanxin.app.app.service.IApnsTokenService;
import com.yuanxin.app.app.service.IAppUserAllowService;
import com.yuanxin.app.app.service.IAppUserService;
import com.yuanxin.app.app.service.IApplicationService;
import com.yuanxin.app.app.service.IClientLogService;
import com.yuanxin.app.app.service.IClientPluginVersionService;
import com.yuanxin.app.app.service.IClientService;
import com.yuanxin.app.app.service.IClientVersionService;
import com.yuanxin.app.app.service.IOpenfireUserSerivce;
import com.yuanxin.app.app.service.IOperationService;
import com.yuanxin.app.app.service.IOrgService;
import com.yuanxin.app.app.service.IOrgUserService;
import com.yuanxin.app.app.service.IRedisService;
import com.yuanxin.app.app.service.ITenantService;
import com.yuanxin.app.app.service.IUserService;
import com.yuanxin.app.app.service.IUserUserService;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;



/**
 * skin控制器。
 * 
 */
@Controller
@RequestMapping(value = "/client/skin")
public class AppSkinController {
	
	private static Logger LOG = LoggerFactory.getLogger(AppSkinController.class);
	@Resource
	private ITenantService tenantService;
	@Resource
	private IUserService userService;
	@Resource
	private IOrgUserService orgUserService;
	@Resource
	private IOrgService orgService;
	@Resource
	private FreeMarkerConfig freemarkerConfig;
	@Resource
	private IRedisService redisService;
	@Resource
	private IUserUserService userUserService;
	@Resource
	private IClientVersionService clientVersionService;
	@Resource
	private IApnsTokenService apnsTokenService;
	@Resource
	private IApplicationService applicationService;
	@Resource
	private IAppUserService appUserService;
	@Resource
	private IOpenfireUserSerivce openFileService;
	@Resource
	private IOperationService operationService;
	@Resource
	private IClientPluginVersionService clientPluginVersionService;

	@Resource
	private IAppUserAllowService appUserAllowService;
	
	@Resource
	private IClientLogService clientLogService;

	@Resource
	private IClientService clientService;

	@Value("${fileServePath}")
	private String fileServePath;

	@Value("${fileServeDownPath}")
	private String fileServeDownPath;

	@Value("${rejectInternatUrl}")
	private String rejectInternatUrl;

	@Value("${rejectLanUrl}")
	private String rejectLanUrl;

	@Value("${tenantId}")
	private String needbind_tenantId;

	public class SUFFIX {

		public final static String TENANT_SUFFIX = "@tenant";

		public final static String ORG_SUFFIX = "@org";

		public final static String QUN_SUFFIX = "@qun";

		public final static String USER_SUFFIX = "@user";

		public final static String APP_SUFFIX = "@app";
	}
	
	

}
