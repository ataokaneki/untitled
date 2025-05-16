package 復習問題;

public class Review8 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        a = (int)b;  //a = b;
        a = (int)10000L;  //a = 10000L;
        b = 10000L;
        b = (int)a;
        float f = 5.94f;  //float f = 5.94;
        short s = 10;
    }
}
