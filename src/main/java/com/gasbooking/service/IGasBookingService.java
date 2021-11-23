package com.gasbooking.service;

import com.gasbooking.entity.GasBooking;

public interface IGasBookingService {
	public GasBooking insertGasBooking(GasBooking gasBooking);
	public GasBooking updateGasBooking(GasBooking gasBooking);
	public GasBooking deleteGasBooking(int gasBookingId);
	public GasBooking getBill(int customerId);
}