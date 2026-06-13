package com.cognizant.exercise3;

public class Quicksort {
    public static void sort(Order[] orders, int low, int high){
        while(low<high){
            int pivotindex=partition(orders,low,high);
            sort(orders,low,pivotindex-1);
            sort(orders,pivotindex+1,high);
        }
    }
    static int partition(Order[]orders,int low,int high){
        double pivot=orders[high].totalPrice;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(orders[j].totalPrice<pivot){
                 i++;
                 Order temp=orders[i];
                 orders[i]=orders[j];
                 orders[j]=temp;

            }
            Order temp=orders[i+1];
            orders[i+1]=orders[high];
            orders[high]=temp;
        }
        return i+1;
    }

}
