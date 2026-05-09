package org.sid.ebankingbackend.mappers;

import org.sid.ebankingbackend.dtos.AccountOperationDto;
import org.sid.ebankingbackend.dtos.CurrentAccountDto;
import org.sid.ebankingbackend.dtos.CustmerDto;
import org.sid.ebankingbackend.dtos.SavingAccountDto;
import org.sid.ebankingbackend.entities.AccountOperation;
import org.sid.ebankingbackend.entities.CurrentAccount;
import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.entities.SavingAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperlmpl {

    public CustmerDto fromcustomer(Customer customer) {
        CustmerDto custmerDto = new CustmerDto();
        BeanUtils.copyProperties(customer, custmerDto);
        return custmerDto;
    }

    public Customer fromcustomerDto(CustmerDto custmerDto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(custmerDto, customer);
        return customer;
    }

    public CurrentAccountDto fromCurrentAccount(CurrentAccount currentAccount) {
        CurrentAccountDto currentAccountDto = new CurrentAccountDto();
        BeanUtils.copyProperties(currentAccount, currentAccountDto);

        currentAccountDto.setCustmerDto(fromcustomer(currentAccount.getCustomer()));
        currentAccountDto.setType(currentAccount.getClass().getSimpleName());

        return currentAccountDto;
    }

    public CurrentAccount fromCurrentAccountDto(CurrentAccountDto currentAccountDto) {
        CurrentAccount currentAccount = new CurrentAccount();
        BeanUtils.copyProperties(currentAccountDto, currentAccount);

        currentAccount.setCustomer(fromcustomerDto(currentAccountDto.getCustmerDto()));

        return currentAccount;
    }

    public SavingAccountDto fromSavingAccount(SavingAccount savingAccount) {
        SavingAccountDto savingAccountDto = new SavingAccountDto();
        BeanUtils.copyProperties(savingAccount, savingAccountDto);

        savingAccountDto.setCustmerDto(fromcustomer(savingAccount.getCustomer()));
        savingAccountDto.setType(savingAccount.getClass().getSimpleName());

        return savingAccountDto;
    }

    public SavingAccount fromSavingAccountDto(SavingAccountDto savingAccountDto) {
        SavingAccount savingAccount = new SavingAccount();
        BeanUtils.copyProperties(savingAccountDto, savingAccount);

        savingAccount.setCustomer(fromcustomerDto(savingAccountDto.getCustmerDto()));

        return savingAccount;
    }

    public AccountOperationDto fromAccountOperation(AccountOperation accountOperation) {
        AccountOperationDto accountOperationDto = new AccountOperationDto();
        BeanUtils.copyProperties(accountOperation, accountOperationDto);
        return accountOperationDto;
    }
}