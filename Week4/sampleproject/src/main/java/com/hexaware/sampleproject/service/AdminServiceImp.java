package com.hexaware.sampleproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.sampleproject.dto.AdminDTO;
import com.hexaware.sampleproject.entity.Admin;
import com.hexaware.sampleproject.repository.AdminRepository;


@Service
public class AdminServiceImp implements IAdminService {

	@Autowired
	AdminRepository adminRepository;
	
	
	@Override
	public AdminDTO addAdmin(AdminDTO adminDTO) {
		
		Admin admin=new Admin();
		
		//admin.setAdminId(adminDTO.getAdminId());
		admin.setUserName(adminDTO.getUserName());
		admin.setPassword(adminDTO.getPassword());
		admin.setRole(adminDTO.getRole());
		
		
		Admin admin1 = adminRepository.save(admin);
		
		AdminDTO adminDTO1 = new AdminDTO();
		
		
		adminDTO1.setAdminId(admin1.getAdminId());
		adminDTO1.setUserName(admin1.getUserName());
		adminDTO1.setPassword(admin1.getPassword());
		adminDTO1.setRole(admin1.getRole());
		
		return adminDTO1;
	}

	@Override
	public AdminDTO getById(int adminId) {
		Admin admin =adminRepository.findById(adminId).orElse(null);
		
		AdminDTO adminDTO = new AdminDTO();
		
		adminDTO.setAdminId(admin.getAdminId());
		adminDTO.setUserName(admin.getUserName());
		adminDTO.setPassword(admin.getPassword());
		adminDTO.setRole(admin.getRole());
		
		
		
		
		return adminDTO;
	}

	@Override
    public Admin updateAdmin(AdminDTO adminDTO, int adminId) {
        Optional<Admin> optionalAdmin = adminRepository.findById(adminId);
        Admin adminToUpdate = new Admin();
        if (optionalAdmin.isPresent()) {
             adminToUpdate = optionalAdmin.get();

            // Update the Admin entity with the new data from AdminDTO
            adminToUpdate.setUserName(adminDTO.getUserName());
            adminToUpdate.setPassword(adminDTO.getPassword());
            adminToUpdate.setRole(adminDTO.getRole());
            
            
            
        }
        return adminRepository.save(adminToUpdate);
        
	}
	
	

	@Override
	public void deleteById(int adminId) {
		
		adminRepository.deleteById(adminId);
		

	}

	@Override
	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}

}
