package calculadora;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Calculadora {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0");
        
            Object[] options = { "Sim", "Não" };
            int confirmar = JOptionPane.showOptionDialog(null, "Deseja realizar uma operação?", "Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
           
        if(confirmar == 0){
            
        do{
        String selecionar = JOptionPane.showInputDialog(null, "Selecione a operação que deseja realizar: \n\n 1-Adição  2-Subtração  3-Multiplicação \n 4-Divisão  5-Potência  6-Raíz quadrada");
        
        if(selecionar.equals("1") || selecionar.equals("Adição") || selecionar.equals("adição")){
            double soma1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 1º valor a somar"));
            double soma2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 2º valor a somar"));
            double soma = soma1+soma2;
            JOptionPane.showMessageDialog(null, "O resultado da soma é "+soma);}
        
        if(selecionar.equals("2") || selecionar.equals("Subtração") || selecionar.equals("subtração")){
            double subtração1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 1º valor a subtrair"));
            double subtração2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 2º valor a subtrair"));
            double subtração = subtração1-subtração2;
            JOptionPane.showMessageDialog(null, "O resultado da subtração é "+subtração);}
        
        if(selecionar.equals("3") || selecionar.equals("Multiplicação") || selecionar.equals("multiplicação")){
            double multiplicação1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor a ser multiplicado"));
            double multiplicação2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor a multiplicar"));
            double multiplicação = multiplicação1*multiplicação2;
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação é "+multiplicação);}
        
        if(selecionar.equals("4") || selecionar.equals("Divisão") || selecionar.equals("divisão")){
            double divisão1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor a ser dividido"));
            double divisão2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor a dividir"));
            double divisão = divisão1/divisão2;
            JOptionPane.showMessageDialog(null, "O resultado da divisão é "+divisão);}
        
        if(selecionar.equals("5") || selecionar.equals("Potência") || selecionar.equals("potência")){
            int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da base"));
            int potência1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da potência"));
            double potência = Math.pow(base, potência1);
            JOptionPane.showMessageDialog(null, "O resultado da divisão é "+df.format(potência));}
        
        if(selecionar.equals("6") || selecionar.equals("Raíz quadrada") || selecionar.equals("raíz quadrada") || selecionar.equals("Raíz") || selecionar.equals("raíz")){
            int raíz1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor a ser extraída a raíz"));
            double raíz = Math.sqrt(raíz1);
            JOptionPane.showMessageDialog(null, "O resultado da divisão é "+df.format(raíz));}
        
            confirmar = JOptionPane.showOptionDialog(null, "Deseja realizar outra operação?", "Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
        }while(confirmar == 0);}          
    }
}