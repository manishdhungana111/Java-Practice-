import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args){
     {
        Scanner currency = new Scanner(System.in);
        System.out.print("Enter amount in Nepali Rupees: ");
        double npr = currency.nextDouble();
        double usd = npr / 135.03;
        System.out.printf("Equivalent amount in USD: %.2f", usd);
    }
}
}
