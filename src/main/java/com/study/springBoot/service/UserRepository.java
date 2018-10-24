package com.study.springBoot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.springBoot.entity.User;




public interface UserRepository extends JpaRepository<User, Long> {

	    User findByUserName(String userName);
	    User findByUserNameOrEmail(String username, String email);
}
