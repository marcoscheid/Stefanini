package br.com.stefanini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.stefanini.dao.UserDao;
import br.com.stefanini.model.User;
import br.com.stefanini.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void add(User user) {
		userDao.add(user);

	}

	@Transactional
	public void edit(User user) {
		userDao.edit(user);

	}

	@Transactional
	public void delete(int stefaniniId) {
		userDao.delete(stefaniniId);

	}

	@Transactional
	public User getUser(int stefaniniId) {
		return userDao.getUser(stefaniniId);
	}

	@Transactional
	public List getAllUser() {
		return userDao.getAllUser();
	}

}
