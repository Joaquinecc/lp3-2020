package com.tplp3.reviews.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tplp3.reviews.domain.Discount;
@Repository
public interface DiscountRepository extends PagingAndSortingRepository< Discount, Long >{

}
