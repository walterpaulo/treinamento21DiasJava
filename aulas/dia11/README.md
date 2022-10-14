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

### Exercicio E-commerce

#### App.java

```java
	public static void main(String[] args) {
		/*
		 * Autor: Walter Paulo
		 * Date: 13/10/2022
		 * Exercise: 2 Programação Orientada a Objetos(POO) dia 13 - Desafio 21 dias em
		 * Java
		 * 
		 * Carla precisa de um ecommerce, este e-commerce vai ter as seguintes funções
		 * 
		 * - Cadastro de produtos;
		 * - Cadastro de cliente;
		 * - Cadastro de peditos;
		 * - Relatório de pedidos de clientes;
		 * - Sair
		 * 
		 * 
		 * Produto: (id, nome, descricao, preco);
		 * Cliente: (id, nome, telefone, endereço)
		 * Pedido: (id, clienteId, produto[], valorTotal())
		 * 
		 */
		List<Pedido> pedidos = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		System.out.println("\n"+"-".repeat(10)+"[ Pedidos - Online ]"+"-".repeat(10));

		do {

			Pedido novo = new Pedido();
			novo.setId(pedidos.size()+1);

			Cliente cliente = new Cliente();
			System.out.println("Digite o nome do Cliente:");
			cliente.setNome(ler.next());

			System.out.println("Digite o telefone:");
			cliente.setTelefone(ler.next());

			System.out.println("Digite o endereço:");
			cliente.setEndereco(ler.next());

			novo.setCliente(cliente);
			System.out.println("\n"+"-".repeat(10) + "[ Produto ]" + "-".repeat(10));

				do {

					Produto produto = new Produto();
					produto.setId(novo.getProdutos().size() + 1);
					System.out.println("Digite o nome do produto:");
					produto.setNome(ler.next());
					System.out.println("Digite a descrição:");
					produto.setDescricao(ler.next());
					System.out.println("Digite o preço:");
					produto.setPreco(ler.nextDouble());

					novo.getProdutos().add(produto);
					System.out.println("\n"+"-".repeat(10)+"[ Pedidos ]"+"-".repeat(10));
					System.out.println("Adicionar outro produto?\n0 - para continuar\n1 - para fechar o carrinho");
					int opcao = ler.nextInt();
					if(opcao == 1)
						break;
				} while (true);
				
			pedidos.add(novo);
			System.out.println("\n"+"-".repeat(10)+"[ Pedidos ]"+"-".repeat(10));
			System.out.println("Adicionar outro pedido?\n0 - para continuar)\n1 - para sair");
			int opcao = ler.nextInt();
			if (opcao == 0)
				continue;
			if (opcao == 1){
				break;
			}
		} while (true);

		System.out.println("\n"+"-".repeat(10)+"[ Pedidos - Relatórios ]"+"-".repeat(10));
		for(Pedido pedido : pedidos){
			pedido.imprimirPedido();
		}
		System.out.println("-".repeat(10)+"[ fim ]"+"-".repeat(10));

	}
```

#### Produto.java

```java

package br.com.unoinfo;

public class Produto {
  private int id;
  private String nome;
  private String descricao;
  private double preco;
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getNome() {
    return nome;
  }
 
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getDescricao() {
    return descricao;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public double getPreco() {
    return preco;
  }
  
  public void setPreco(double preco) {
    this.preco = preco;
  }

}

```

#### Cliente.java

```java
package br.com.unoinfo;

public class Cliente {
  private String id;
  private String nome;
  private String telefone;
  private String endereco;
 
  public String getId() {
    return id;
  }
 
  public void setId(String id) {
    this.id = id;
  }
 
  public String getNome() {
    if(this.nome == null)
      this.nome = "Consumidor Não Identificado";
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getTelefone() {
    if(this.telefone == null)
      this.telefone = "( )   -";
    return telefone;
  }
  
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  
  public String getEndereco() {
    if(this.endereco == null)
      this.endereco = " ";
    return endereco;
  }
  
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}

```

#### Pedido.java

```java
package br.com.unoinfo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private int id;
  private Cliente cliente;
  private List<Produto> produtos;
  private double valorTotal;
  
  public int getId() {
    return id;
  }

 
  public void setId(int id) {
    this.id = id;
  }
 
  public Cliente getCliente() {
    return cliente;
  }
  
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
  public List<Produto> getProdutos() {
    if(this.produtos == null){
      this.produtos = new ArrayList<Produto>();
    }
    return produtos;
  }
 
  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }
  
  public double getValorTotal() {
    for(Produto produto : this.getProdutos()){
      this.setValorTotal(produto.getPreco());
    }
    return valorTotal;
  }
  
  public void setValorTotal(double valorTotal) {
    this.valorTotal += valorTotal;
  }

  public void imprimirPedido(){
    DecimalFormat moedaBr = new DecimalFormat("#,###,###,##0.00");
				System.out.println("\nCódigo: "+this.getId() + "\n"
        +"Consumidor:" + this.getCliente().getNome() + "\n"
				+ "Telefone: " + this.getCliente().getTelefone() + "\n"
				+ "Endereço: " + this.getCliente().getEndereco() + "\n");
				
				System.out.println("-".repeat(40) + "\nITEM     NOME     DESCRICAO     VALOR\n" + "-".repeat(40));
				for (Produto prod : this.getProdutos()) {
					System.out.println(prod.getId() + " ".repeat(4) + prod.getNome() + " ".repeat(4)
					+ prod.getDescricao() + " ".repeat(4) + prod.getPreco());
				}
				System.out.println("\nQtd. Total de Itens" + " ".repeat(18) + this.produtos.size() + "");
				System.out.println("Valor Total (R$)" + " ".repeat(20) + moedaBr.format(getValorTotal()) + "\n");
  }

}

```