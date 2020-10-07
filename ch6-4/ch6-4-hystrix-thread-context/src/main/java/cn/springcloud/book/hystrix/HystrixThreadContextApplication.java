package cn.springcloud.book.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * spring cloud 中国社区
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixThreadContextApplication {//高級 看不懂那種高級

	@Bean
	@LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
    public static void main(String[] args) {
        SpringApplication.run(HystrixThreadContextApplication.class, args);
    }
    
}
