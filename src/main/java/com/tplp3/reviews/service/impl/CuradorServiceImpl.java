package com.tplp3.reviews.service.impl;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Curador;
import com.tplp3.reviews.repository.CuradorRepository;

import org.springframework.stereotype.Service; 

@Service
public class CuradorServiceImpl implements com.tplp3.reviews.service.CuradorService {
	@Autowired
	private CuradorRepository curadorRepository;
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

	@Override
	public void save(Curador curador) {
		// TODO Auto-generated method stub
		curadorRepository.save(curador);
		
	}

	@Override
	public void delete(Long id) {
			curadorRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
}
