
package com.example.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.rabbitmq.MessageProducer;
import com.example.demo.service.ServiceImpl;



/**
 * No description (Generated with springmvc-raml-parser v.2.0.0)
 * 
 */
@RestController
@RequestMapping(value = "/api/v1/accounts/transactions", produces = "application/json")
@Validated
public class TransactionController {

	public final Logger transactionLogger = Logger.getLogger(this.getClass().getName());

	@Autowired
	public ServiceImpl service;

	@Autowired
	public MessageProducer messageProducer;


	/**
	 * get all account details for specific customerid
	 * 
	 */

	@RequestMapping(value = "", method = RequestMethod.GET)

	public List<Transaction> getAccountByCustomerID(@RequestParam String customerId,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

		Date date1 = startDate;
		Date date2 = endDate;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate1 = dateFormat.format(date1);
		String strDate2 = dateFormat.format(date2);
		System.out.println("Converted String: " + strDate1 + "  " + strDate2);

		transactionLogger.info("Starts the getAccountByCustomerID method of : " + this.getClass().getName());

		System.out.println("Inside controller");

		List<Transaction> listOfTransaction = null;
		if (null != customerId) {

			listOfTransaction = service.getAccountsCustom(customerId, strDate1, strDate2);

		}
		//messageProducer.sendMessage(listOfTransaction);

		transactionLogger.info("Ends the getAccountByCustomerID method of : " + this.getClass().getName());
		System.out.println(listOfTransaction);

		return listOfTransaction;

	}
}
