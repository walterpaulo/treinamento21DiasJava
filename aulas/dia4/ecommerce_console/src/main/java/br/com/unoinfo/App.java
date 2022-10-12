package br.com.unoinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    
    	/*
    	 * Autor: Walter Paulo
    	 * Date: 10/10/2022
    	 * Exercise: 2 Array List do dia 9 - Desafio 21 dias em Java
    	 *
    	 *  Danilo é dono da escola de programação chamada "Torne-se um programador"
	     * O mesmo está precisando de um sistema para cadastrar os seus alunos
	     * alem dos alunos, Danilo quer cadastrar pelo menos 4 notas dos alunos.
		 * Faça um programa que:
		 * 1 - armazene os nomes dos alunos;
		 * 2 - as 4 notas para cada aluno;
		 * 3 -  mostre um relatório, da segunte forma
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
    	List<String[]> alunos = new ArrayList<String[]>();
    	
    	do {
//		Coleta
    	String[] dados = new String[7];
    	double soma = 0.0;
    	double media = 0.0;
    	System.out.println("Digite o nome do aluno");
    	dados[0] = ler.next();
    	for(int i = 1; i <= 4; i++) {
    		System.out.println("Digite a nota "+i+": ");
    		dados[i] = ler.next();
    		soma += Double.parseDouble(dados[i]);
    	}
    	
//    	Lógica
    	media = soma / 4 ;
    	dados[6] = String.valueOf(media);
    	if(media >= 7)dados[5] = "Aprovado";
    	else if(media >= 5 && media <= 7)dados[5] = "Recuperação";
    	else dados[5] = "Reprovado";
    	
//    	Armazenamento
    	alunos.add(dados);
    	
//    	adcionação?
    	System.out.println("Adicionar novo usuário: \nSim ou Não");
    	String opcao = ler.next();
    	if(opcao.toLowerCase().equals("não")) break;
    	
    	}while(true);
    	
//    	Visualização
    	System.out.println("#".repeat(10)+"[ Relatório ]"+"#".repeat(10));
    	for(String[] aluno: alunos) {
    		System.out.println("Nome: "+ aluno[0]+"\n"
    				+ "Notas: "+ aluno[1]+", "+aluno[2]+", "+aluno[3]+", "+aluno[4]+"\n"
    				+ "Média: "+aluno[6]+"\n"
    				+ "Situação: "+aluno[5]+"\n");
    	}
    	System.out.println("#".repeat(33)+"\n");
    }    
}
