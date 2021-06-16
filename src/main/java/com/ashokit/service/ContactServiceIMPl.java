package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.ContactEtity;
import com.ashokit.repository.ContactRepository;
@Service
public class ContactServiceIMPl implements ContactService{

	private ContactRepository contactrepo;
	@Autowired
	public ContactServiceIMPl(ContactRepository contactrepo) {
		super();
		this.contactrepo = contactrepo;
	}

	@Override
	public boolean saveContact(ContactEtity contact) {
		contact.setActiveSw("Y");
		ContactEtity savedEntity =contactrepo.save(contact);
		if(savedEntity !=null && savedEntity.getContactId()!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<ContactEtity> getAllContactEtities() {
		List<ContactEtity> contacts=contactrepo.findAll();
		return contacts;
	}

	@Override
	public ContactEtity getContactById(Integer Contact_Id) {
		Optional<ContactEtity> findById=contactrepo.findById(Contact_Id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deleteContactById(Integer Contact_Id) {
		//hard Delete Approch
	/*	boolean existsById =contactrepo.existsById(Contact_Id);
		if(existsById) {
			contactrepo.deleteById(Contact_Id);
			return true;
		}
		return false;*/
		
		//Soft Delete Apporch
		Optional<ContactEtity>  findById=contactrepo.findById(Contact_Id);
		if(findById.isPresent()) {
			ContactEtity contactEtity=findById.get();
			contactEtity.setActiveSw("N");
			contactrepo.save(contactEtity);
			
			return true;
		}
		return false;
	}

}
