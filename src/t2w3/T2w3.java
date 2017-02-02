/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2w3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author danie
 */
public class T2w3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HourlyEmployee employee1 = new HourlyEmployee("Daniel","Black",123456789,LocalDate.of(1995, Month.SEPTEMBER,28),25.50);
        CommissionEmployee employee2 = new BasePlusCommissionEmployee("Daniel","Black",123456789,LocalDate.of(1995, Month.SEPTEMBER,28),5,2);

        System.out.println(employee1.toString());
        System.out.println(employee1);
        System.out.printf("The first employee is %s%n",employee1);
        
        System.out.println(employee1.getBirthday());
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getSin());
        employee1.recordHoursWorked(8);
        System.out.println(employee1.getPaycheck());
        
        employee2.recordSales(1000.25);
        System.out.println(employee2.getPaycheck());
        
        

        
    }
    
}
