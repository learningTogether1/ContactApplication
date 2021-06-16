package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.ContactEtity;

public interface ContactRepository extends JpaRepository<ContactEtity, Serializable>{
	
	

}
