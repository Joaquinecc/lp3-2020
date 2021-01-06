package com.tplp3.reviews.service;
import java.util.List;



import com.tplp3.reviews.domain.PreaccessPremiere;
import com.tplp3.reviews.exception.IdNotFound;

public interface PreaccessPremiereService {
	PreaccessPremiere findById(Long id) throws IdNotFound;

	List<PreaccessPremiere> findAll();

	void save(PreaccessPremiere pre);

	void delete(Long id);
	
	void update(PreaccessPremiere pre,Long id) throws IdNotFound; 

}
