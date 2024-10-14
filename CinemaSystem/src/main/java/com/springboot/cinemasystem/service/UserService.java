package com.springboot.cinemasystem.service;

import java.util.List;

import com.springboot.cinemasystem.model.entity.Account;
import com.springboot.cinemasystem.model.entity.Role;
import com.springboot.cinemasystem.model.entity.User;

public interface UserService {

	/**
	 * 
	 * @param user
	 */
	boolean signup(User user);

	/**
	 * 
	 * @param account
	 */
	User login(Account account);

	/**
	 * 
	 * @param user
	 */
	boolean editUser(User user);

	/**
	 * 
	 * @param userID
	 */
	boolean updateStatusUser(int userID);

	/**
	 * 
	 * @param role
	 */
	boolean addRole(Role role);

	/**
	 * 
	 * @param roleID
	 */
	boolean updateStatusRole(int roleID);

	/**
	 * 
	 * @param userID
	 */
	User getUser(int userID);

	/**
	 * 
	 * @param role
	 */
	boolean editRole(Role role);

	/**
	 * 
	 * @param userID
	 * @param password
	 */
	boolean changePassword(int userID, String password);

	List<User> getAllUser();

	/**
	 * 
	 * @param roleID
	 */
	List<User> getRole(int roleID);

}