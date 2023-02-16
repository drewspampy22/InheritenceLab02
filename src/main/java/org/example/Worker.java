package org.example;

public class Worker extends Person {
    private double hourlyPayRate;


    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate){
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
    public double calculateWeeklyPay(double hoursWorked)
    {
        double overtime = 0;
        double pay = 0;
        if(hoursWorked > 40)
        {

            overtime = hoursWorked - 40;
            pay = (40 * hourlyPayRate) + (overtime * (hourlyPayRate * 1.5));
            return pay;
        } else pay = hoursWorked * hourlyPayRate;
        return pay;
    }
    public String displayWeeklyPay(double hoursWorked) {
        double overtime = 0;
        double regTime =0;
        double pay = 0;
        if(hoursWorked > 40)
        {
            regTime = 40;
            overtime = hoursWorked - 40;
            pay = (40 * hourlyPayRate) + (overtime * hourlyPayRate * 1.5);
        } else {
            regTime = hoursWorked;
            pay = hoursWorked * hourlyPayRate;
        }
        return "Regular hours worked: " + regTime + " at a rate of " + hourlyPayRate + " for a total of " + (regTime * hourlyPayRate) + ". \nOvertime hours: " + overtime + " at a rate of " + (hourlyPayRate * 1.5) + " for a total of " + (overtime * (hourlyPayRate * 1.5)) + ". \n Total combined pay is: " + pay;
    }
}