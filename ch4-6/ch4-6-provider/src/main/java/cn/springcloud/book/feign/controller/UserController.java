package cn.springcloud.book.feign.controller;

import cn.springcloud.book.feign.model.User;
import cn.springcloud.book.feign.service.UserService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController implements UserService {

	@Override
	public String addUser(User user){
		//打断点影响了接口返回，则会再次被调用，应该是feign client的特性
		//System.out.println(System.currentTimeMillis());
		return "hello,"+user.getName();
	}

	@Override
	public String updateUser(User user){
		return "hello,"+user.getName();
	}


}
