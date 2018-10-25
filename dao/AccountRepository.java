package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AccountDescriptor;



@Repository
public interface AccountRepository extends CrudRepository<AccountDescriptor,String> {
	
	
	

}
