import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class person {
    int age;
    String name;
    person(int a,String n){
     age = a ;
     name = n ;
}
    public void introduction(){
        System.out.println("Hi my name is " + name + " and I am " + age + " years old ");
    }
}
