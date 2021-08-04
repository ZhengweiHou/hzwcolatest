package com.houzw.demo.dto;

import javax.validation.constraints.NotNull;


import com.houzw.demo.dto.clientobject.UserCO;
import lombok.Data;

@Data
public class UserAddCmd {
	
	@NotNull
	private UserCO userCO;



}
