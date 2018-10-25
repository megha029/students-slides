
package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "transaction")
public class Transaction extends Account implements Serializable {

	final static long serialVersionUID = -653364124163016664L;

	@Column(name = "TransactionId")
	private String transactionId;

	@Column(name = "ReferenceTransactionId")
	private String referenceTransactionId;
	@JsonFormat(pattern = "HH:mm:ss")

	@Column(name = "TransactionTimestamp")
	private Date transactionTimestamp;
	@JsonFormat(pattern = "yyyy-MM-dd")

	@Column(name = "Amount")
	private Double amount;

	@Column(name = "AccountId")
	private String accountId;

	/*@Id
	@Column(name = "AccountDescriptorId")
	private Double accountDescriptorId;
*/
	/*@Column(name = "AccountType")
	@Enumerated(EnumType.STRING)
	private AccountType accountType;*/

	/*@Column(name = "DisplayName")
	private String displayName;*/

	@Column(name = "Description")
	private String Description;

	@Column(name = "Status")
	@Enumerated(EnumType.STRING)
	private Status status;

	@Column(name = "CustomerId")
	private String CustomerId;

	/**
	 * Creates a new Transaction.
	 * 
	 */
	public Transaction() {
		super();
	}

	/**
	 * Creates a new Transaction.
	 * 
	 */

	/**
	 * Returns the transactionId.
	 * 
	 * @return transactionId
	 */

	public String getTransactionId() {
		return transactionId;
	}

	
	
	

	public Transaction(String transactionId, String referenceTransactionId, Date transactionTimestamp, Double amount,
			String accountId, String description, Status status, String customerId) {
		super();
		this.transactionId = transactionId;
		this.referenceTransactionId = referenceTransactionId;
		this.transactionTimestamp = transactionTimestamp;
		this.amount = amount;
		this.accountId = accountId;
		Description = description;
		this.status = status;
		CustomerId = customerId;
	}

	/**
	 * Set the transactionId.
	 * 
	 * @param transactionId
	 *            the new transactionId
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * Returns the referenceTransactionId.
	 * 
	 * @return referenceTransactionId
	 */

	public String getReferenceTransactionId() {
		return referenceTransactionId;
	}

	/**
	 * Set the referenceTransactionId.
	 * 
	 * @param referenceTransactionId
	 *            the new referenceTransactionId
	 */
	public void setReferenceTransactionId(String referenceTransactionId) {
		this.referenceTransactionId = referenceTransactionId;
	}

	/**
	 * Returns the transactionTimestamp.
	 * 
	 * @return transactionTimestamp
	 */

	public Date getTransactionTimestamp() {
		return transactionTimestamp;
	}

	/**
	 * Set the transactionTimestamp.
	 * 
	 * @param transactionTimestamp
	 *            the new transactionTimestamp
	 */
	public void setTransactionTimestamp(Date transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}

	/**
	 * Returns the amount.
	 * 
	 * @return amount
	 */

	public Double getAmount() {
		return amount;
	}

	/**
	 * Set the amount.
	 * 
	 * @param amount
	 *            the new amount
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(transactionId).append(referenceTransactionId)
				.append(transactionTimestamp).append(amount).toHashCode();
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
		Transaction otherObject = ((Transaction) other);
		return new EqualsBuilder().appendSuper(super.equals(otherObject))
				.append(transactionId, otherObject.transactionId)
				.append(referenceTransactionId, otherObject.referenceTransactionId)
				.append(transactionTimestamp, otherObject.transactionTimestamp).append(amount, otherObject.amount)
				.isEquals();
	}

	public String toString() {
		return new ToStringBuilder(this).appendSuper(super.toString()).append("transactionId", transactionId)
				.append("referenceTransactionId", referenceTransactionId)
				.append("transactionTimestamp", transactionTimestamp).append("amount", amount).toString();
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*public Double getAccountDescriptorId() {
		return accountDescriptorId;
	}

	public void setAccountDescriptorId(Double accountDescriptorId) {
		this.accountDescriptorId = accountDescriptorId;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}*/

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

}
