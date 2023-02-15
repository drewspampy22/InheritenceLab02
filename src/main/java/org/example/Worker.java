package org.example;

public class Worker extends Person {
    private double Pay;


    public Worker(String FName, String LName, String ID, String title, int YOB, double Pay){
        super(FName, LName, ID, title, YOB);
        this.Pay = Pay;
    }
    public double calculateWeeklyPay (double hoursWorked)
    {
        double overtime = 0;
        double pay = 0;
        if(hoursWorked > 40)
        {

            overtime = hoursWorked - 40;
            pay = (40 * Pay) + (overtime * (Pay * 1.5));
            return pay;
        } else pay = hoursWorked * Pay;
        return pay;
    }
    public String displayWeeklyPay (double hoursWorked) {
        double overtime = 0;
        double regTime =0;
        double pay = 0;
        if(hoursWorked > 40)
        {
            regTime = 40;
            overtime = hoursWorked - 40;
            pay = (40 * Pay) + (overtime * Pay * 1.5);
        } else {
            regTime = hoursWorked;
            pay = hoursWorked * Pay;
        }
        return "Regular hours worked: " + regTime + " at a rate of " + Pay + " for a total of " + (regTime * Pay) + ". \nOvertime hours: " + overtime + " at a rate of " + (Pay * 1.5) + " for a total of " + (overtime * (Pay * 1.5)) + ". \n Total combined pay is: " + pay;
    }
}