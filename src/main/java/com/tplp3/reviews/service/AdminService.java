package com.tplp3.reviews.service;

import java.util.List;

import com.tplp3.reviews.domain.Admin;
import com.tplp3.reviews.exception.IdNotFound;


public interface AdminService {
	Admin findById(Long id) throws IdNotFound;

	List<Admin> findAll();

	void save(Admin admin);

	void delete(Long id);
	
	void update(Admin admin,Long id) throws IdNotFound;
}
