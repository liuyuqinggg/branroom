package org.bran.branroom.dao;

import java.util.List;

import org.bran.branroom.entity.User;

public interface UserDao {
	
	User queryByUserId(String userId);
	
	List<User> queryAll();
	
	boolean update(User user);
	
	boolean insert(User user);
	
	boolean delete(User user);
}
