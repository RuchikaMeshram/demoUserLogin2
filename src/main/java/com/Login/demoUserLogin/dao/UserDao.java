package com.Login.demoUserLogin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Login.demoUserLogin.entities.User;

public interface UserDao extends JpaRepository<User, Long> {

}
