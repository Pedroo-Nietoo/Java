import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        
        System.out.println("Aviso: Para cancelar a adição de números, digite 'X'.");
        System.out.println("Digite seus números:");
        
        double pare = 0;
        while(ent.hasNextDouble()){
            numeros.add(ent.nextDouble());
            
            if(pare == 'X'){
                break;
            }
            else{
                pare++;
                continue;
            }
        }
        
        ent.close();
        
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
        
        System.out.println("Você digitou os segintes números: "+numeros);
        System.out.println("A maior nota foi: "+Collections.max(numeros));
        System.out.println("A menor nota foi: "+Collections.min(numeros));
        
        for(double nota : numeros){
            if((nota<= 10.0) && (nota>=0.0)){
                if(nota>=7.0){
                    System.out.println("Aprovado!");
                }
                else{
                    System.out.println("Reprovado...");
                }
            }
            else{
                System.out.println("Nota inválida.");
            }
        }
	}
}
