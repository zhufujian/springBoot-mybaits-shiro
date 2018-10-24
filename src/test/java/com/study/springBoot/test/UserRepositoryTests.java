package com.study.springBoot.test;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.springBoot.entity.User;
import com.study.springBoot.service.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {


	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {  
		Date date = new Date();   
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
		String formattedDate = dateFormat.format(date);
		  
		userRepository.save(new User("aa11", "aa@126.com1", "aa1", "aa1234561",formattedDate));
		userRepository.save(new User("bb21", "bb@126.com1", "bb1", "bb1234561",formattedDate));
		userRepository.save(new User("cc31", "cc@126.com1", "cc1", "cc1234561",formattedDate));

		Assert.assertEquals(9, userRepository.findAll().size());
		Assert.assertEquals("bb1", userRepository.findByUserNameOrEmail("bb1", "cc@126.com1").getNickName());
		//userRepository.delete(userRepository.findByUserName("aa1")); 
	}

}
