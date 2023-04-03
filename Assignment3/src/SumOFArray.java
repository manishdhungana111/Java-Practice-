import java.util.Scanner;
public class SumOFArray {
    public void array(){
        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the given string is :" + sum);
    }

}