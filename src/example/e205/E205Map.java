package org.example.e205;


import java.util.HashMap;

public class E205Map {

    public static void main(String[] args) {
        HashMap <String, String> address = new HashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip" ,"22180");
        address.put("Country", "United State");
        var entries=address.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getValue().toUpperCase());
        }







}}
