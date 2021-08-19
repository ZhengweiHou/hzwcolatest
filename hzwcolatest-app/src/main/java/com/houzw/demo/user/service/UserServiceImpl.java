package com.houzw.demo.user.service;

import com.alibaba.cola.dto.SingleResponse;
import com.houzw.demo.dto.UserQryById;
import com.houzw.demo.user.command.UserAddCmdExe;
import com.houzw.demo.user.command.query.UserQryByIdExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.houzw.demo.api.UserService;
import com.houzw.demo.dto.UserAddCmd;
import com.houzw.demo.dto.clientobject.UserCO;

@Service
@CatchAndLog
public class UserServiceImpl implements UserService{

	@Autowired
	UserAddCmdExe userAddCmdExe;

	@Autowired
	UserQryByIdExe userQryByIdExe;
	
	@Override
	public Response addUser(UserAddCmd cmd) {
		return userAddCmdExe.execute(cmd);
	}

	@Override
	public SingleResponse<UserCO> getUserByName(UserQryById qry) {
		return userQryByIdExe.execute(qry);
	}

}
