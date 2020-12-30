package com.tplp3.reviews.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tplp3.reviews.domain.Content;

@Service
public interface ContentService {
	Content findById(Long id);

	List<Content> findAll();

	void save(Content content);

	void delete(Long id);
}
