/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Alamgir.DependencyInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Alamgir Hossain
 */
public class EmployeeTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/Alamgir/DependencyInj/applicationContext.xml");
        Employee employee = (Employee)context.getBean("employee");
        employee.show();
    }
}
