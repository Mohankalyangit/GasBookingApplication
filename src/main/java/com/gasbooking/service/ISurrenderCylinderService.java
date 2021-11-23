package com.gasbooking.service;

import com.gasbooking.entity.SurrenderCylinder;

public interface ISurrenderCylinderService {
	
	SurrenderCylinder insertSurrenderCylinder(SurrenderCylinder sc);
	 String updateSurrenderCylinder(SurrenderCylinder sc,int Surrenderid);
	String deleteSurrenderCylinder(SurrenderCylinder sc,int surrenderid);
	int CountSurrenderCylinders();

}
