public class StringLearning {
    public static void main(String[] args) {
        String name ="Manish";
        name +=  " Dhungana";
        System.out.println(name);

        String name2 = new String("Hello world");
        System.out.println(name2);

        StringBuffer name3= new StringBuffer("Mansih");
        name3.append(" Dhungana");
        System.out.println(name3);
    }
}