import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
        System.out.print("Digite quantas vezes deseja gerar números aleatórios [1-7]: ");
        int qtd = ent.nextInt();
        System.out.println();
        
        if(qtd <= 7){
        calculaRandom(qtd);
        }else{
            System.out.println("Favor inserir valores de 1 a 7.");
        }
	}
	public static void calculaRandom(int qtd){
	    Random entr = new Random();
	    
	    int soma = 0;
	    int[] n = new int[qtd];
        for(int i = 0; i< qtd; i++){
            int novo = entr.nextInt(11);
            n[i] = novo;
            soma += novo;
        }
        try{
            if(soma == 10){
                for(int i = 0; i< qtd; i++){
                System.out.println(n[i]);
                }
            }
            else{
                calculaRandom(qtd);
            }
        }catch(Exception e){
            calculaRandom(qtd);
        }
	}
}
