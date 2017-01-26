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
public class HourlyEmployee extends Employee {
    private double hoursWorked, hourlyRate;
    private final double MINIMUMWAGE = 11.40;
    
    public HourlyEmployee(String firstName, String lastName, int sin, LocalDate dob, double hourlyRate) {
        super(firstName, lastName, sin, dob);
        hoursWorked=0;
        setHourlyRate(hourlyRate);
    }

    @Override
    public PayCheque getPaycheck() {
        double payAmount = hourlyRate*hoursWorked;
        
        PayCheque newPay = new PayCheque(super.toString(),payAmount, "Hourly Pay");
        hoursWorked=0;
        return newPay;
    }

    /**
     * this method will ensure that the employee is being paid at least minimum wage and set the hourlyRate
     * @param newPayRate
     */
    public void setHourlyRate(double newPayRate){
        if(newPayRate>=MINIMUMWAGE)
            hourlyRate = newPayRate;
        else
            throw new IllegalArgumentException("The hourly rate must be greater than or equal to"+MINIMUMWAGE);
    }
    /**
     * This method will receive a double that represents the hours worked. it will validate it to be in the range 1-16 and add it to the hors worked 
     */
    public void recordHoursWorked(double hrsWorked){
        if(hrsWorked<1 || hrsWorked<16)
            hoursWorked+=hrsWorked;
        else
            throw new IllegalArgumentException("Hours must be between 1-16 hours");
    }
}
