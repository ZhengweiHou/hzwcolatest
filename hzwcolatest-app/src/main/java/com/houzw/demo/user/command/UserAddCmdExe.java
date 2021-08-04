package com.houzw.demo.user.command;

import com.houzw.demo.domain.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.cola.dto.Response;
import com.houzw.demo.domain.gateway.UserGateway;
import com.houzw.demo.dto.UserAddCmd;

@Component
public class UserAddCmdExe {
	
	@Autowired
	UserGateway UserGateway;

	public Response execute(UserAddCmd cmd) {
		User User  = new User();
		BeanUtils.copyProperties(cmd.getUserCO(), User);
		
		// FIXME 关联做一些启动东西

		Integer id = UserGateway.save(User);
		Response resp = Response.buildSuccess();
		resp.setErrMessage("insert success id: " + id);
		return resp;
	}
}
