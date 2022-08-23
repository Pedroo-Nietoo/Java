import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main{
  public static void main(String[] args){
    ArrayList<Double> numeros = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite suas notas.");
    System.out.println("Aviso: para parar de digitar, pressione 'X'");
    System.out.println();
    
    int i = 0;
    while(input.hasNextDouble()){
        numeros.add(input.nextDouble());
      if(i == 'X'){
        break;
      }
      else{
        continue;
      }
    }
    
    input.close();
    
    System.out.println();
    System.out.println("________________________________");
    System.out.println();
    
    System.out.println("Você digitou: "+numeros);
    
    for(double nota : numeros){
      if(nota <= 10.0 && nota >= 0.0){
        if(nota <=10 && nota >= 8){
          System.out.println("Conceito A!");
        }
        else if(nota <= 7.9 && nota >= 6.0){
          System.out.println("Conceito B~");
        }
        else{
          System.out.println("Conceito C...");
        }
      }
      else{
        System.out.println("Favor inserir nota entre 0 e 10.");
      }
    }
    
    System.out.println("________________________________");
    System.out.println();
    
    System.out.println("A nota máxima foi: "+Collections.max(numeros));
    System.out.println("A nota mínima foi: "+Collections.min(numeros));
    Collections.sort(numeros);
    System.out.println("As notas em ordem crescente são: "+numeros);
  }
}
