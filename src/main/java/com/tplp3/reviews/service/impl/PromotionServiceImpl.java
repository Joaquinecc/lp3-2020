package com.tplp3.reviews.service.impl;

import com.tplp3.reviews.domain.Promotion;
import com.tplp3.reviews.domain.User;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.repository.PromotionRepository;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class PromotionServiceImpl implements com.tplp3.reviews.service.PromotionService {
	@Autowired
	private PromotionRepository promotionRepository;
	@Override
	public Promotion findById(Long id) throws IdNotFound {
		Promotion promotion=null;
		Optional<Promotion> option= promotionRepository.findById(id);
		if (option.isPresent()) {
			promotion = option.get();
		}else {
			throw new IdNotFound("User Premium");
		}
		return promotion;
	}

	@Override
	public List<Promotion> findAll() {
		List<Promotion> promotion = new ArrayList<>();
		Iterator<Promotion> iterator = promotionRepository.findAll().iterator();
		while (iterator.hasNext()) {
			promotion.add(iterator.next());
		}
		return promotion;
	}

	@Override
	public void save(Promotion promotion) {
		// TODO Auto-generated method stub
		promotionRepository.save(promotion);
		
	}

	@Override
	public void delete(Long id) {
			promotionRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Promotion promotion, Long id) throws IdNotFound {
		// TODO Auto-generated method stub
		if(promotionRepository.existsById(id)) {
			promotionRepository.save(promotion);
		}else {
			throw new IdNotFound("User Premium");
		}
		
	}
}