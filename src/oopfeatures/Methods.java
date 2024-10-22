package oopfeatures;

public class Methods {
    public static void main(String[] args) {
        int a= 5;
        int b= 7;
        int c;

//        System.out.println("The result is: " +c);
        Methods obj = new Methods();
        c = obj.logic(a,b);
        System.out.println(c);

    }
    public int logic(int x,int y){
        int z;
        z=(x*y);
        return z;
    }



    }

