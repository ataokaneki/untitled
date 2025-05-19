package 復習問題;

public class Review26 {
    public static void main(String[] args) {
        int[] numArray = {9,4,2,6,9,1,8,9};
        int target = 9;
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                count++;
            }
        }
        System.out.println("探索した値："+target);
        System.out.println("一致した数："+count);
    }
}
