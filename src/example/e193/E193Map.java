package org.example.e193;


import java.util.HashMap;

public class E193Map {

    public static void main(String[] args) {
        HashMap<Integer, String> books=new HashMap<>();
        books.put (101, "The Catcher in the Rye");
        books.put (102, "To Kill a Mockingbird");
        books.put (103, "1984");
        books.put (104, "The Great Gatsby");
        books.put (105, "Moby Dick");
        System.out.println("Initial number of books in catalog: "+books.size());
        System.out.println("Is the catalog empty? "+books.isEmpty());
        System.out.println("Is book with ID 102 available? "+books.containsKey(102));
        System.out.println("Is the book \"1984\" available? "+books.containsValue("1984"));
        books.remove(105);
        System.out.println("Updated catalog after removing ID 105:");
        books.forEach((k,v)-> System.out.println(k+": "+v));
        books.clear();
        System.out.println("Is the catalog empty after clearing? "+books.isEmpty());

    }

}
