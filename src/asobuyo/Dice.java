package asobuyo;

public class Dice {
    public int d100(){
        int dice = (int)(Math.random()*100+1);
        return dice;
    }

    public int d100(int a){
        int sum = 0;
        for(int i=0; i<a; i++){
            int dice = (int)(Math.random()*100+1);
            sum += dice;
        }
        return sum;
    }
}
