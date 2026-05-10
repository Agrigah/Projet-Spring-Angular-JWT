package org.sid.ebankingbackend.services;

import org.sid.ebankingbackend.dtos.AccountHistoryDto;
import org.sid.ebankingbackend.dtos.AccountOperationDto;
import org.sid.ebankingbackend.dtos.BankAccountDto;
import org.sid.ebankingbackend.dtos.CustmerDto;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.entities.CurrentAccount;
import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.entities.SavingAccount;
import org.sid.ebankingbackend.exceptions.BankAccountNotFoundException;
import org.sid.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
     Customer saveCustomer(Customer customer);
     CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
     SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
     List<Customer> listCustomers();
     BankAccount getBankAccount(String accountId);
     void debit(String accountId, double amount,String description);
     void credit(String accountId, double amount,String description);
     void transfer(String accountIdSource, String accountIdDestination, double amount);
     List<BankAccountDto> bankAccounts();

     CustmerDto getCustmer(Long id) throws CustomerNotFoundException;

     CustmerDto updateCustmer(CustmerDto custmerdto);

     void deleteCustmer(Long id) ;

     List<AccountOperationDto> accountHistory(String accountId);

     AccountHistoryDto getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;


     void saveCustmer(CustmerDto custmerDto);

     List<CustmerDto> listCustmers();

     List<CustmerDto> searchCustmers(String keyword);
}
