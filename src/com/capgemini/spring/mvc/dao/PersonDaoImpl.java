package com.capgemini.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.mvc.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public void addNew(Person person) {
		
		template.update("INSERT INTO PERSON VALUES(?,?)" ,new Object[] {person.getPersonId(),person.getPersonName()});

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
