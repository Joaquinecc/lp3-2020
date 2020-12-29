package com.tplp3.reviews.service.impl;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplp3.reviews.domain.Admin;
import com.tplp3.reviews.repository.AdminRepository;
import com.tplp3.reviews.service.AdminService;

import org.springframework.stereotype.Service; 

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRepository;
	@Override
	public Admin findById(Long id) {
		Admin admin=null;
		Optional<Admin> option= adminRepository.findById(id);
		if (option.isPresent()) {
			admin = option.get();
		}
		return admin;
	}

	@Override
	public List<Admin> findAll() {
		List<Admin> users = new ArrayList<>();
		Iterator<Admin> iterator = adminRepository.findAll().iterator();
		while (iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}

	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		adminRepository.save(admin);
		
	}

	@Override
	public void delete(Long id) {
			adminRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}
}
