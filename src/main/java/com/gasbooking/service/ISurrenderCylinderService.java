package com.gasbooking.service;

import com.gasbooking.entity.SurrenderCylinder;

public interface ISurrenderCylinderService {
	
	SurrenderCylinder insertSurrenderCylinder(SurrenderCylinder sc);
	 void updateSurrenderCylinder(SurrenderCylinder sc);
	void deleteSurrenderCylinder(SurrenderCylinder sc);
	int CountSurrenderCylinders();

}
