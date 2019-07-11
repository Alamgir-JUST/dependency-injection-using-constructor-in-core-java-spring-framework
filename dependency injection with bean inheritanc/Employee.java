/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Alamgir.BeanSetter;


/**
 *
 * @author Alamgir Hossain
 */
public class Employee {
    private Address address1;
    private Address address2;

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }
    public void show(){
      System.out.println(address1);
      System.out.println(address2);
    }
}
