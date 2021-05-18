package com.lbasoftware.webproject.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbasoftware.webproject.model.user;

public interface userDao extends JpaRepository<user, Integer> {

}
