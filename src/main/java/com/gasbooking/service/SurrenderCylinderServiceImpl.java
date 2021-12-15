package com.gasbooking.service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasbooking.entity.Customer;
import com.gasbooking.entity.SurrenderCylinder;
import com.gasbooking.exception.CustomerNotFoundException;
import com.gasbooking.exception.CylinderNotFoundException;
import com.gasbooking.exception.SurrenderCylinderNotFoundException;
import com.gasbooking.repository.ISurrenderCylinderRepository;

@Service
public class SurrenderCylinderServiceImpl implements ISurrenderCylinderService {

	@Autowired
	ISurrenderCylinderRepository surrendercylinderrepository;
	
	Logger logger=LoggerFactory.getLogger(SurrenderCylinderServiceImpl.class);

	@Override
	public SurrenderCylinder insertSurrenderCylinder(SurrenderCylinder sc) {

		logger.info("****************Inserting SurrenderCylinder Details****************");

		return surrendercylinderrepository.save(sc);
	}

	@Override
	public SurrenderCylinder updateSurrenderCylinder( SurrenderCylinder sc) {
		
		logger.info("****************Updating SurrenderCylinder Details****************");

		surrendercylinderrepository.save(sc);
		return sc;
	}
	@Override
	public SurrenderCylinder deleteSurrenderCylinder(int surrenderCylinderId) throws CylinderNotFoundException {
		
		logger.info("****************Deleting SurrenderCylinder Details****************");

		Optional<SurrenderCylinder> optional = surrendercylinderrepository.findById(surrenderCylinderId);
		
		if(optional.isPresent()) {
			SurrenderCylinder gotCylinder = optional.get();
			surrendercylinderrepository.delete(gotCylinder);
			return gotCylinder;
		}
		else {
			throw new CylinderNotFoundException("Cylinder not found");
		}

	}

	@Override
	public int CountSurrenderCylinders() {

		logger.info("****************Getting SurrenderCylinder Count****************");

		return (int) this.surrendercylinderrepository.count();
	}

	@Override
	public List<SurrenderCylinder> viewSurrenderCylinders()
			throws NumberFormatException, InputMismatchException, SurrenderCylinderNotFoundException {
	

			List<SurrenderCylinder> getAllCylinders = surrendercylinderrepository.findAll();
			if (getAllCylinders.isEmpty()) {
				throw new SurrenderCylinderNotFoundException("There are no such cylinder present in the database.");
			}
			return getAllCylinders;
		}

	@Override
	public SurrenderCylinder viewSurrenderCylinder(int surrenderCylinderId)
			throws NumberFormatException, InputMismatchException, SurrenderCylinderNotFoundException {
		Integer getId = Integer.valueOf(surrenderCylinderId);

		if (getId instanceof Integer) {
			Optional<SurrenderCylinder> optional = surrendercylinderrepository.findById(getId);

			if (optional.isPresent()) {
				SurrenderCylinder gotcylinder = optional.get();
				return gotcylinder;
			} else {
				throw new SurrenderCylinderNotFoundException("There are no such customer is present in the database.");
			}
		} else {
			throw new NumberFormatException("ID should be a number type.");
		}
	}

	}
	
