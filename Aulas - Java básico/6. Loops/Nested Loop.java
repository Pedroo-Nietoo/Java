import java.util.Scanner;

public class NestedLoop{
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        //Nested loop = Um loop dentro de um loop
    
        int linhas;
        int colunas;
        String símbolo = "";
    
        System.out.print("Digite a quantidade de linhas: ");
        linhas = ent.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        colunas = ent.nextInt();
        System.out.print("Digite o símbolo para usar: ");
        símbolo = ent.next();
    
        for(int i = 1; i <= linhas; i++){
        System.out.println();
            for(int j = 1; j <= colunas; j++){
            System.out.print(símbolo);}}
    }
}