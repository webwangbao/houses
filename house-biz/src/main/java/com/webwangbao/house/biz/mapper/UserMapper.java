package com.webwangbao.house.biz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.webwangbao.house.common.model.User;

@Mapper
public interface UserMapper {

	 List<User>  selectUsers();
	
	 int insert(User account);

	 int delete(String email);

	 int update(User updateUser);

	 List<User> selectUsersByQuery(User user);

	 String getEmail(String email);
}
