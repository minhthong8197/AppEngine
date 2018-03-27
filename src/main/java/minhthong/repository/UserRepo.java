package minhthong.repository;

import org.springframework.data.repository.CrudRepository;

import minhthong.model.User;

public interface UserRepo extends CrudRepository<User, String> {

}
