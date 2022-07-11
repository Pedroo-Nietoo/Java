import java.util.Scanner;

public class LogicalOperators{
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        System.out.println("Você está jogando um jogo! Pressione q ou Q para sair:");

        String resposta = ent.nextLine();

        if(resposta.equals("q") || resposta.equals("Q")){
            System.out.print("Você saiu.");}
        
        else{System.out.print("Você ainda está jogando. PEW PEW!");}
    }
}