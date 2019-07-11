/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Alamgir.DependencyInj;

/**
 *
 * @author Alamgir Hossain
 */
public class Employee {
    private int roll;
    private String name;
    private PresentAddress pAddress;
    
    public Employee(int roll, String name, PresentAddress pAddress){
        this.name = name;
        this.roll = roll;
        this.pAddress = pAddress;
    }
    
    void show(){
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+roll);
        System.out.println("Address is: "+pAddress);
    }
}
