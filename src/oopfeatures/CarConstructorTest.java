package oopfeatures;

public class CarConstructorTest {
    public static void main(String[] args) {
//        CarConstructor car = new CarConstructor(2012,"Spider");
     int x = CarConstructor.modelYear = 2012;
    String y = CarConstructor.modelName = "Spider";
        System.out.println("Car Model Year: " +x);
        System.out.println("Car Model Name: " +y);




    }
}
