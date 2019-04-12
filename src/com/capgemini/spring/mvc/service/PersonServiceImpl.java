package com.capgemini.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.mvc.dao.PersonDao;
import com.capgemini.spring.mvc.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao dao;

	@Override
	public void addNew(Person person) {
		dao.addNew(person);
	}

	@Override
	public List<Person> getAll() {

		return null;
	}

	@Override
	public void update(Person person) {

	}

	@Override
	public void delete(int PersonId) {

	}

	@Override
	public Person getPerson(int PersonId) {

		return null;
	}

}
