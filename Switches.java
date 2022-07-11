import java.util.Scanner;

public class Switches{
public static void main(String[] args){
    Scanner ent = new Scanner(System.in);

    System.out.println("Digite um dia da semana:");
    String dia = ent.nextLine();

    switch(dia){
        case "Segunda": System.out.println("É segunda-feira!");
        break;
        case "Terça": System.out.println("É terça-feira!");
        break;
        case "Quarta": System.out.println("É quarta-feira!");
        break;
        case "Quinta": System.out.println("É quinta-feira!");
        break;
        case "Sexta": System.out.println("É sexta-feira!");
        break;
        case "Sábado": System.out.println("É sábado!");
        break;
        case "Domingo": System.out.println("É domingo!");
        break;
        default: System.out.println("Este não é um dia da semana. Favor rever ortografia.");}
    }
}