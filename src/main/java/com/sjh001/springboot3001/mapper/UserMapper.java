package com.sjh001.springboot3001.mapper;

import com.sjh001.springboot3001.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User usernameFindByUser(String username);

    int insetUser(String username,String nickname, String password);
}
