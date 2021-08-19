package com.houzw.demo.web;

import com.alibaba.cola.dto.SingleResponse;
import com.houzw.demo.dto.UserQryById;
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
	private UserService userService;
	
    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to User world!";
    }

    @GetMapping(value = "/listuser")
    public MultiResponse<UserCO> listUser(){
        // TODO 列表查询，现有的mybatis生成的代码不支持列表查询，需手写mapper。考虑切换使用mybatisplus代码生成
        return null;
    }

    @GetMapping(value = "/getuserbyid")
    public SingleResponse<UserCO> getUserBy(@RequestParam(required = false) Integer id){
        UserQryById userQry = new UserQryById();
        userQry.setId(id);
        return userService.getUserByName(userQry);
    }

    @PostMapping(value = "/userAdd")
    public Response addCustomer(@RequestBody UserAddCmd UserAddCmd){
        return userService.addUser(UserAddCmd);
    }
}
