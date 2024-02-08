package com.crud.RestApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.RestApi.Dao.PersonRepo;
import com.crud.RestApi.entity.Person;

@RestController
public class PersonController {
	
	//the logic work should be done in the service layer not in the controller.....
	
	@Autowired
	private PersonRepo person;
	
//	@Autowired
//	 public PersonController(PersonRepo thePersonDao) {
//		person=thePersonDao;
	//}

	@GetMapping("/persons/{id}")
	public Person getPerson(@PathVariable int id) {
		Optional<Person> resultSet = person.findById(id);
		
		Person person = null;
		if(resultSet.isPresent()) {
			person=resultSet.get();
		}else {
			throw new RuntimeException("con't find person"+id);
		}
		return person;
		}
	
	@GetMapping("/persons")
	public List<Person> getPersons() {
		return person.findAll();
		}
	
	@PostMapping("/save")
	public void saveOrUpdate(Person thePerson){
		person.save(thePerson);
	}
	
	@DeleteMapping("clear/{id}")
	public void deletePerson(@PathVariable int id) {
		person.deleteById(id);
	}
}
