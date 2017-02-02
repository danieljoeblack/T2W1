/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2w3;

import java.time.LocalDate;

/**
 *
 * @author danie
 */
    public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, int sin, LocalDate dob,double comRate, double baseSalary) {
        super(firstName,lastName,sin,dob,comRate);
        
        setBaseSalary(baseSalary);
    }
    //will receive a salary and change baseSalary to accepted value
    public void setBaseSalary(double sal){
        baseSalary= sal;
    }
    //returns salary
    public double getBaseSalary() {
        return baseSalary;
    }
    
    @Override
    public PayCheque getPaycheck() {
        double payAmount = super.getCommissionAmount()+baseSalary;
        
        PayCheque newPay = new PayCheque(super.toString(),payAmount,"Commissions");
        
        return newPay;
    }
    
    
}
