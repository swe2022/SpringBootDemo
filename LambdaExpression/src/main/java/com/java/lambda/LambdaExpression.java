package com.java.lambda;

interface Shape {  // Shape in a functional interface
    void draw();
}

// Traditional Polymorphism

//class Rectangle implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("draw method in Rectagle class");
//    }
//}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw method in Circle class");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw method in Square class");
    }
}

public class LambdaExpression {

    public static void main(String args[]) {

        // To have Lambda expression, We first assign it to a variable of the lambda's functional interface
        Shape rectangle = () -> {   // Lambda expression
            System.out.println("draw method executed in Rectangle class");
            // we assigned lambda expression as a value to a reference variable of type of functional interface
        };
//        rectangle.draw();
        // 전통적인 polymorphism 코드 대신에 Shape 타입의 변수 rectangle 에
        // lambda expression 으로 draw() 메쏘드를 구현함 것
        // 즉 object oriented programming 을 functional programming 방식으로 변환한 것

//        print(rectangle);

        // pass lambda expression as an arg to print() method
        // this is how we do functional programming in Java
        print(() -> System.out.println("draw method executed in Rectangle class"));
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
