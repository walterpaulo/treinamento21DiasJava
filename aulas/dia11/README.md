## Aula 11 - 13/10/2022 - [Desafio 21 dias em Java](../../README.md)

### POO

Programação orientada a objetos (POO) é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos[(WIKIPÉDIA, 2018)](https://pt.wikipedia.org/wiki/Programa%C3%A7%C3%A3o_orientada_a_objetos).

* encapsulamento -> Acesso à métodos e propriedades
	- public -> permetido para todos classes; 
	- private -> permitido por ela mesma; e
	- protected -> apenas classes do pacote
* herança -> a classe filha herda de classe pai, ou seja, modelo hieraquia.

* get ou set -> "get" visualiza e "set" para alteração;

Refatoração do [exercício 1 do dia 9](../dia9/README.md) para OO
```java
public static void main(String[] args) {
		/*
		 * Autor: Walter Paulo
		 * Date: 10/10/2022
		 * Example: 1 Programação Orientada a Objetos(POO) dia 13 - Desafio 21 dias em
		 * Java
		 * 
		 * Danilo é dono da escola de programação chamada "Torne-se um programador"
		 * O mesmo está precisando de um sistema para cadastrar os seus alunos
		 * alem dos alunos, Danilo quer cadastrar pelo menos 4 notas dos alunos.
		 * Faça um programa que:
		 * 1 - armazene os nomes dos alunos;
		 * 2 - as 4 notas para cada aluno;
		 * 3 - mostre um relatório, da segunte forma
		 *
		 * -----------
		 * Nome: Nome do aluno
		 * Notas: x, F, T
		 * Média: xxx
		 * Situação: (Aprovado || Recuperação || Reprovado)
		 *
		 * Regra para situação:
		 * Se nota >= 7 = Aprovado
		 * Se nota entre 5 e 6 = Recuperação
		 * Se nota < que 5 = Reprovado
		 * 
		 */

		Scanner ler = new Scanner(System.in);

		// Adicionado objeto de Aluno na lista
		List<Aluno> alunos = new ArrayList<Aluno>();

		do {
			// novo objeto para adicionar na lista
			Aluno aluno = new Aluno();
			double soma = 0.0;
			System.out.println("Digite o nome do aluno");
			aluno.setNome(ler.next());
			for (int i = 1; i <= 4; i++) {
				System.out.println("Digite a nota " + i + ": ");
				double nota = ler.nextDouble();
				// adiciona nota
				aluno.getNotas().add(nota);
				soma += nota;
			}

			// adiciona objeto aluno na lista alunos
			alunos.add(aluno);

			System.out.println("Adicionar novo usuário: \nSim ou Não");
			String opcao = ler.next();
			if (opcao.toLowerCase().equals("não") || opcao.toLowerCase().equals("nao"))
				break;

		} while (true);

		System.out.println("#".repeat(10) + "[ Relatório ]" + "#".repeat(10));
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome() + "\n"
					+ "Notas: " + aluno.getNotas() + "\n"
					+ "Média: " + aluno.media() + "\n"
					+ "Situação: " + aluno.situacao() + "\n");
		}
		System.out.println("#".repeat(33) + "\n");
	}

```
* Classe Aluno.java
```java
package br.com.unoinfo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
  // propriedades
  private List<Double> notas;
  private String nome;

  // método para ver o nome
  public String getNome() {
    return nome;
  }

  // método para alterar o nome
  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Double> getNotas() {
    if(this.notas == null)
      this.notas = new ArrayList<Double>();
    
    return notas;
  }

  public void setNotas(List<Double> notas) {
    this.notas = notas;
  }
  public String notasFormatada(){
    String notasSeparadaPorVirgula = "";
    for (Double nota : this.getNotas()) {
      notasSeparadaPorVirgula += nota +", ";
    }
    return notasSeparadaPorVirgula.substring(0, notasSeparadaPorVirgula.length() -1);
  }
  public String situacao(){
    if(this.media() >= 7) return "Aprovado";
    else if(this.media() >= 5 && this.media() <=6) return "Recuperação";
    else return "Reprovado";
  }

  public double media(){
    double calculoMedia = 0;
    for (Double nota : this.getNotas()) {
      calculoMedia += nota;
    }
    return calculoMedia / this.getNotas().size();
  }
  
}


```