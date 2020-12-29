package com.tplp3.reviews.service;
import java.util.List;



import com.tplp3.reviews.domain.PreaccessPremiere;
import org.springframework.stereotype.Service;
@Service
public interface PreaccessPremiereService {
	PreaccessPremiere findById(Long id);

	List<PreaccessPremiere> findAll();

	void save(PreaccessPremiere pre);

	void delete(Long id);

}
