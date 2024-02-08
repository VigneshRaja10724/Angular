package com.crud.RestApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.RestApi.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
