package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Transaction;
import com.example.demo.repository.AccountRepository;

@Service
@Component
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public List<Transaction> getAccountsCustom(String customerId, String startDate, String endDate) {

		

		if (null != accountRepository)

			return accountRepository.getAccounts(customerId, startDate, endDate);

		// return accountRepository.getAccounts(customerId);

		return null;

	}

}
