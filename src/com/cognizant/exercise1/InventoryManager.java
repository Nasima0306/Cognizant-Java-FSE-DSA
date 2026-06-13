package com.cognizant.exercise1;

import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer,Product>inventory=new HashMap<>();

    public void addProduct(Product product){
        inventory.put(product.getProductId(),product);
        System.out.println("Product Added");
    }

    public void updateProduct(int productId,int quantity,double price){
        Product product=inventory.get(productId);
        if(product !=null){
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("product updated successfully");
        }
        else{
            System.out.println("product not found");
        }
    }
    public void deleteProduct(int productId){
        Product product=inventory.get(productId);
        if(product !=null){
            System.out.println("product deleted successfully");

        }
        else{
            System.out.println("product not found");
        }
    }
    public void display(){
        if(inventory.isEmpty()){
            System.out.println("empty");
            return;
        }
        else{
            for(Product pro: inventory.values()){
                System.out.println(pro);
            }
        }
    }

}
