## Aula 4 - [Desafio 21 dias em Java](../../README.md)

### Novo projeto

[Ver código](../dia4/ecommerce_console/)
```s
mvn archetype:generate                                  \
  -DinteractiveMode=false                               \
  -DarchetypeArtifactId=maven-archetype-quickstart      \
  -DarchetypeVersion=1.4                                \
  -DgroupId=br.com.unoinfo                           \
  -DartifactId=ecommerce_console 

```

### Exercício 1 

```s
/*
    	 * Exercicio 1
    	 * João é um professor de matemática e precisa de um programa
    	 * que faça o calculo da seguinte expressão:
    	 * 
    	 * (x * 8 +  y) - x + y / 100
    	 * 
    	 * Faça um programa que resolva o problema da expressão que o João
    	 * precisa.
    	 */

       	    	Scanner ler = new Scanner(System.in);
	    	System.out.println( "==============[ Bem Vindo ]=============");
	    	System.out.println( "Digite o valor de x:");
	    	Double x = ler.nextDouble();
	    	System.out.println( "Digite o valor de y:");
	    	Double y = ler.nextDouble();
	    	
	    	var calculo = (x * 8 +  y) - x + y / 100;
	    	
	    	System.out.println( "============================");
	    	System.out.println( "O resultado é "+ calculo);
	    	System.out.println( "============================");
```
[Acessar código](./ecommerce_console/)

### Java Data Types

Data Type 	Size 	Description
|byte |	1 byte 	Stores whole numbers from -128 to 127
| ------------- | ------------- |
|short |	2 bytes 	Stores whole numbers from -32,768 to 32,767
| ------------- | ------------- |
|int |	4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
| ------------- | ------------- |
|long |	8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
| ------------- | ------------- |
|float |	4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
| ------------- | ------------- |
|double |	8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
| ------------- | ------------- |
|boolean |	1 bit 	Stores true or false values
| ------------- | ------------- |
|char |	2 bytes 	Stores a single character/letter or ASCII values
