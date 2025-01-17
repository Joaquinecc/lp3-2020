package com.tplp3.reviews.service.impl;


import com.tplp3.reviews.domain.Cupons;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.repository.CuponsRepository;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class CuponsServiceImpl implements com.tplp3.reviews.service.CuponsService {
	@Autowired
	private CuponsRepository cuponsRepository;
	@Override
	public Cupons findById(Long id) throws IdNotFound {
		Cupons cupons=null;
		Optional<Cupons> option= cuponsRepository.findById(id);
		if (option.isPresent()) {
			cupons = option.get();
		}else {
			throw new IdNotFound("Cupon");
		}
		
		return cupons;
	}

	@Override
	public List<Cupons> findAll() {
		List<Cupons> cupons = new ArrayList<>();
		Iterator<Cupons> iterator = cuponsRepository.findAll().iterator();
		while (iterator.hasNext()) {
			cupons.add(iterator.next());
		}
		return cupons;
	}

	@Override
	public void save(Cupons cupons) {
		// TODO Auto-generated method stub
		cuponsRepository.save(cupons);
		
	}

	@Override
	public void delete(Long id) {
			cuponsRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Cupons cupons, Long id) throws IdNotFound {
		// TODO Auto-generated method stub
		if(cuponsRepository.existsById(id)) {
			cuponsRepository.save(cupons);
		}else {
			throw new IdNotFound("Cupon");
		}
		
		
	}
}