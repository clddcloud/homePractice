package org.example.e209;

import java.util.*;

public class E209Map {
    public static Double asDouble(Object o) {
        Double val = null;
        if (o instanceof Number) {
            val = ((Number) o).doubleValue();
        }
        return val;
    }

    public static void main(String[] args) {
        List<Map<String,Object>> dataList=new ArrayList<>();
        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10.0);
        dataList.add(appleMap);
        Map<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10.0);
        dataList.add(orangeMap);
        double subTotal=0;
        for (var map:dataList) {
            double tmp=1;
            var entries=map.entrySet();
                for (var entry:entries){
                    String key=entry.getKey();
                    System.out.print(key+": "+entry.getValue()+" ");
                    if (key.equals("Price") || key.equals("Quantity")){
                        tmp*=asDouble(entry.getValue());
                    }
                }
            System.out.print("SubTotal: "+tmp);
            System.out.println("");
            System.out.println("");
            subTotal+=tmp;
            }
        System.out.println("Your Purchase total : "+subTotal);
        }


        }

