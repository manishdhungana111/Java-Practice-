import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int money=1, i=1;
      /*  for(int i=1; i<=10; i++){
            System.out.println(money+ "*" + i);
            money=money*i;
        }
        System.out.println(money); */
     while(i<10){
         money=money*i;
         i++;
     }
     money=money*i;
        System.out.println(money);
    }
}