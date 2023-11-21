package com.hexaware.sampleproject.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.sampleproject.dto.AdminDTO;
import com.hexaware.sampleproject.entity.Admin;
import com.hexaware.sampleproject.service.IAdminService;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	
	@Autowired
	IAdminService adminService;
	
	
	@PostMapping("/addAdmin")
	public AdminDTO addAdmin(@RequestBody AdminDTO adminDTO) {
		return adminService.addAdmin(adminDTO);
		
	}
	
	@GetMapping("/getById/{adminId}")
	public AdminDTO getById(@PathVariable int adminId) {
		
		return adminService.getById(adminId);
	}
	@PutMapping("/updateAdmin/{adminId}")
	public Admin updateAdmin(@RequestBody AdminDTO adminDTO,@PathVariable int adminId) {
		return adminService.updateAdmin(adminDTO, adminId);
	}
	
	
	@DeleteMapping("/deleteById/{adminId}")
	public String deleteById(@PathVariable int adminId) {
		adminService.deleteById(adminId);
		
		return "admin deleted";
		
	}
	@GetMapping("/getAllAdmin")
	public List<Admin> getAllAdmin() {
		return adminService.getAllAdmin();
	}
	
	

}
