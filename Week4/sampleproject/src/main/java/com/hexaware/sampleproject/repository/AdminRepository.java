package com.hexaware.sampleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.sampleproject.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
