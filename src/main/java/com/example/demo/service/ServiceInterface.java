package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Transaction;


public interface ServiceInterface {

	/*public List<Account> getAccountsCustom(
			String customerId ,Date startDate, Date endDate );
	*/
	public List<Transaction> getAccountsCustom(
			String customerId ,String startDate, String endDate );

}
