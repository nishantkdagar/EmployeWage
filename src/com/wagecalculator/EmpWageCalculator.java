package com.wagecalculator;

import java.util.Random;

public class EmpWageCalculator {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int employeePay = 20;
    public static final int Required_WORKING_DAYS = 20;
    public static final int TOTAL_WORKING_HOURS = 100;
    public static void computeEmpWage(){
        int totalPay;
        int totalHour;
        int totalEmployeeWage = 0;
        int totalWorkingDays = 0;
        int totalEmployeeHours = 0;
        while (totalEmployeeHours <= TOTAL_WORKING_HOURS && totalWorkingDays <= Required_WORKING_DAYS) {
            for (int day = 1; day <= Required_WORKING_DAYS; day++) {
                Random r = new Random();
                int ec = r.nextInt(3);
                switch (ec) {
                    case IS_FULL_TIME:
                        System.out.println("Employee is present");
                        totalHour = 8;
                        break;
                    case IS_PART_TIME:
                        System.out.println("Employee took half day");
                        totalHour = 4;
                        break;
                    default:
                        totalHour = 0;
                        System.out.println("Employee is absent");
                }

                totalPay = totalHour * employeePay;
                totalEmployeeWage = totalEmployeeWage + totalPay;
                totalEmployeeHours = totalEmployeeHours + totalHour;
                System.out.println("The Total earning of a employee: " + totalPay);
            }

            System.out.println("Employee total income: " + totalEmployeeWage);
            System.out.println("Employee total working hours: " + totalEmployeeHours);
        }
    }
    public static void main(String[] args) {
        computeEmpWage();
    }
}
