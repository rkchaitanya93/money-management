package com.moneymanagement.dao;

import com.moneymanagement.exception.CustomException;
import com.moneymanagement.model.Account;
import com.moneymanagement.model.UserTransaction;

import java.math.BigDecimal;
import java.util.List;


public interface AccountDAO {

    List<Account> getAllAccounts() throws CustomException;
    Account getAccountById(long accountId) throws CustomException;
    long createAccount(Account account) throws CustomException;
    int deleteAccountById(long accountId) throws CustomException;

    /**
     *
     * @param accountId user accountId
     * @param deltaAmount amount to be debit(less than 0)/credit(greater than 0).
     * @return no. of rows updated
     */
    int updateAccountBalance(long accountId, BigDecimal deltaAmount) throws CustomException;
    int transferAccountBalance(UserTransaction userTransaction) throws CustomException;
}
