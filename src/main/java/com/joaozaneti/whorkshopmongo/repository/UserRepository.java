package com.joaozaneti.whorkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaozaneti.whorkshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
