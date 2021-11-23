package com.gasbooking.repository;

import com.gasbooking.entity.GasBooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gasbooking.entity.GasBooking;
@Repository
public interface IGasBookingRepository extends JpaRepository<GasBooking, Integer> {

	GasBooking findBycustomerId(int customerId);

}
