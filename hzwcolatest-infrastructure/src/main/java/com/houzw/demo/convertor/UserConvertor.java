package com.houzw.demo.convertor;

import java.util.Date;

import com.houzw.demo.database.dataobject.UserDO;
import com.houzw.demo.domain.user.User;

public class UserConvertor {
	public static UserDO toDo(User user) {
		UserDO userDO = new UserDO();

		userDO.setName(user.getName());
		userDO.setDisplayName(user.getDisplayName());
		userDO.setFcd(new Date());
		userDO.setFcu("sys");
		userDO.setLcd(new Date());
		userDO.setLcu("sys");
		return userDO;
	}
}
