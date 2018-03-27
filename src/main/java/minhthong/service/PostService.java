package minhthong.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import minhthong.model.Post;
import minhthong.repository.PostRepo;

@Service
@Transactional
public class PostService {
	final PostRepo repository;

	public PostService(PostRepo repo) {
		super();
		this.repository = repo;
	}
	
	public Post findbyId(int id) {
		return repository.findOne(id);
	}

	public List<Post> findall() {
		List<Post> posts = new ArrayList<>();
		for (Post p : repository.findAll()) {
			posts.add(p);
		}
		return posts;
	}

	public void save(Post post) {
		repository.save(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}
