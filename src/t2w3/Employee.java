/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2w3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author danie
 */
public abstract class Employee {
    //instance variables
    private final String firstName;
    private final String lastName;
    private int sin=0;
    private LocalDate birth;
    //Constructor
    public Employee( String firstName, String lastName, int sin, LocalDate dob){
        //this refers to the class variable not the local varaible 
        this.firstName=firstName;
        this.lastName=lastName;
        this.sin=sin;
        setBirthday(dob);
        
    }
    /**
     * to string method returns first and last name
     */
    @Override
    public String toString(){
    
    return firstName + " "+ lastName;

    }
    /**
     * allows you to pass a LocalDate and set the employees birthday
     * @param birth
     */
    public void setBirthday(LocalDate birth){
    
        LocalDate today = LocalDate.now();
        int age = Period.between(birth, today).getYears();
        if(age>=15 && age<=90)
            this.birth = birth;
        else 
            throw new IllegalArgumentException("Employees must be 15-90 years old");
    }
    /**
     * returns birthday
     * @return 
     */

    public LocalDate getBirthday(){
    return birth;
}
    /**
     * returns first name
     * @return 
     */

    public String getFirstName() {
        return firstName;
    }
    /**
     * returns last name
     * @return 
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * returns sin
     * @return 
     */
    public int getSin() {
        return sin;
    }
    
    public abstract PayCheque getPaycheck(); 
}
