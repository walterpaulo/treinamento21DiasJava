## Aula 10 - 12/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Funções

Para explicar os conceitos sobre funções, vou resumir nestas linhas em base [SILVA, 2022](https://caffeinealgorithm.com/blog/funcoes-em-java/): 
* uma função é um pedaço de código organizado e reutilizável que é usado para executar uma única ação relacionada;
* as funções proporcionam uma melhor modularidade e um alto grau de reutilização de código;
* não é possível criar uma função dentro de uma outra função.
* refatorar os códigos;
		

####  Refatorando o [exercício 2 do dia 9](../dia9/README.md)

```java
/*
	 * Autor: Walter Paulo 
	 * Date: 10/10/2022 
	 * Example: 1 funcao dia 10 - Desafio 21 dias em Java
	 * 
	 */
	
	// refatoracao exercicio do dia 9 numero 2
	
	// Esta função captura e retorna uma lista de nomes do tipo String
	public static List<String> capturaNomes() {
		List<String> nomes = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o nome " + i + ": ");
			nomes.add(ler.next());
		}
		ler.close();
		return nomes;
	}

	public static void resultado(List<String> nomes) {
		System.out.println("#".repeat(10) + "[ Resultado ]" + "#".repeat(10) + "\n");
		nomes.forEach(nome -> System.out.print("Nome: " + nome + "\n"));
	}

	public static void main(String[] args) {

		// chamando a funcao e armazena na variavel nomes
		List<String> nomes = capturaNomes();
		resultado(nomes);
	}

```
