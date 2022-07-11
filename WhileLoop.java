import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = ent.nextLine();

        while(nome.isBlank()){
            System.out.print("Digite o seu nome: ");
            nome = ent.nextLine();}

        System.out.print("Olá, "+nome);
    }
}