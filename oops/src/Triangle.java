import javax.sound.midi.Soundbank;

//import static jdk.internal.org.jline.utils.Colors.s;

public class Triangle {
    int side1, side2, side3,s;
    Triangle(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public void perimeter(){
        int p = side1 + side2+ side3;
        System.out.println("Perimeter of triangle is : " + p);
    }
    public void semiperimeter(){
         s = (side1+side2+side3) / 2;
        System.out.println("Semi-perimeter of triangle is : " + s );
    }
    public void area(){
        double area = (double) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area of triangle is : " + area);
    }

}
