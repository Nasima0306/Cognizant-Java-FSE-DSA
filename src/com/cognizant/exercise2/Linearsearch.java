package com.cognizant.exercise2;

public class Linearsearch {
    public static Product search(Product[] products,String target){
        for(Product prod:products){
            if(prod.productName.equalsIgnoreCase(target)){
                return prod;
            }
        }
        return null;
    }
}
