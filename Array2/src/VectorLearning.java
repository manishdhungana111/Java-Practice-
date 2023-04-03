import java.util.Vector;

public class VectorLearning {
    //Arrays are like boxes of a fixed size, while Vectors are like expandable boxes
    // that can grow or shrink as needed
    public static void main(String[] args){
        //int[]age = {10,20,30};
        Vector age2 = new Vector(6,5);
        age2.add(10);
        age2.add(20);
        age2.add(30);
        age2.add(40);
        age2.add(50);
        age2.add(60);
        age2.add(70);
        age2.add(80);
        age2.add(90);
        age2.add(100);
        System.out.println(age2);
        System.out.println("Vector age capacity>>" + age2.capacity());
    }
}
