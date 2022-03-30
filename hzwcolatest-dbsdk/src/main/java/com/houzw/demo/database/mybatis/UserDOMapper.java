package com.houzw.demo.database.mybatis;

import com.houzw.demo.database.mybatis.dataobject.UserDO;
import com.houzw.demo.database.mybatis.dataobject.UserDOExample;
import java.util.List;

public interface UserDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserDOExample example);

    UserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}