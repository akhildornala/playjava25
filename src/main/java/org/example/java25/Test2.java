package org.example.java25;


public class Test2 {


    public static void main(String[] args) {
        String name = "Harry";
        abcd(name);
    }

    public static void abcd(Object obj) {
        if (obj instanceof String s) {
            System.out.println(s.length());
        }

    }
}
