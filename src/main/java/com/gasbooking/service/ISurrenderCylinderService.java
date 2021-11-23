package com.gasbooking.service;

import com.gasbooking.entity.SurrenderCylinder;

public interface ISurrenderCylinderService {
	
	SurrenderCylinder insertSurrenderCylinder(SurrenderCylinder sc);
	SurrenderCylinder updateSurrenderCylinder(SurrenderCylinder sc);
	SurrenderCylinder deleteSurrenderCylinder(SurrenderCylinder sc);
	int CountSurrenderCylinders();

}
