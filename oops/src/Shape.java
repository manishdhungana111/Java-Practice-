public class Shape {
    int width;
    int height;
    Shape(int w, int h){
        width = w;
        height = h;
    }
    public void area(){
        int area = width * height;
        System.out.println("Area: " + area);
    }
}
