package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Activities;
import com.boot.pojo.Hotel;

public interface ActivitiesDao extends JpaRepository<Activities, String> {

}
