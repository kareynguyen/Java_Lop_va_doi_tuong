package com.company.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw= new StopWatch();
        sw.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println("hi");
        }
        sw.stop();
        System.out.println(sw.getElapsedTime());
    }
}
