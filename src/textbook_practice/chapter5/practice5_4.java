package textbook_practice.chapter5;

public class practice5_4 {
    public static void main(String[] args) {
        double bottom = 10.0;
        double height = 5.0;
        double area = calcTriangleArea(bottom,height);
        System.out.println(area+"cm²");

        double radius = 5.0;
        area = calcCircleArea(radius);
        System.out.println(area+"cm²");  //小数第1位で四捨五入する方法結局わからん
    }

    public static double calcTriangleArea(double bottom, double height){
        return bottom*height;
    }

    public static double calcCircleArea(double radius){
        return Math.PI*radius*radius;
    }
}
