package com.crud.RestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.RestApi.Dao.PersonDao;
import com.crud.RestApi.entity.Person;

@RestController
public class PersonController {
	

	private PersonDao person;
	
	@Autowired
	 public PersonController(PersonDao thePersonDao) {
		person=thePersonDao;
	}

	@GetMapping("/persons")
	public List<Person> getPersons() {
		return person.findAll();
		}
}
