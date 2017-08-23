/**
 * 
 */
package com.doj.ms.accounts;

import java.util.List;

/**
 * @author sirish
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
