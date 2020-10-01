package cn.springcloud.book.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

//貌似这个配置都没有生效？
@Configuration
@AvoidScan
public class TestConfiguration {

	//IClientConfig注入失败
	@Autowired
    IClientConfig config;

	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new RandomRule();
	}
}