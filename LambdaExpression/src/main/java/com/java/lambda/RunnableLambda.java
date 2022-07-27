package com.java.lambda;

class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method called ...");
    }
}

public class RunnableLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableDemo());
        thread.start();

//        Runnable runnable = () -> System.out.println("run method called using Lambda Expression...");
//        Thread threadLambda = new Thread(runnable);
        Thread threadLambda = new Thread(() -> System.out.println("run method called using Lambda Expression..."));
        threadLambda.start();

    }
}
