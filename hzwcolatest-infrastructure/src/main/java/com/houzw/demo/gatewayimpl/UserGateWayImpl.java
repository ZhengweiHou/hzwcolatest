package com.houzw.demo.gatewayimpl;

import com.houzw.demo.common.event.DomainEventPublisher;
import com.houzw.demo.convertor.HzwUserConvertor;
import com.houzw.demo.database.mybatisplus.entity.HzwUserDO;
import com.houzw.demo.database.mybatisplus.service.HzwUserRep;
import com.houzw.demo.domain.gateway.UserGateway;
import com.houzw.demo.domain.user.User;
import com.houzw.demo.dto.domainevent.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
public class UserGateWayImpl implements UserGateway{

	@Autowired
	private HzwUserRep hzwUserRep;

	
	@Resource
	private DomainEventPublisher domainEventPublisher;
	
	@Override
	public Integer save(User User) {
		HzwUserDO hzwUserDO = HzwUserConvertor.toDo(User);
		hzwUserRep.save(hzwUserDO);
		log.debug("自动生成ID：" + hzwUserDO.getId());
		UserCreatedEvent UserCreatedEvent = new UserCreatedEvent();
		UserCreatedEvent.setId(hzwUserDO.getId());
		UserCreatedEvent.setName(hzwUserDO.getName());
		
		domainEventPublisher.publish(UserCreatedEvent);
		return hzwUserDO.getId();
	}

}
