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
public class PayCheque {
    private String employeeName,notes;
    private double amount;
    LocalDate dateIssued;
    private int chequeNumber;
    
    private static int nextChequeNumber=1000;

    public PayCheque(String employeeName, double payAmount, String notes) {
        this.employeeName = employeeName;
        this.amount = amount;
        this.notes = notes;
        setPayAmount(payAmount);
        
        chequeNumber = nextChequeNumber;
        nextChequeNumber++;
    }
    /**
     * sets the payAmount when called to what is passed
     * @param payAmount 
     */
    private void setPayAmount(double payAmount){
        if(payAmount > 0)
            amount = payAmount;
        else
            throw new IllegalArgumentException("Pay amounts must be above 0");
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getNotes() {
        return notes;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }
    @Override
    public String toString(){
    return String.format("Cheque #:%d made out to %s for the amount of $%.3f", chequeNumber,employeeName,amount);
}
    
}
