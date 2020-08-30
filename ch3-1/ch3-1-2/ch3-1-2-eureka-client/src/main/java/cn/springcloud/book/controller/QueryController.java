package cn.springcloud.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caibosi on 2018-06-20.
 */
@RestController
@RequestMapping("/query")
//@RefreshScope 2.一定要加才可以动态配置生效
@RefreshScope
public class QueryController {

    @Autowired
    EurekaClientConfigBean eurekaClientConfigBean;

    @Value("${refresh_test}")
    private String refreshTest;

    /**
     *
     *1.验证地址:http://localhost:8081/actutor/refresh
     */
    @GetMapping("/validate_refresh")
    public String validateConfigRefresh(){
        return refreshTest;
    }

    /**
     *
     * @return
     * {"defaultZone":"http://localhost:8761/eureka/,http://localhost:8762/eureka/"}
     */
    @GetMapping("/eureka-server")
    public Object getEurekaServerUrl(){
        return eurekaClientConfigBean.getServiceUrl();
    }
}
