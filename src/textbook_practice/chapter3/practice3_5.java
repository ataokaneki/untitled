package textbook_practice.chapter3;

import java.io.*;

public class practice3_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更＞");
        int selected = Integer.parseInt(br.readLine());
        switch (selected) {
            case 1:
                System.out.print("検索します");
                break;
            case 2:
                System.out.print("登録します");
                break;
            case 3:
                System.out.print("削除します");
                break;
            case 4:
                System.out.print("変更します");
                break;
        }

    }
}
