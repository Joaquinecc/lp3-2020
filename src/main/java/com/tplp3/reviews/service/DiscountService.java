package com.tplp3.reviews.service;
import java.util.List;

import com.tplp3.reviews.domain.Discount;
public interface DiscountService {
	Discount findById(Long id);

	List<Discount> findAll();

	void save(Discount discount);

	void delete(Long id);

	void update(Discount discount,Long id);
}
