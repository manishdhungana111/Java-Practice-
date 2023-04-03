public class Average {
    int num1,num2,num3;
    Average(int a, int b, int c){
        num1 = a ;
        num2 = b;
        num3 = c;
    }
    public void average(){
        int avg = (num1+num2+num3)/2;
        System.out.println("The average of given three number is : " + avg);
    }
}
