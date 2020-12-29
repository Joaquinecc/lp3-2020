package com.tplp3.reviews.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tplp3.reviews.domain.UserPremium;
@Repository
public interface UserPremiumRepository extends PagingAndSortingRepository <UserPremium, Long> {

}
