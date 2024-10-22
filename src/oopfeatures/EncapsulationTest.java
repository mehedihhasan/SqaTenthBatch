package oopfeatures;

public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation Encapsulation = new Encapsulation();
        Encapsulation.setAccNo(1921361);
        Encapsulation.setAccName("Mehedi Hasan");


        System.out.println("AccountNo: " +Encapsulation.getAccNo());
        System.out.println("accountName: "+Encapsulation.getAccName());

    }
}
