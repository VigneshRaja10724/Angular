package com.crud.RestApi.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crud.RestApi.entity.Person;

@Repository
public class PersonDaoImp implements PersonDao{

	//define field for entity manager
	private EntityManager entityManager;
	
	//constructor injection..we can use any type of injection(eg:getter, setter)
	@Autowired
	public PersonDaoImp(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	@Transactional
	public List<Person> findAll() {
		//get the current hibernet session
		Session currentSession = entityManager.unwrap(Session.class);
			
		//create the query
		Query<Person> theQuery = currentSession.createQuery("from Persons", Person.class);
		
		//execute the query and get the resultset
		List<Person> persons = theQuery.getResultList();
		
		//return the resultSet
		return persons;
	}

}
