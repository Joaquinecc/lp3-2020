package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Content;
import com.tplp3.reviews.repository.ContentRepository;
import com.tplp3.reviews.service.ContentService;

import org.springframework.stereotype.Service; 

@Service
public class ContentServiceImpl implements ContentService{
	@Autowired
	private ContentRepository contentRepository;
	@Override
	public Content findById(Long id) {
		Content content=null;
		Optional<Content> option= contentRepository.findById(id);
		if (option.isPresent()) {
			content = option.get();
		}
		return content;
	}

	@Override
	public List<Content> findAll() {
		List<Content> users = new ArrayList<>();
		Iterator<Content> iterator = contentRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}

	@Override
	public void save(Content content) {
		// TODO Auto-generated method stub
		contentRepository.save(content);
		
	}

	@Override
	public void delete(Long id) {
			contentRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Content content, Long id) {
		// TODO Auto-generated method stub
		if(contentRepository.existsById(id)) {
			contentRepository.save(content);
		}
		
	}
}

