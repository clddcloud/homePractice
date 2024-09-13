package org.example.e196;

import java.util.*;

public class E196Map {

    public static void main(String[] args) {
        ArrayList <String> HREmployee = new ArrayList<>();
        ArrayList <String> ITEmployee = new ArrayList<>();
        ArrayList <String> FinanceEmployee = new ArrayList<>();
        Map<String, List<String>> company=new LinkedHashMap<>();
        HREmployee.add("Alice");
        HREmployee.add("Bob");
        ITEmployee.add("Charlie");
        ITEmployee.add("David");
        ITEmployee.add("Eve");
        FinanceEmployee.add("Frank");
        FinanceEmployee.add("Grace");
        company.put("HR", HREmployee);
        company.put ("IT", ITEmployee);
        company.put("Finance", FinanceEmployee);
        company.forEach((k,v)-> System.out.println("Department: "+k+" Employees: "+v));
        company.forEach((k,v)-> System.out.println("All Departments:"+k));
        System.out.println("All Employees:"+company.values());


    }
}
