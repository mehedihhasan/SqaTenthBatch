package oopfeatures;

public class Student {

    String name;
    int id;

    public void nameId(String stdName,int stdId){
        this.name = stdName;
        this.id = stdId;
        System.out.println("Student Name: "+name);
        System.out.println("Student Id: "+id);
    }
//    public void displayInformation(){
//        System.out.println("Student Name: "+name);
//        System.out.println("Student Id: "+id);
//    }
}
