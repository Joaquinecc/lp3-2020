package com.tplp3.reviews.repository;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tplp3.reviews.domain.Review;
@Repository
public interface  ReviewRepository  extends PagingAndSortingRepository<Review,Long>{
	List<Review> findBySite(String site);
}
