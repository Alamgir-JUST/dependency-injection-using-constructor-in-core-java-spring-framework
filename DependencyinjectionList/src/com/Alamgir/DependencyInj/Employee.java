/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Alamgir.DependencyInj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alamgir Hossain
 */
public class Employee {
    private int roll;
    private String name;
    private List<PresentAddress> pAddress;

    public Employee(int roll, String name, List<PresentAddress> pAddress) {
        this.roll = roll;
        this.name = name;
        this.pAddress = pAddress;
    }
    
    
    
    void show(){
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+roll);
        System.out.println("Address: ");
        Iterator<PresentAddress> it =  pAddress.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(pAddress);  
    }
}
