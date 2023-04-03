import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] x= new int[10];
        int[]y= {10,20,30};
        System.out.println("X>> " + x);
        System.out.println("Array of X" + x[0]);
        System.out.println("Y>>" + y);
        System.out.println("Array of Y" + y[0]);
        for(int data : y){
            System.out.println(data);
        }
        //array=10;print loop with for
        int[]z ={100,200,300,400,500,600,700,800,900,1000};
        System.out.println("Z>>" + z);
        System.out.println("Array of Z" + z[0]);
        for(int data : z){
            System.out.println(data);
        }
    }
}