import java.util.Random;

public class GeneratingRandomNumbers{
   public static void main(String[] args){

        Random entr = new Random();

        int x = entr.nextInt(6)+1;
        System.out.println(x);
   }
}