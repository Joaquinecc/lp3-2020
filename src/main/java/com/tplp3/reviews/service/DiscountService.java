package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.Discount;
import com.tplp3.reviews.exception.IdNotFound;
public interface DiscountService {
	Discount findById(Long id) throws IdNotFound;

	List<Discount> findAll();

	void save(Discount discount);

	void delete(Long id);

	void update(Discount discount,Long id) throws IdNotFound;
}
