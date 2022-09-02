package calculardeterminante;

import java.util.Scanner;

public class CalcularDeterminante {
    
    static int[][] numeros = new int[3][3];
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
     
            numeros = new int[3][3];
            
            solicitarValores();
                        
            System.out.println();
            print(numeros);
            System.out.println("O determinante é: "+calcularDeterminante());
            
            System.out.println();
            System.out.print("Deseja alterar algum número? [Y][N]\nR: ");
            String resposta = ent.next();
            alterar(resposta);
            
    }
    public static void solicitarValores(){
        Scanner ent = new Scanner(System.in);
        for(int a = 0; a < 3; a++){
                for(int b = 0; b < 3; b++){
                    System.out.print("Digite o valor da posição ["+a+"]["+b+"]: ");
                    numeros[a][b] = ent.nextInt();
                    }
            }
    }
    public static int calcularDeterminante(){
        int diagonalPrincipal = numeros[0][0]*numeros[1][1]*numeros[2][2]+ 
            numeros[0][1]*numeros[1][2]*numeros[2][0]+
            numeros[0][2]*numeros[1][0]*numeros[2][1];
            
            int diagonalSecundaria = numeros[0][2]*numeros[1][1]*numeros[2][0]+
            numeros[0][0]*numeros[1][2]*numeros[2][1]+
            numeros[0][1]*numeros[1][0]*numeros[2][2];
            
            int determinante = diagonalPrincipal-diagonalSecundaria;
            
            if(determinante < 0){
                return determinante = determinante * -1;
            }
            else{
                return determinante;
            }
    }
    public static void alterar(String resposta){
        Scanner ent = new Scanner(System.in);
        System.out.println();
        if(resposta.equals("Y")){
                System.out.print("Qual número deseja alterar?: ");
                int numeroQueroMudar = ent.nextInt();
                System.out.print("Por qual número deseja alterar?: ");
                int numeroVouMudarPor = ent.nextInt();               
                
            for(int a = 0; a < 3; a++){
                for(int b = 0; b < 3; b++){
                    if(numeros[a][b] == numeroQueroMudar){
                        numeros[a][b] = numeroVouMudarPor;
                    }
                }
            }
            System.out.println();
            print(numeros);
            System.out.println("O determinante é: "+calcularDeterminante());
        }  
    }
    public static void print(int[][] tectec){
        String matriz = "Matriz:\n";
        for(int linha = 0; linha < 3; linha++){
                for(int coluna = 0; coluna < 3; coluna++){
                    matriz += tectec[linha][coluna]+" ";
                }
                matriz += "\n";
            }
        System.out.println(matriz);
    }
}
