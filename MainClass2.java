package com.company;

public class ThreadClass implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++)
            System.out.println("i - "+i);
    }
}

class MainClass2 {
    public static void main(String args[]) {
        ThreadClass tc = new ThreadClass();
        Thread t=new Thread(tc);
        try {
            t.start();
            System.out.println(t.getName());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}