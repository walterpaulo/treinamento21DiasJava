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
    }    
}
