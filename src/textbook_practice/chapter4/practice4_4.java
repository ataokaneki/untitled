package textbook_practice.chapter4;

public class practice4_4 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int a : numbers){
            if(input == a){
                System.out.println("アタリ！");
            }
        }
    }
}
