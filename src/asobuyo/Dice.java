package asobuyo;

public class Dice {
    public int d100(){
        int dice = (int)(Math.random()*100+1);
        return dice;
    }
}
