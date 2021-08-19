package com.houzw.demo.database;

import com.houzw.demo.database.dataobject.UserDO;
import com.houzw.demo.database.dataobject.UserDOExample;
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