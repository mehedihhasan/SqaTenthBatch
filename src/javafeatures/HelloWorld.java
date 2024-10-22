package javafeatures;

public class HelloWorld {
    public static void main(String[] args) {

//        int numOne = 8;
//        int numTwo = 5;
//        int result = numOne*numTwo;
//        System.out.println("Sum of the two number is: " +(result));

        HelloWorld check = new HelloWorld();
        check.method(5,6);


    }
    static void method(int x,int y){
        System.out.println(x*y);
    }
}

