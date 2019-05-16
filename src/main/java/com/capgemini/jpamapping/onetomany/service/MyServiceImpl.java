package com.capgemini.jpamapping.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpamapping.onetomany.dao.PersonDao;
import com.capgemini.jpamapping.onetomany.entity.Person;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private PersonDao dao;
	
	@Override
	public void add(Person person) {
		dao.save(person);
	}

	@Override
	public Person getAll(int id) {
		return dao.findById(id).get();
	}

}
