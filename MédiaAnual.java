import java.text.DecimalFormat;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = ent.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = ent.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = ent.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = ent.nextDouble();
        
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        
        double media = calcularMedia(nota1, nota2, nota3, nota4);
        
        if(aprovado(media) == true){
            System.out.println("O aluno foi aprovado com média "+df.format(media));}
            
        else{
            System.out.println("O aluno foi reprovado com média "+df.format(media));}
    }
    
    public static double calcularMedia(double a, double b, double c, double d){
        return (a+b+c+d)/4;
    }
    
    public static boolean aprovado(double media){
        if(media >= 7.0){
            return true;}
            
        else{
            return false;}}
}
