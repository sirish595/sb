/**
 * 
 */
package com.doj.web;

import java.util.List;

/**
 * @author sirish
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
