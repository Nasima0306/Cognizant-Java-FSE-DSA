package com.cognizant.exercise6;

public class BookBinarySearch {
    public static Book search(Book[] books, String title){
        int low=0;
        int high=books.length-1;
        while(low<high){
            int mid=(low+high)/2;
            int comparison=books[mid].title.compareToIgnoreCase(title);
            if(comparison==0){
                return books[mid];
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
