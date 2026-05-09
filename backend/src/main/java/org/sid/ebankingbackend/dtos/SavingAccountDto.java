package org.sid.ebankingbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankingbackend.enums.AccountStatus;

import java.util.Date;
@Data @AllArgsConstructor
@NoArgsConstructor
public class SavingAccountDto extends  BankAccountDto {
    private String id ;
    private double balance ;
    private Date createdAt ;
    private AccountStatus status ;
    private CustmerDto custmerDto ;
    private double intrestRAte ;

    public void setType(String simpleName) {
    }
}
