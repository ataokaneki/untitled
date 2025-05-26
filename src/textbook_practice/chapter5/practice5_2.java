package textbook_practice.chapter5;

public class practice5_2 {
    public static void main(String[] args) {
        String title = "あほ";
        String address = "241069@std.(略)";
        String text = "addressのスペルミスったカスです";
        email(title, address, text);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
}
