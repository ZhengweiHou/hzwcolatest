package com.houzw.demo.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.houzw.demo.dto.UserAddCmd;
import com.houzw.demo.dto.UserQryById;
import com.houzw.demo.dto.clientobject.UserCO;

public interface UserService {
	
	public Response addUser(UserAddCmd cmd);
	
	public SingleResponse<UserCO> getUserByName(UserQryById qry);

}
