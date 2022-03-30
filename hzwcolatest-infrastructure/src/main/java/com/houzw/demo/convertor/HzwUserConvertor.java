package com.houzw.demo.convertor;

import com.houzw.demo.database.mybatisplus.entity.HzwUserDO;
import com.houzw.demo.domain.user.User;

import java.time.LocalDateTime;
import java.util.Date;

public class HzwUserConvertor {
	public static HzwUserDO toDo(User user) {
		HzwUserDO userDO = new HzwUserDO();

		userDO.setId(user.getId());
		userDO.setName(user.getName());
		userDO.setDisplayName(user.getDisplayName());
		// TODO 系统携带字段怎么处理
//		userDO.setFcd(LocalDateTime.now());
//		userDO.setFcu("sys");
//		userDO.setLcd(LocalDateTime.now());
//		userDO.setLcu("sys");
		return userDO;
	}
}
