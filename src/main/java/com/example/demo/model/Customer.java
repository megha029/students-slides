
package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
@Entity
@Table(name="customer")
public class Customer implements Serializable
{

    final static long serialVersionUID = -6610535599397964974L;
    @Id
    @Column(name="customerId")
    private String customerId;
    @Column(name="name")
    private String name;

    /**
     * Creates a new Customer.
     * 
     */
    public Customer() {
        super();
    }

    /**
     * Creates a new Customer.
     * 
     */
    public Customer(String customerId, String name) {
        super();
        this.customerId = customerId;
        this.name = name;
    }

    /**
     * Returns the customerId.
     * 
     * @return
     *     customerId
     */
    @Id
    @Column(name="CustomerId")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Set the customerId.
     * 
     * @param customerId
     *     the new customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Returns the name.
     * 
     * @return
     *     name
     */
    @Id
    @Column(name="name")
    public String getName() {
        return name;
    }

    /**
     * Set the name.
     * 
     * @param name
     *     the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(customerId).append(name).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (this.getClass()!= other.getClass()) {
            return false;
        }
        Customer otherObject = ((Customer) other);
        return new EqualsBuilder().append(customerId, otherObject.customerId).append(name, otherObject.name).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).append("customerId", customerId).append("name", name).toString();
    }

}
