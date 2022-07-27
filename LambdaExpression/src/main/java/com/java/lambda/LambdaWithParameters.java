package com.java.lambda;

interface Addable {
    int addition(int a, int b);
}

//class AddableImpl implements Addable {
//
//    @Override
//    public int addition(int a, int b) {
//        return a+b;
//    }
//}

public class LambdaWithParameters {

    public static void main(String[] args) {
//        Addable added = new AddableImpl();
//        System.out.println(added.addition(1, 2));
        Addable added = (a, b) -> (a+b); // Addable added = (int a, int b) -> (a+b);
        System.out.println(added.addition(10, 4));
    }

}
