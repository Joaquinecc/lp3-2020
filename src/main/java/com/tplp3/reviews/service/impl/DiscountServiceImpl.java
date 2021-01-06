package com.tplp3.reviews.service.impl;

import com.tplp3.reviews.domain.Discount;
import com.tplp3.reviews.exception.IdNotFound;
import com.tplp3.reviews.repository.DiscountRepository;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class DiscountServiceImpl implements com.tplp3.reviews.service.DiscountService {
	@Autowired
	private DiscountRepository discountRepository;
	@Override
	public Discount findById(Long id) throws IdNotFound {
		Discount discount=null;
		Optional<Discount> option= discountRepository.findById(id);
		if (option.isPresent()) {
			discount = option.get();
		}else {
			throw new IdNotFound("Discount");
		}
		return discount;
	}

	@Override
	public List<Discount> findAll() {
		List<Discount> discount = new ArrayList<>();
		Iterator<Discount> iterator = discountRepository.findAll().iterator();
		while (iterator.hasNext()) {
			discount.add(iterator.next());
		}
		return discount;
	}

	@Override
	public void save(Discount discount) {
		// TODO Auto-generated method stub
		discountRepository.save(discount);
		
	}

	@Override
	public void delete(Long id) {
			discountRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Discount discount, Long id) throws IdNotFound {
		// TODO Auto-generated method stub
		if(discountRepository.existsById(id)) {
			discountRepository.save(discount);
		}
		else {
			throw new IdNotFound("Discount");
		}
	}
}