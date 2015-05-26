package com.laikele.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.laikele.dao.entity.User;
import com.laikele.dao.entity.UserExample;
import com.laikele.dao.entity.UserExample.Criteria;
import com.laikele.dao.entity.mapper.UserMapper;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User selectUser(long id) {
		return userMapper.selectByPrimaryKey(id);

	}

	public int saveUser(User user) {
		Date date = new Date(System.currentTimeMillis());
		user.setCreateDate(date);
		user.setType(Byte.valueOf("1"));
		user.setActive(Byte.valueOf("1"));
		return userMapper.insert(user);
	}

	public User selectUser(String username) {
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andLoginNameEqualTo(username);
		List<User> users = userMapper.selectByExample(userExample);
		if (null != users && 0 < users.size())
			return users.get(0);
		return null;
	}

}
