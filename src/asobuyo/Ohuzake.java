package asobuyo;

public class Ohuzake {
    public static void main(String[] args) {
        Dice dice = new Dice();
        KeyInput keyInput = new KeyInput();
        System.out.println(dice.d100());

        System.out.print("回数>");
        int a = keyInput.readInt();
        System.out.println(dice.d100(a));
    }
}
