package com.gasbooking.service;

import java.util.InputMismatchException;
import java.util.List;

import com.gasbooking.entity.Customer;
import com.gasbooking.entity.SurrenderCylinder;
import com.gasbooking.exception.CustomerNotFoundException;
import com.gasbooking.exception.CylinderNotFoundException;
import com.gasbooking.exception.SurrenderCylinderNotFoundException;

public interface ISurrenderCylinderService {
	
	public SurrenderCylinder insertSurrenderCylinder(SurrenderCylinder sc);
	
	public SurrenderCylinder updateSurrenderCylinder( SurrenderCylinder sc);
	
	public SurrenderCylinder deleteSurrenderCylinder(int surrenderCylinderId) throws CylinderNotFoundException;
	
	public List<SurrenderCylinder> viewSurrenderCylinders() throws NumberFormatException, InputMismatchException, SurrenderCylinderNotFoundException;
	
	public int CountSurrenderCylinders();
	
	public SurrenderCylinder viewSurrenderCylinder(int surrenderCylinderId) throws NumberFormatException, InputMismatchException, SurrenderCylinderNotFoundException;

}