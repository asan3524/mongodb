package com.mongodb.demo.service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.demo.service.entiry.UserInfo;


@Repository
public interface UserRepository extends MongoRepository<UserInfo, String> {

}
