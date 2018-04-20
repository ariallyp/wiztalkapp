/*
 * Copyright (c) 2012-2014, EpicSaaS Yuan Xin technology Co., Ltd.
 *
 * All rights reserved.
 */
package com.yuanxin.app.app.controller.pc;

import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;
import com.yuanxin.framework.service.ServiceResult;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello控制器。
 * 
 */
@Controller
@RequestMapping(value = "/pc/hello")
public class HelloController {

    private static Logger LOG = LoggerFactory.getLogger(HelloController.class);
    

    @RequestMapping(value = "", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public Object hello(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
        LOG.info("SessionId %s", request.getSession().getId());

        ServiceResult<Object> ret = new ServiceResult<Object>();
					ret.setData("test");
        return ret;
    }
    
    
}
