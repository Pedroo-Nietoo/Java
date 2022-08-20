import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>(); 
        Scanner ent = new Scanner(System.in); 

    System.out.println("Aviso: Para parar de adicionar digite 'X'.");
    System.out.println("Digite numeros legais: ");
    
    int i = 0;
    while (ent.hasNextDouble()){              
        numeros.add(ent.nextDouble());
        
        if (i == 'X'){
           break; 
        }
        else{
            i++;
        }
    } 
    ent.close(); 
    
    System.out.println("----------------------------------------");
    System.out.println("Voce digitou: "+numeros);

    for (double nota : numeros){
        if( (nota <= 10.0) && (nota >= 0.0) ){
            if(nota >= 7.0 ){
                System.out.println("Passou direto;");
            }
            else{
                if(nota >= 5.0 ){
                    System.out.println("Recuperação;");
                }
                else{
                    System.out.println("Reprovado;");
                }
            }
        }
        else{
            System.out.println("Nota inválida...");
        }
    }
        System.out.println("A maior nota foi: "+Collections.max(numeros));
        System.out.println("A menor nota foi: "+Collections.min(numeros));
        
        Collections.sort(numeros);
        System.out.println("Menor para o maior: " +numeros);
        
        Collections.reverse(numeros);
        System.out.println("Maior para o menor: " +numeros); 
	}
}
