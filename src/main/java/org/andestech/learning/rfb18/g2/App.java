package org.andestech.learning.rfb18.g2;


public class App 
{
    public static void main( String[] args )
    {

     Account acc1 = new Account(122, 10);
     System.out.println(acc1);
     System.out.println(acc1.getAccountString());

     Customer customer =
             new Customer();
     customer.sname="Robot";
     customer.name="Verter";

     CustomerAccount customerAccount =
     new CustomerAccount(7711, 1000, customer);

     System.out.println(customerAccount.getAccountString());

     System.out.println(customerAccount);
    }
}
