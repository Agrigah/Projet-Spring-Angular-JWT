package org.sid.ebankingbackend.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sid.ebankingbackend.dtos.CustmerDto;
import org.sid.ebankingbackend.exceptions.CustomerNotFoundException;
import org.sid.ebankingbackend.services.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/custmers")
@AllArgsConstructor
@Slf4j
public class CustmerController {
    private BankAccountService bankAccountService;
    @GetMapping
    public List<CustmerDto> custmers(){
        return bankAccountService.listCustmers();
    }
    @GetMapping("/{id}")
    public CustmerDto getcusCustmer(@PathVariable(name = "id") Long id) throws CustomerNotFoundException, CustomerNotFoundException {
        return  bankAccountService.getCustmer(id);
    }
    @PostMapping
    public CustmerDto saveCustomer(@RequestBody  CustmerDto custmerDto){
        bankAccountService.saveCustmer(custmerDto);
        return custmerDto;
    }
    @PutMapping("/{id}")
    public CustmerDto updateCustmer(@PathVariable(name = "id") Long id ,@RequestBody CustmerDto custmerDto){
        custmerDto.setId(id);
        return bankAccountService.updateCustmer(custmerDto);

    }
    @DeleteMapping("/{id}")
    public void deleteCustmer(@PathVariable(name = "id") Long id) {
        bankAccountService.deleteCustmer(id);
    }

}