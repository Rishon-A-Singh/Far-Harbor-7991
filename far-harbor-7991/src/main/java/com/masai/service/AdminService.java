package com.masai.service;

import java.util.List;

import com.masai.Exception.AdminException;
import com.masai.Exception.LoginException;
import com.masai.model.Admin;
import com.masai.model.AdminDTO;

public interface AdminService {
	
	public Admin adminRegister(Admin admin) throws AdminException;

	public Admin updatePassword(AdminDTO dto, String username, String key);

	public Admin update(Admin admin, String Username, String key);

	public String deleteByUsername(AdminDTO dto, String key);

//	public String logoutAdmin(String key) throws LoginException;
	
//	public List<CompletedTrips> getTripsByCustomerId(Integer customerId, String key);
//	
//	public List<CompletedTrips> getAllTrips(String key);
//	
//	public List<Driver> getListOfDrivers(String key);
//	
//	public List<Customer> getListOfCustomers(String key);

}
