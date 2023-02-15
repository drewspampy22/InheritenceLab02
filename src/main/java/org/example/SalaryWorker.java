package org.example;

public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String FName, String LName, String ID, String title, int YOB, double Pay, double annualSalary) {
        super(FName, LName, ID, title, YOB, Pay);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double Pay) {
        return annualSalary / 52;
    }
}
