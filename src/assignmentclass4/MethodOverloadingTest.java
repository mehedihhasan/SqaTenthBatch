package assignmentclass4;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
       int result1= obj.add(5,7);
        System.out.println("Result 1= " +result1);

       int result2= obj.add(5,5,10);
        System.out.println("Result 2= " +result2);

         double result3 = obj.add(7.50,7.50);
        System.out.println("Result 3= " +result3);
    }
}
