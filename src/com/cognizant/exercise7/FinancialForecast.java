package com.cognizant.exercise7;

public class FinancialForecast {
    public static double forecast(double presentvalue, double growthrate, int years){
        if(years==0){
            return presentvalue;
        }
        return forecast(presentvalue,growthrate,years-1)*(1+growthrate);
    }
    public static void main(String[]args){
        double presentvalue=1000;
        double growthrate=0.10;
        int years=3;
        double futurevalue=forecast(presentvalue,growthrate,years);
        System.out.println(futurevalue);
    }
}
