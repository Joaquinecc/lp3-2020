package com.tplp3.reviews.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.Content;
import com.tplp3.reviews.exception.IdNotFound;


@Service
public interface ContentService {
	Content findById(Long id) throws IdNotFound ;

	List<Content> findAll();

	void save(Content content);

	void delete(Long id);
	
	void update(Content content,Long id) throws IdNotFound;
}
