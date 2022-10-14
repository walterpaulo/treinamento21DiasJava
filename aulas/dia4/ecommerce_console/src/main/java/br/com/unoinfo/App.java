package br.com.unoinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/*
		 * Autor: Walter Paulo
		 * Date: 13/10/2022
		 * Exercise: 2 Programação Orientada a Objetos(POO) dia 13 - Desafio 21 dias em
		 * Java
		 * 
		 * Carla precisa de um ecommerce, este ecommerce vai ter as seguintes funções
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

}
