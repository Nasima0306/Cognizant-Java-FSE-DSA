package com.cognizant.exercise2;

public class BinarySearch {

    public static Product search(Product[]products,String target){
        int low=0;
        int high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int comparison=products[mid].productName.compareToIgnoreCase(target);
            if(comparison==0){
                return products[mid];
            }
            else if(comparison<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return null;

    }
}
