package com.capgemini.jpamapping.onetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpamapping.onetomany.entity.Certificate;
import com.capgemini.jpamapping.onetomany.entity.Person;
import com.capgemini.jpamapping.onetomany.service.MyService;

@RestController
public class PersonController {
	
	
	@Autowired
	private MyService service;
	
	
	@RequestMapping("/add")
	public Person addOneToMany() {
		Set<Certificate> certificates = new HashSet<Certificate>();
		Certificate c1 = new Certificate(102, "java");
		Certificate c2 = new Certificate(103, "c");
		Certificate c3 = new Certificate(104, "c++");
				
		certificates.add(c1);
		certificates.add(c2);
		certificates.add(c3);
	
		Person person = new Person(101,"kapil", certificates);
		service.add(person);
		return person;	
	}
	
	@RequestMapping("/get")
	public Person get() {
		return service.getAll(101);
	}
}
