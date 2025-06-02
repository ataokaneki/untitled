package reviews.reviews3.review29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyInput {
    public String readString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        try{
            inputStr = br.readLine();
        }catch(Exception e){
            System.out.println("ERROR：IOException");
        }
        return inputStr;
    }
}
