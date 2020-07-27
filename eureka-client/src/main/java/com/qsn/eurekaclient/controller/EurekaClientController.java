package com.qsn.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import javax.servlet.http.HttpServletRequest;
 
/**
 * 提供者控制器
 * 已实现负载均衡的轮询（多次刷新页面，调用不同接口）
 * EurekaClient（客户端）同时就是：一个内置的、使用轮询(round-robin)负载算法的负载均衡器。
 *
 * @author qiusn
 * @date 2020-01-10
 */
@RestController
public class EurekaClientController {
     
    @Value("${server.port}")
    private String port;
 
    /**
     * 提供的一个restful服务，返回内容格式：服务协议://服务器地址:服务端口/服务uri
     *
     * @param request
     * @return
     */
    @RequestMapping("/info")
    public String info(HttpServletRequest request) {
        String message = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getServletPath();
        return message;
    }

}