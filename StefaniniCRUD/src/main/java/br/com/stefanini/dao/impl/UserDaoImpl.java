package br.com.stefanini.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.stefanini.dao.UserDao;
import br.com.stefanini.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(User user) {
		session.getCurrentSession().save(user);

	}

	@Override
	public void edit(User user) {
		session.getCurrentSession().update(user);

	}

	@Override
	public void delete(int stefaniniId) {
		session.getCurrentSession().delete(getUser(stefaniniId));

	}

	@Override
	public User getUser(int stefaniniId) {
		return (User)session.getCurrentSession().get(User.class,stefaniniId);
	}

	@Override
	public List getAllUser() {
		return session.getCurrentSession().createQuery("from stefanini").list();
	}

}
