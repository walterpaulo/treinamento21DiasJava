package br.com.unoinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
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

}
