package com.hexaware.sampleproject.service;

import java.util.List;

import com.hexaware.sampleproject.dto.AdminDTO;
import com.hexaware.sampleproject.entity.Admin;

public interface IAdminService {
	
	
	AdminDTO addAdmin(AdminDTO adminDTO);			//returntype	methodname	(parmaters)	
	
	AdminDTO getById(int adminId);
	
	Admin updateAdmin(AdminDTO adminDTO, int adminId);
	
	void deleteById(int adminId);
	
	List<Admin> getAllAdmin();
	

}
