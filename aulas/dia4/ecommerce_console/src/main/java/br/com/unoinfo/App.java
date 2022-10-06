package br.com.unoinfo;

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
    	 * Exercicio 1
    	 * João é um professor de matemática e precisa de um programa
    	 * que faça o calculo da seguinte expressão:
    	 * 
    	 * (x * 8 +  y) - x + y / 100
    	 * 
    	 * Faça um programa que resolva o problema da expressão que o João
    	 * precisa.
    	 */
        // mostre();
        // leia()


    	
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
    	

    }
}
