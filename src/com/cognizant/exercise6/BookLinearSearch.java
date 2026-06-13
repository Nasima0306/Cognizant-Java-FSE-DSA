package com.cognizant.exercise6;

public class BookLinearSearch {
    public static Book search(Book[] books, String target){
        for(Book book:books){
            if(book.title.equalsIgnoreCase(target)){
                return book;
            }
        }
        return null;
    }
}
