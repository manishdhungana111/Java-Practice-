import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //Shape obj = new Shape(10,20);
        //Shape obj1 = new Shape (50,60);
        //System.out.println("Width of Shape is : " + obj.width);
        //System.out.println("Height of Shape is : " + obj.height);
        //obj.area();
        //obj1.area();
        //person obj = new person(20, "Manish Dhungana");
        //obj.introduction();

        // Perimeter, semi-perimeter, area of triangle
        // Triangle obj = new Triangle(3,4,5);
        //obj.perimeter();
        //obj.semiperimeter();
        //obj.area();

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three number of your choice : ");
        int a,b,c;
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        Average avg = new Average(a,b,c);
        avg.average();
    }
}