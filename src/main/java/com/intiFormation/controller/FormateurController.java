package com.intiFormation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intiFormation.dao.FormateurDao;
import com.intiFormation.entity.Formateur;

@Controller
public class FormateurController {
	
	@Autowired
	FormateurDao  fdao;
	
	
	@RequestMapping("/test")
	public void test()
	{
		/*System.out.println("test");
		Formateur f = new Formateur();
		f.setAge(20);
		f.setEmail("test");
		f.setNom("bob");
		f.setPassword("123");
		f.setUsername("bobUsername");
		
	/*Formateur f=fdao.findByNom("bob");
		System.out.println(f.getAge());
		System.out.println(f.getUsername());*/
	}

}
