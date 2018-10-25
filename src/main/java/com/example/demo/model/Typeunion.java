
package com.example.demo.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/*@Entity
@Table(name = "account")
@SecondaryTable(name = "transaction")
*/
public class Typeunion implements Serializable {

	final static long serialVersionUID = -8778761483864357438L;

	// @Column(name="account")
	private Account account;
	// @Column(name="accountDescriptor")
	// private AccountDescriptor accountDescriptor;
	// @Column(name="transaction")
	private Transaction transaction;

	/**
	 * Creates a new typeunion.
	 * 
	 */
	public Typeunion() {
		super();
	}

	/**
	 * Creates a new typeunion.
	 * 
	 */
	public Typeunion(Account account, /* AccountDescriptor accountDescriptor, */ Transaction transaction) {
		super();
		this.account = account;
		// this.accountDescriptor = accountDescriptor;
		this.transaction = transaction;
	}

	/**
	 * Returns the accounts.
	 * 
	 * @return accounts
	 */

	public Account getAccount() {
		return account;
	}

	/**
	 * Set the accounts.
	 * 
	 * @param accounts
	 *            the new accounts
	 */
	public void setAccounts(Account account) {
		this.account = account;
	}

	/**
	 * Returns the accountDescriptor.
	 * 
	 * @return accountDescriptor
	 */

	/*
	 * public AccountDescriptor getAccountDescriptor() { return
	 * accountDescriptor; }
	 * 
	 *//**
		 * Set the accountDescriptor.
		 * 
		 * @param accountDescriptor
		 *            the new accountDescriptor
		 */
	/*
	 * public void setAccountDescriptor(AccountDescriptor accountDescriptor) {
	 * this.accountDescriptor = accountDescriptor; }
	 * 
	 *//**
		 * Returns the transaction.
		 * 
		 * @return transaction
		 *//*
		*/

	/**
	 * Set the transaction.
	 * 
	 * @param transaction
	 *            the new transaction
	 */

	public int hashCode() {
		return new HashCodeBuilder().append(account)
				./* append(accountDescriptor). */append(transaction).toHashCode();
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		if (other == this) {
			return true;
		}
		if (this.getClass() != other.getClass()) {
			return false;
		}
		Typeunion otherObject = ((Typeunion) other);
		return new EqualsBuilder().append(account, otherObject.account)
				./* append(accountDescriptor, otherObject.accountDescriptor). */append(transaction,
						otherObject.transaction)
				.isEquals();
	}

	@Override
	public String toString() {
		return "typeunion [account=" + account + ", transaction=" + transaction + "]";
	}

}
