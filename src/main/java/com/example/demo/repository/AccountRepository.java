package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Transaction;


@Repository
public interface AccountRepository extends CrudRepository<Transaction, String> {

	/*@Query(value = "SELECT * " + " from Account acc, accountdescriptor asd, transaction tra"
			+ " where acc.AccDescriptorId=asd.AccountDescriptorId and " + "asd.CustomerId= :customerParam and "
			+ "tra.TransactionTimestamp between :startDate AND :endDate", nativeQuery = true)

	public List<Transaction> getAccounts(@Param("customerParam") String customerId,
			@Param("startDate") String startDate, @Param("endDate") String endDate);*/
	
	
	@Query(value = "SELECT * " + " from account acc, accountdescriptor asd, transaction tra,deposittransaction dp"
	+ " where acc.AccDescriptorId=asd.AccountDescriptorId and dp.TransactionId=tra.TransactionId and " + "asd.CustomerId= :customerParam and "
	+ "tra.TransactionTimestamp between :startDate AND :endDate", nativeQuery = true)


	public List<Transaction> getAccounts(@Param("customerParam") String customerId,
			@Param("startDate") String startDate, @Param("endDate") String endDate);
	

	

}
