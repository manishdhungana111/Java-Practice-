public class Main {
    public static void main(String[] args) {
       int[] x={10,20,30,40};
       int[][] y= {{10,20,30,40},
                    {20,90,100,130},
                    {50,30,40,60}};

        //System.out.println(x[1]);

        //for(int i = 0; i<3;i++){
          //  System.out.println(x[i]);
        // }
       // for(int i=0;i<3;i++){
         //   for(int j=0;j<3;j++){
           //     System.out.println(y[i][j]);

                for(int i=0;i< y.length;i++){
                    for(int j=0;j< y[i].length;j++){
                        System.out.println(y[i][j]);
            }
        }
    }

}