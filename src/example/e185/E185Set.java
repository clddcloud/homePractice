package org.example.e185;

import java.util.HashSet;

public class E185Set {
    public static void main(String[] args) {
        HashSet<Integer> customerIDs=new HashSet<>();
        customerIDs.add(1001);
        customerIDs.add(1002);
        customerIDs.add(1001);
        customerIDs.add(1003);
        customerIDs.add(1002);
        customerIDs.add(1004);
        customerIDs.forEach(x-> System.out.println(x));
}
}

