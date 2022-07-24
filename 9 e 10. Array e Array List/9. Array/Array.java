import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        /* array = usada pra armazenar vários valores em uma única variável

    //JEITO 1
        String[] carros = {"Camaro","Mustangue","Tesla"};
        carros[0] = "Ferrari";

    //JEITO 2 */
        String[] carros = new String[3];

        carros[0] = "Camaro";
        carros[1] = "Mustangue";
        carros[2] = "Tesla";

        for(int i = 0; i<carros.length; i++){
            System.out.println(carros[i]);}
    }
}