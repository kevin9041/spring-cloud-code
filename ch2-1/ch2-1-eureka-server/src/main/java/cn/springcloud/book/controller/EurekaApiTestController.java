/**
 * Copyright (c) 2018-2020 All Rights Reserved.
 */
package cn.springcloud.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weihuanbo
 * @version $Id: EurekaApiTestController.java, v0.1 2020/8/16 weihuanbo Exp $$
 */
@RestController
//eureka server 的请求地址不能为/eureka/。。。。，否则请求不到接口，因为和eureka自带api地址冲突
@RequestMapping(value = "/eureka_api")
public class EurekaApiTestController {

    //恢复应用实例[PUT 请求]：http://127.0.0.1:8761/eureka/apps/demo-client1/MININT-QJ7QB3P:demo-client1:8081/status?value=UP
    //暂停应用实例[PUT 请求]：http://127.0.0.1:8761/eureka/apps/demo-client1/MININT-QJ7QB3P:demo-client1:8081/status?value=OUT_OF_SERVICE

    @RequestMapping(value = "/testEurekaRequestAddr", method = RequestMethod.GET)
    public String testEurekaRequestAddr() {
        return "Success";
    }
}