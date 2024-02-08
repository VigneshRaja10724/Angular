package com.crud.RestApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.RestApi.entity.InstructorDetail;

public interface InstructorDetailRepo extends JpaRepository<InstructorDetail, Integer> {

}
