package com.dzone.albanoj2.example.jenkins;

public class Application {

    public static void main(String[] args) {
        
        Adder adder = new Adder();
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        System.out.println(adder.add(a, b));
    }
}
