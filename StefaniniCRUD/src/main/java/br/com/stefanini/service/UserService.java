package br.com.stefanini.service;

import java.util.List;

import br.com.stefanini.model.User;

public interface UserService {
	
	public void add(User user);
	public void edit(User user);
	public void delete(int stefaniniId);
	public User getUser(int stefaniniId);
	public List getAllUser();

}
