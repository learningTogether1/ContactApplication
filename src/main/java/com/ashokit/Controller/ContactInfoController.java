package com.ashokit.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.entity.ContactEtity;
import com.ashokit.service.ContactService;

@Controller
public class ContactInfoController {
	private ContactService contactService;
	
	
	
	public ContactInfoController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}
	@GetMapping(value ={"/loadform","/contact"})
	public String loadform(Model model)
	{
		ContactEtity conobj=new ContactEtity();
		model.addAttribute("contactEtity", conobj);
		return "contactEtity";
	}
	@PostMapping("/saveContact")
	public String handleSaveBtnClick(ContactEtity contactEtity,Model model) {
		boolean isSaved=contactService.saveContact(contactEtity);
		
		if(isSaved) {
			model.addAttribute("sucMsg", "Conatct Saved Sucessfully");
		}else {
			model.addAttribute("errMsg", "Failed to Save Contact");
		}
		return "contactEtity";
	}
	
	@GetMapping("/viewContact")
	public ModelAndView handleViewAllContactsclickAndView() {
		ModelAndView mav= new ModelAndView();
		List<ContactEtity>  allContacts=  contactService.getAllContactEtities();
		//Setting data to model in key value pair format
		mav.addObject("contactEtity", allContacts);
		
		//setting logical view name
		mav.setViewName("viewContact");
		return mav;
		
	}
	

}
