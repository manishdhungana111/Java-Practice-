public class permutation {
    public static void main(String[] args){
    {
        int[] number = {0,2,1,5,3,4};
        int [] answer = new int[number.length];

        for (int i=0; i< number.length;i++){
            answer[i]= number[number[i]];
        }
        System.out.print("Input = ");
        for (int i=0; i< number.length;i++){
            System.out.print(number[i]);
        }
        System.out.print("Answer = ");
        for (int i=0; i< number.length;i++){
            System.out.print(answer[i]);
        }

        }
    }
}
