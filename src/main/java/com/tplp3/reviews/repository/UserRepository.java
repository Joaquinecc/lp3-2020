package com.tplp3.reviews.repository;




import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tplp3.reviews.domain.User;
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

//	List<Aula> findByDescripcion(String descipcion);
//	ArrayList<User> findAll();	

}
