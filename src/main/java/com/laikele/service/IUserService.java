package com.laikele.service;

import com.laikele.dao.entity.User;

public interface IUserService {
	public User selectUser(long userID);
	public int saveUser(User user);
}
