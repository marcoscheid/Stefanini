package br.com.stefanini.dao;

import java.util.List;

import br.com.stefanini.model.User;

public interface UserDao {

	public void add(User user);
	public void edit(User user);
	public void delete(int stefaniniId);
	public User getUser(int stefaniniId);
	public List getAllUser();
}
