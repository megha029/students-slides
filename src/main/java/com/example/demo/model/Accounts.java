
package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Accounts implements Serializable
{

    final static long serialVersionUID = -269080150018470403L;
    private Long total;
    private Long totalPages;
    private Long page;
    private List<Account> account = new ArrayList<Account>();

    /**
     * Creates a new Accounts.
     * 
     */
    public Accounts() {
        super();
    }

    /**
     * Creates a new Accounts.
     * 
     */
    public Accounts(Long total, Long totalPages, Long page, List<Account> account) {
        super();
        this.total = total;
        this.totalPages = totalPages;
        this.page = page;
        this.account = account;
    }

    /**
     * Returns the total.
     * 
     * @return
     *     total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Set the total.
     * 
     * @param total
     *     the new total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * Returns the totalPages.
     * 
     * @return
     *     totalPages
     */
    public Long getTotalPages() {
        return totalPages;
    }

    /**
     * Set the totalPages.
     * 
     * @param totalPages
     *     the new totalPages
     */
    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Returns the page.
     * 
     * @return
     *     page
     */
    public Long getPage() {
        return page;
    }

    /**
     * Set the page.
     * 
     * @param page
     *     the new page
     */
    public void setPage(Long page) {
        this.page = page;
    }

    /**
     * Returns the account.
     * 
     * @return
     *     account
     */
    public List<Account> getAccount() {
        return account;
    }

    /**
     * Set the account.
     * 
     * @param account
     *     the new account
     */
    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(total).append(totalPages).append(page).append(account).toHashCode();
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
        Accounts otherObject = ((Accounts) other);
        return new EqualsBuilder().append(total, otherObject.total).append(totalPages, otherObject.totalPages).append(page, otherObject.page).append(account, otherObject.account).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).append("total", total).append("totalPages", totalPages).append("page", page).append("account", account).toString();
    }

}
