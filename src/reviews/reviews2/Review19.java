package reviews.reviews2;

public class Review19 {
    public static void main(String[] args) {
        int num = 8;
        int count = 1;
        int factorial = 1;
        while(count <= num) {
            factorial = factorial * count;
            count++;
        }
        System.out.println("結果："+factorial);
    }
}
