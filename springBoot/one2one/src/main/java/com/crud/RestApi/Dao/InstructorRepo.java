package com.crud.RestApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.crud.RestApi.entity.Instructor;

//the spring data rest api is used to minimize the code of restController(get,put,post)
//the mapping wil be the genericType(eg:Person)it will be in pural form(eg:persons)...it also gives the meta-data with the result set.
//@RepositoryRestResource(path="employees")
public interface InstructorRepo extends JpaRepository<Instructor, Integer> {

}
