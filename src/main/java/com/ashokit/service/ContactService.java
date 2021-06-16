package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.ContactEtity;

public interface ContactService {
	
	public boolean saveContact(ContactEtity contact);
	
	public List<ContactEtity> getAllContactEtities();
	
	public ContactEtity getContactById(Integer Contact_Id);
	
	public boolean deleteContactById(Integer Contact_Id);

}
