package com.tplp3.reviews.service.impl;

import com.tplp3.reviews.domain.PreaccessPremiere;
import com.tplp3.reviews.repository.PreaccessPremiereRepository;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class PreaccessPremiereServiceImpl implements com.tplp3.reviews.service.PreaccessPremiereService{
	@Autowired
	private PreaccessPremiereRepository preaccessPremiereRepository;
	@Override
	public PreaccessPremiere findById(Long id) {
		PreaccessPremiere preaccessPremiere=null;
		Optional<PreaccessPremiere> option= preaccessPremiereRepository.findById(id);
		if (option.isPresent()) {
			preaccessPremiere = option.get();
		}
		return preaccessPremiere;
	}

	@Override
	public List<PreaccessPremiere> findAll() {
		List<PreaccessPremiere> preaccessPremiere = new ArrayList<>();
		Iterator<PreaccessPremiere> iterator = preaccessPremiereRepository.findAll().iterator();
		while (iterator.hasNext()) {
			preaccessPremiere.add(iterator.next());
		}
		return preaccessPremiere;
	}

	@Override
	public void save(PreaccessPremiere preaccessPremiere) {
		// TODO Auto-generated method stub
		preaccessPremiereRepository.save(preaccessPremiere);
		
	}
	

	@Override
	public void delete(Long id) {
			preaccessPremiereRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
}
