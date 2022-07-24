public class Operações{
    public static void main(String[] args){
        /*
Sabendo declarar variáveis, podemos partir para o início da programação, através de oerações básicas utilizando tais variáveis aprendidas.

Uitlizaremos os seguintes sinais para as seguintes operações:
+ para soma
- para subtração
* para multiplicação
/ para divisão

Agora, vamos supor que temos uma variável "a" com um valor qualquer e uma outra variável "b" com qualquer outro valor. Para realizarmos as operações, criaremos uma variável "c" que tem como valor a soma das variáveis "a" e "b".

Podemos somar os valores das variáveis através dos sinais aprendidos anteriormente. Entretanto, vale ressaltar que os tipos de variáveis só podem realizar operações com os mesmos tipos (int com int, double com double...). Observe na prática:
*/

int a = 1;
int b = 2;
int c = a+b;
System.out.println(c); //Este comando printará no terminal o que estiver entre parênteses. Neste caso, printará o valor da variável "c" (a+b).

///////////////////////////////////////////////////////
/*Além disso, podemos fazer estas operações com outras variáveis e outros sinais. Observe:*/

double var1 = 12.5;
double var2 = 3.2;
double var3 = var1-var2;
System.out.println(var3);
    }
}