package com.houzw.demo.user.command.query;

import com.alibaba.cola.dto.SingleResponse;
import com.houzw.demo.database.UserDOMapper;
import com.houzw.demo.database.dataobject.UserDO;
import com.houzw.demo.dto.UserQryById;
import com.houzw.demo.dto.clientobject.UserCO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserQryByIdExe {
    @Resource
    private UserDOMapper userDOMapper;

    public SingleResponse<UserCO> execute(UserQryById qry) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(qry.getId());
        UserCO userCO = new UserCO();
        BeanUtils.copyProperties(userDO, userCO);
        return SingleResponse.of(userCO);
    }
}
