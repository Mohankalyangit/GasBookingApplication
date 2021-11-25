package com.gasbooking.service;
import java.time.LocalDate;
import java.util.List;

import com.gasbooking.entity.Admin;
import com.gasbooking.entity.GasBooking;
import com.gasbooking.exception.AdminNotFoundException;
import com.gasbooking.exception.CustomerNotFoundException;

public interface IAdminService {

	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(int adminId,Admin admin)throws AdminNotFoundException,Exception;
	public Admin deleteAdmin(int adminId) throws AdminNotFoundException ,Exception;
}