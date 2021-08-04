package com.houzw.demo.gatewayimpl;

import javax.annotation.Resource;

import com.houzw.demo.database.UserDOMapper;
import com.houzw.demo.database.dataobject.UserDO;
import com.houzw.demo.domain.user.User;
import org.springframework.stereotype.Component;

import com.houzw.demo.common.event.DomainEventPublisher;
import com.houzw.demo.convertor.UserConvertor;
import com.houzw.demo.domain.gateway.UserGateway;
import com.houzw.demo.dto.domainevent.UserCreatedEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserGateWayImpl implements UserGateway{

	@Resource
	private UserDOMapper UserDOMapper;
	
	@Resource
	private DomainEventPublisher domainEventPublisher;
	
	@Override
	public Integer save(User User) {
		UserDO UserDo = UserConvertor.toDo(User);
		UserDOMapper.insertSelective(UserDo);
		log.debug("自动生成ID：" + UserDo.getId());
		UserCreatedEvent UserCreatedEvent = new UserCreatedEvent();
		UserCreatedEvent.setId(UserDo.getId());
		UserCreatedEvent.setName(UserDo.getName());
		
		domainEventPublisher.publish(UserCreatedEvent);
		return UserDo.getId();
	}

}
