import { Routes } from '@angular/router';

export const routes: Routes = [
    {path: '', redirectTo: 'home', pathMatch: 'full'},
    {path:"customers", loadComponent: () => import('./customers/customers').then(m => m.Customers)},
    {path:"accounts", loadComponent: () => import('./accounts/accounts').then(m => m.Accounts)},
    {path:"new-customer", loadComponent: () => import('./new-custmer/new-custmer').then(m => m.NewCustmer)},
];
