package com.houzw.demo.dto.domainevent;

import lombok.Data;

@Data
public class UserCreatedEvent {
	private Integer id;
	private String name;
}
