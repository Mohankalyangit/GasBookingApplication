package com.gasbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasbooking.entity.Customer;
import com.gasbooking.entity.GasBooking;
import com.gasbooking.exception.GasBookingNotFoundException;
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
	public GasBooking updateGasBooking(int gasBookingId, GasBooking gasBooking) throws GasBookingNotFoundException {
		
		Optional<GasBooking> optional = gasBookingRepo.findById(gasBookingId);
		if(optional.isPresent()) {
			GasBooking g1=optional.get();
			g1.setLocalDate(gasBooking.getLocalDate());
			g1.setStatus(gasBooking.getStatus());
			g1.setBill(gasBooking.getBill());
			GasBooking updatedGasBooking=gasBookingRepo.save(g1);
			return updatedGasBooking;
		}
		else {
			throw new GasBookingNotFoundException("Gas Booking details not found");
		}
	}

	@Override
	public GasBooking deleteGasBooking(int gasBookingId) throws GasBookingNotFoundException {
		Optional<GasBooking> optional=gasBookingRepo.findById(gasBookingId);
		if(optional.isPresent()) {
			GasBooking deletedgasBooking=optional.get();
			gasBookingRepo.deleteById(gasBookingId);
			return deletedgasBooking;
		}
		else {
			throw new GasBookingNotFoundException("Gas Booking details not found");
		}
			
	}

	@Override
	public GasBooking getBill(int customerId) throws GasBookingNotFoundException {
		Customer optional = gasBookingRepo.findBycustomerId(customerId);
		List<GasBooking> list =  optional.getGasBooking();
		
		GasBooking gotDetails = null;
		
		for(int i=0; i<list.size(); i++) {
			gotDetails = list.get(i);
		}
		
		return gotDetails;
	}

}