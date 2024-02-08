package com.crud.RestApi.Dao;

import java.util.List;

import com.crud.RestApi.entity.Person;


public interface PersonDao {
	public List<Person> findAll();
}
