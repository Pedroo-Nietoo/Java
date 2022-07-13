<p> Vimos durante as aulas anteriores que os valores das variáveis apareceram no termianl através de alguns comandos. <br> <br>
<i> Mas como isso ocorre? </i> <br>
<i> Quais comandos podems utilizar para realizar isso? </i> <br>
<p> Por enquanto iremos utilizar apenas dois comandos para printar estes valores na tela. São eles: </p>

```
System.out.print();
System.out.println();
```

O comando "System.out.print();" printa na mesma linha, enquanto o System.out.println(); printa  em uma linha diferente. Podemos printar tanto um texto, o colocando entre aspas quanto variáveis, colocando o nome das mesmas dentro dos parênteses. Veja: </p>

```
int a = 1;
System.out.println("Hello World!");
System.out.print(a);
```
> 🖥 Resultado no terminal: Hello World! <br>
> 🖥 Resultado no terminal: 1

<br>

<p> Podemos também adicionar o valor de variaveis junto com os textos, unindo os dois em um só comando. para isso, utilizamos a expressão "+" seguida do nome da variável. Veja: </p>

```
int var1 = 1;
System.out.println("Hello World!");
System.out.print("O número é "+var1);
```
> 🖥 Resultado no terminal: Hello World! <br>
> 🖥 Resultado no terminal: O número é 1

<br>

<p> Caso queira pôr a variável no meio do texto, basta fechar as aspas, pôr o sinal de "+" antes e após a variável e abrir aspas novamente, continuando assim o seu texto. </p> 

```
int var1 = 1;
System.out.print("O número "+var1+" é meu número favorito!");
```
> 🖥 Resultado no terminal: O número é 1 meu número favorito!

<br> <hr>

> 🏆 Ralize os exercícios, confira o gabarito e vá para a próxima aula.
<a href="https://github.com/Pedroo-Nietoo/Java/tree/main/4.%20If%20e%20Else"> Próxima aula >>> </a>
