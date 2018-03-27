package minhthong.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import minhthong.model.User;
import minhthong.repository.UserRepo;

@Service
@Transactional
public class UserService {
	final UserRepo repo;

	public UserService(UserRepo repo) {
		super();
		this.repo = repo;
	}

	public boolean compare(String user_name, String user_pass) {
		for (User u : repo.findAll()) {
			if (u.getUser_name().equals(user_name) && u.getUser_pass().equals(user_pass))
				return true;
		}
		return false;
	}

	public List<User> findall() { 
		List<User> users = new ArrayList<>();
		for (User u : repo.findAll()) {
			users.add(u);
		}
		return users;
	}
}
