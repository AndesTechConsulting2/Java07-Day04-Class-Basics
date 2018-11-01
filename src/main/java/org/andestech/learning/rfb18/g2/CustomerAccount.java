package org.andestech.learning.rfb18.g2;



public class CustomerAccount extends Account {

    Customer customer;

    public CustomerAccount(int id, double ballance)
    {
        super(id,ballance);

    }

    public CustomerAccount(int id, double ballance, Customer customer)
    {
        super(id,ballance);
        this.customer = customer;

    }

    public String getAccountString(){
        return  super.getAccountString() +
                ", Name:" + customer.name +
                ", Sname:" + customer.sname;


    }

    @Override
    public String toString(){
        return getAccountString();
    }


}
