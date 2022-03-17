package com.company;

public class ThreadClass extends Thread {
    public void start()
    {
        for(int i=0;i<5;i++)
            System.out.println("i - "+i);
    }
}

class MainClass {
    public static void main(String args[]) {
        ThreadClass tc = new ThreadClass();
        try {
            System.out.println(tc.getName());
            tc.start();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}