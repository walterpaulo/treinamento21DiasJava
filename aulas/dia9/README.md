## Aula 9 - 11/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Arrays

usados para armazenar vários valores em uma única variável, em vez de declarar variáveis separadas para cada valor.

```java
/*
    	 * Autor: Walter Paulo
    	 * Date: 10/10/2022
    	 * Example: Array do dia 9 - Desafio 21 dias em Java
    	 * 
    	 * 
    	 */
   	// Array deve informar o limite, receberá dois valores neste exemplo
    	String[] nomes = {"",""};
    	
    	Scanner ler = new Scanner(System.in);
    	
	    System.out.println("Digite o nome 1");
	    var nome1 = ler.next();
	    nomes[0] = nome1;
	    
	    System.out.println("Digite o nome 2");
	    var nome2 = ler.next();
	    nomes[1] = nome2;
	    
	    for(String nome : nomes) {
	    	System.out.println(nome);
	    }
```
* Exemplo
* Quando implemento uma coleção de dados prefiro o Array List:
```java
/*
    	 * Autor: Walter Paulo
    	 * Date: 10/10/2022
    	 * Example: Array List do dia 9 - Desafio 21 dias em Java
    	 * 
    	 * 
    	 */
//    	Array List não precisa o limite
    	List<String> nomes = new ArrayList<String>();
    	
    	Scanner ler = new Scanner(System.in);
    	
			// pegar o valor no nome 1
	    System.out.println("Digite o nome 1");
	    var nome1 = ler.next();

			// adicionando o nome 1 no array
	    nomes.add(nome1);
	    
			// pegar o valor no nome 2
	    System.out.println("Digite o nome 2");
	    var nome2 = ler.next();
	    nomes.add(nome2);
	    
			// imprime os nomes
	    for(String nome : nomes) {
	    	System.out.println(nome);
	    }
	    
```
* Exercício 2
```java
/*
    	 * Autor: Walter Paulo
    	 * Date: 10/10/2022
    	 * Exercise: 2 Array List do dia 9 - Desafio 21 dias em Java
    	 * 
    	 * 
    	 * Faça um programa para armazenar valores (double) em um array
    	 * no final do programa mostre o resultado da multiplicação dos valares
    	 * e o resultado da soma dos valores
    	 * 
    	 */
    	Scanner ler = new Scanner(System.in);
    	List<String> nomes = new ArrayList<String>();
    	for (int i = 1; i <= 5; i++) {
    		System.out.println("Digite o nome "+i+": ");
    		nomes.add(ler.next());
			}
    	System.out.println("#".repeat(10)+"[ Resultado ]"+"#".repeat(10)+"\n");
    	for(String nome: nomes) {
    		System.out.println("Nome: "+nome);
    	}
```
* Exercício 1
```java
    
   public static void main( String[] args )
    {
	    
    	/*
    	 * Autor: Walter Paulo
    	 * Date: 10/10/2022
    	 * Exercise: 1 Array List do dia 9 - Desafio 21 dias em Java
    	 * 
    	 * 
    	 * Faça um programa para armazenar valores (double) em um array
    	 * no final do programa mostre o resultado da multiplicação dos valares
    	 * e o resultado da soma dos valores
    	 * 
    	 */
//    	Array List não precisa o limite
    	List<Double> numeros = new ArrayList<Double>();
    	
    	Scanner ler = new Scanner(System.in);
    	
    	while(true) {
    		System.out.println("#".repeat(10)+"[ Programa Soma e Multiplica ]"+"#".repeat(10)+"\n\nDigite o um número\nou 0 para sair");
    		var numero = ler.nextDouble();
    		
    		if(numero == 0)
    			break;
    		
    		numeros.add(numero);
    	}
	    
    	double somar = 0.0;
    	double multiplicacao = 0.0;
    	
    	for(Double numero : numeros) {
    		somar += numero;
    		if(numeros.size() != 0) {
    			multiplicacao *= numero;
    		}else {
    			multiplicacao = numero;
    		}
    	}
    	
    	
	    System.out.println("#".repeat(20)+"\n\nSomar: "+somar+"\nMultiplicação: "+multiplicacao+"\n\n"+"#".repeat(20));
	    
	    
    }
```