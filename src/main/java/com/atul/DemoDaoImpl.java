package com.atul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atul.entity.Tblbidsubfinal;
import com.atul.repo.TblbidsubfinalRepository;

@Service
public class DemoDaoImpl {
	
	@Autowired
	private TblbidsubfinalRepository tblbidsubfinalRepository;

	public void updateData(Tblbidsubfinal pojo) {
		tblbidsubfinalRepository.save(pojo);
	}

}
