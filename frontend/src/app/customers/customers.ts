import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../services/Customer/customers';

@Component({
  selector: 'app-customers',
  imports: [CommonModule],
  templateUrl: './customers.html',
  styleUrl: './customers.css',
})
export class Customers implements OnInit {
  customers: any;
  errorMessage !: object;
  constructor(private customerService: CustomerService) {

  }
  ngOnInit(): void {
    this.customerService.getCustomers().subscribe({ 
      next: (data) => {
        console.log(data);
        this.customers = data;
      },
      error: (err) => {
        console.log(err);
        this.errorMessage = err.message;
      }
    });
  }

}
