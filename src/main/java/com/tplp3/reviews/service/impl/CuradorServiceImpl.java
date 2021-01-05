package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Content;
import com.tplp3.reviews.domain.Curador;
import com.tplp3.reviews.repository.ContentRepository;
import com.tplp3.reviews.repository.CuradorRepository;

import org.springframework.stereotype.Service; 

@Service
public class CuradorServiceImpl implements com.tplp3.reviews.service.CuradorService {
	@Autowired
	private CuradorRepository curadorRepository;
	@Autowired
	private ContentRepository contentRepository;
	@Override
	public Curador findById(Long id) {
		Curador curador=null;
		Optional<Curador> option= curadorRepository.findById(id);
		if (option.isPresent()) {
			curador = option.get();
		}
		return curador;
	}

	@Override
	public List<Curador> findAll() {
		List<Curador> curador = new ArrayList<>();
		Iterator<Curador> iterator = curadorRepository.findAll().iterator();
		while (iterator.hasNext()) {
			curador.add(iterator.next());
		}
		return curador;
	}

	private Curador checkContentISValid(Curador curador) {
		System.out.println("\n\n\n Entre  \n\n");
		Iterator<Long> iter=curador.getContent_id().iterator();
		Content cont=null;
		Long id= (long) 10;
		while(iter.hasNext()) {
			id= (Long) iter.next();
			Optional<Content> option= contentRepository.findById(id);
			System.out.println("\n\n "+id.toString()+"\n");
			if (option.isPresent()) {
				cont = option.get();
				System.out.println(cont+"\n");

				cont=null;
			}else {
				System.out.println("Id not found "+id.toString()+"\n");
				iter.remove();
			}
			
		}
		
		return curador;
	}
	
	
	@Override
	public void save(Curador curador) {
		// TODO Auto-generated method stub
		checkContentISValid(curador);
		curadorRepository.save(curador);
		
	}

	@Override
	public void delete(Long id) {
			curadorRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Curador curador, Long id) {
		// TODO Auto-generated method stub
		if(curadorRepository.existsById(id)) {
			checkContentISValid(curador);
			curadorRepository.save(curador);
		}
		
	}
}
