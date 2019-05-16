package com.capgemini.jpamapping.onetomany.service;

import org.springframework.stereotype.Service;

import com.capgemini.jpamapping.onetomany.entity.Person;

@Service
public interface MyService {
	public void add(Person person);
	public Person getAll(int id);
}
