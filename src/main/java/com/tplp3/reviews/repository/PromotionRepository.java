package com.tplp3.reviews.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tplp3.reviews.domain.Promotion;
@Repository
public interface PromotionRepository extends PagingAndSortingRepository <Promotion, Long> {

}
