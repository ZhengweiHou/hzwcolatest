package com.houzw.demo.web;

import com.houzw.demo.dto.clientobject.UserCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.houzw.demo.api.UserService;
import com.houzw.demo.dto.UserAddCmd;

@RestController
public class UserController {

	@Autowired
	private UserService UserService;
	
    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to User world!";
    }

    @GetMapping(value = "/user")
    public MultiResponse<UserCO> listUserBy(@RequestParam(required = false) String name){
        return null;
    }

    @PostMapping(value = "/userAdd")
    public Response addCustomer(@RequestBody UserAddCmd UserAddCmd){
        return UserService.addUser(UserAddCmd);
    }
}
