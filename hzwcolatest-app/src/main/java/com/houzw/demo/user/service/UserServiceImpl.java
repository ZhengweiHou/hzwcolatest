package com.houzw.demo.user.service;

import com.houzw.demo.user.command.UserAddCmdExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.houzw.demo.api.UserService;
import com.houzw.demo.dto.UserAddCmd;
import com.houzw.demo.dto.UserQry;
import com.houzw.demo.dto.clientobject.UserCO;

@Service
@CatchAndLog
public class UserServiceImpl implements UserService{

	@Autowired
	UserAddCmdExe UserAddCmdExe;
	
	@Override
	public Response addUser(UserAddCmd cmd) {
		return UserAddCmdExe.execute(cmd);
	}

	@Override
	public MultiResponse<UserCO> listATAMetrics(UserQry UserQry) {
		// TODO Auto-generated method stub
		return null;
	}

}
