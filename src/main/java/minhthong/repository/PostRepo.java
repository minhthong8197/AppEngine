package minhthong.repository;

import org.springframework.data.repository.CrudRepository;

import minhthong.model.Post;

public interface PostRepo extends CrudRepository<Post, Integer>{

}
