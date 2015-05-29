package com.project.template.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.project.template.model.User;

public interface UserDao extends PagingAndSortingRepository<User, String> {
	@Query("select u from User u where u.userName = :userName")
	User findByUserName(@Param("userName") String userName);
}
