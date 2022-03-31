package com.joaozaneti.whorkshopmongo.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.joaozaneti.whorkshopmongo.domain.User;
import com.joaozaneti.whorkshopmongo.repository.UserRepository;
import com.joaozaneti.whorkshopmongo.sevices.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}

	public User findById(String id) {
		Optional <User> optional = repo.buscarPorId(id);
		/*User user = new User();
		user.setId("624619998e2e87009f0e3738");
		Optional <User> optional = repo.findOne(Example.of(user)); */
		if ( !optional.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return optional.get();
	}
}
