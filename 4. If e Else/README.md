<h2> Parte 1 - Conhecendo o IF e Else </h2>
<p> Agora que já sabemos algumas operações básicas, vamos avançar para estruturas condicionais (também chamados de controle de fluxo). Essas estruturas farão com que possamos definir condições no funcionamento de um código. São elas o "<i>if</i>" e o "<i>else</i>". </p>

<p> Suponha que você fez um código para mostrar na na tela uma frase seguindo as seguintes condições: </p>

<br>

<ul>
  <li> Se a idade for menor do que 18, printe "Você é menor de idade; </li>
  <li> Caso contrário, printe "Você é maior de idade". </li>
</ul>

<br>

<p> Utilizaremos o "if" como um "se" e o "else" como um "caso contrário". </p>
<p> <strong> Se </strong> X valor for menor do que 18, [...]", <strong> caso contrário </strong> [...]. Esse é o conceito do "if" e "else". Suas estruturas são feitas da seguinte forma: </p>

```
if(CONDIÇÃO){
  AÇÃO
}
else{
  AÇÃO
}
```
#### Explicação:
  1. CONDIÇÃO: A condição necessária para o código dentro do if prosseguir. Pode-se utilizar os sinais de maior, menor ou igual (<, >, ==)
  > Quando utilizamos apenas um sinal de igual (=), estamos atribuindo/definindo um valor a ele. Já quando utilizamos dois sinais (==), estamos comparando os valores com algo. No caso do if, estaremos sempre comparando, por isso utilizaremos dois sinais de igual (==).
  2. AÇÃO: As ações que o cdigo irá realizar caso a condição seja realizada.
  
<hr>
<h2> Parte 2 - Exemplos </h2>
<p> Agora, vamos para a parte prática dp exemplo inical:
  
<ul>
  <li> Se a idade for menor do que 18, printe "Você é menor de idade; </li>
  <li> Caso contrário, printe "Você é maior de idade". </li>
</ul>

<p> Para isso, utilizaremos o "if" e o "else" junto de alguns conteúdos que vimos em aulas passadas. Veja:

```
int idade = 19;
  
if(idade<18){
  System.out.println("Você é menor de idade");
}
else{
  System.out.println("Você é maior de idade");
}
```
<p> Nesse código, nós apenas transformamos o texto anterior em um "if" e "else". </p>

<hr>
<h2> Parte 3 - Else if </h2>
<p> Tendo visto o "if" e o "else", você deve ter percebido algo: eles colocam apenas uma condição. Entretanto, não precisamos utilizar vários "if" no código para criarmos várias condições; podemos utilizar um comando chamado "else if". Se o "if" é um "se" e o "else" um "caso contrário", podemos dizer que um "else if" é um "caso contrário, se...". </p>
<p> Pegaremos um novo exemplo com algumas condições a mais: </p>

<ul>
  <li> Se a idade for menor do que 14, printe "Você não é uma criança; </li>
  <li> Caso contrário, se a idade for menor do que 13, printe "Você não é um adolescente; </li>
  <li> Caso contrário, se a idade for menor do que 18, printe "Você não é um adulto; </li>
  <li> Caso contrário, se a idade for menor do que 60, printe "Você não é um idoso; </li>
  <li> Caso contrário, printe "Você é um idoso". </li>
</ul>

