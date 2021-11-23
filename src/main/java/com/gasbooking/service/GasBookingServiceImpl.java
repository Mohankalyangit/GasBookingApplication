package com.gasbooking.service;

import java.util.Optional;
import java.util.function.Supplier;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasbooking.entity.GasBooking;
import com.gasbooking.repository.IGasBookingRepository;
@Service
public class GasBookingServiceImpl implements IGasBookingService{
	@Autowired
	IGasBookingRepository gasBookingRepo;
	@Override
	public GasBooking insertGasBooking(GasBooking gasBooking) {
		return gasBookingRepo.save(gasBooking);
	}

	@Override
	public GasBooking updateGasBooking(GasBooking gasBooking) {
		int gasBookingId=gasBooking.getGasBookingId();
		Supplier s1= ()->new ServiceException("Given GAs Booking Id is does not exist or null");
		GasBooking g1 = null;
		try {
			g1 = gasBookingRepo.findById(gasBookingId).orElseThrow(s1);
			g1.setLocalDate(gasBooking.getLocalDate());
			gasBookingRepo.save(g1);
		
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return g1;
		
		
	}

	@Override
	public GasBooking deleteGasBooking(int gasBookingId) {
		GasBooking entity=gasBookingRepo.getOne(gasBookingId);
		gasBookingRepo.delete(entity);
		return entity;
	}

	@Override
	public GasBooking getBill(int customerId) {
		
		return gasBookingRepo.findBycustomerId(customerId);
	}

}