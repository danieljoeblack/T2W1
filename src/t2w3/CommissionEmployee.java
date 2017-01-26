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
public class CommissionEmployee extends Employee {
    private double monthlySales,commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, int sin, LocalDate dob,double comRate) {
        super(firstName, lastName, sin, dob);
        
        monthlySales = 0;
        setCommissionRate(comRate);
    }
    /**
     * This method will validate the commission rate input as an argument and set the instance variable if it is valid
     * @return 
     */
    public void setCommissionRate(double comRate){
        if(comRate>0 && comRate <= 60)
            commissionRate = comRate;
        else 
            throw new IllegalArgumentException("commission must be in the range of 0-60");
    }
    public void recordSales(double newSales){
        if(newSales>0)
            monthlySales += newSales;
        else throw new IllegalArgumentException("Sales must be greater than 0");
    }

    @Override
    public PayCheque getPaycheck() {
        double payAmount = monthlySales * commissionRate/100;
        
        PayCheque newPay = new PayCheque(super.toString(),payAmount,"Commissions");
        
        return newPay;
    }
    
}
