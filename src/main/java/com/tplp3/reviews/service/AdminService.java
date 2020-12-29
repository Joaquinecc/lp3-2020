package com.tplp3.reviews.service;

import java.util.List;

import com.tplp3.reviews.domain.Admin;

public interface AdminService {
	Admin findById(Long id);

	List<Admin> findAll();

	void save(Admin admin);

	void delete(Long id);
}
