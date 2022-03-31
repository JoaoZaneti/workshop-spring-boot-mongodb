package com.joaozaneti.whorkshopmongo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.joaozaneti.whorkshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	@Query("{ '_id' : ?0 }")
	Optional<User> buscarPorId(String id);
	
	@Query("{ 'name' : ?0 }")
	Optional<User> findByName(String name);
}
