package com.gasbooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gasbooking.entity.SurrenderCylinder;
import com.gasbooking.repository.ISurrenderCylinderRepository;

public class ISurrenderCylinderImpl implements ISurrenderCylinderService {

	@Autowired
	private ISurrenderCylinderRepository surrenderRepository;
	
	@Override
	public SurrenderCylinder insertSurrenderCylinder(SurrenderCylinder sc) {
		surrenderRepository.save(sc);
		return sc;
	}

	@Override
	public String updateSurrenderCylinder(SurrenderCylinder sc,int Surrenderid) {
		
		Optional<SurrenderCylinder> optional=surrenderRepository.findById(Surrenderid);
		if(optional.isPresent()) {
			SurrenderCylinder scdb=optional.get();
			scdb.setCustomer(sc.getCustomer());
			scdb.setCylinder(sc.getCylinder());
			scdb.setSurrenderDate(sc.getSurrenderDate());
			scdb.setSurrenderId(sc.getSurrenderId());
			surrenderRepository.save(scdb);
		}
		return "updated";
		
	}

	@Override
	public String deleteSurrenderCylinder(SurrenderCylinder sc,int Surrenderid) {
	
		surrenderRepository.deleteById(Surrenderid);
		return "Deleted";
	}

	@Override
	public int CountSurrenderCylinders() {
		return (int) this.surrenderRepository.count();
	
	}

}
