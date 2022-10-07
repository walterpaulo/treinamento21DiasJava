package br.com.unoinfo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    	Scanner ler = new Scanner(System.in);
	    	
    	/*
    	 * Autor: Walter Paulo
    	 * Date: 06/10/2022
    	 * Exercise: 1 do dia 5 - Desafio 21 dias em Java 
    	 */
	    	
    	/*
    	 * 
    	 * João tem um armazem e precisa de um programa que solicite
    	 * o nome do seu cliente
    	 * o endereco do seu cliente
    	 * o nome do material de construcao
    	 * o valor do material de construcao
    	 * e a quantidade que o cliente deseja
    	 * no final do program mostre um relatório com o valor total do produto
    	 * comprado
    	 * se a compra do cliente for maior que 100, fale que ele terá desconto na proxima
    	 * no final
    	 * 
    	 * -------------------------
    	 * Cliente: João
    	 * Endereco de entrega: Rua ...
    	 * Comprou o material: XXXX no valor de R$ XXXX
    	 * O valor total da compra deu: R$ XXXX
    	 * -------------------------
    	 * 
    	 * 
    	 */
    	
    	System.out.println("=======[ Calculo do Material de Construção ]=============");
    	System.out.println("Olá João seja muito bem vindo, vamos começar?");
    	System.out.println("Digite o nome do seu Cliente:");
    	var nome = ler.next();
    	
    	System.out.print("Digite o endereço:");
    	var enderecao = ler.next();
    	
    	System.out.print("Digite nome do material: ");
    	var material = ler.next();
    	
    	System.err.printf("Digite o valor unitário de %s: ", material);
    	var valorMaterial = ler.nextFloat();
    	
    	System.out.printf("Digite a quantidade de %s: ", material);
    	var quantidadeMaterial = ler.nextInt();
    	
    	var valorTotal = valorMaterial * quantidadeMaterial;

    	DecimalFormat moedaBr = new DecimalFormat( "#,###,###,##0.00" );
    	
    	System.out.println("====================================");
    	System.out.println("Cliente: "+ nome);
    	System.out.println("Endereco de entrega: "+ enderecao);
    	System.out.printf("Comprou o material: %s no valor de R$ %s", material, moedaBr.format(valorMaterial));
    	System.out.println("\nO valor total da compra deu: R$ "+ moedaBr.format(valorMaterial));
    	if(valorTotal > 100)
    		System.out.println("\nObs: Cliente terá desconto na próxima.");
    	System.out.println("====================================");
    	
    	
    	
    	
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

    	/*
    	 * Autor: Walter Paulo
    	 * Date: 06/10/2022
    	 * Exercise: 1 do dia 4 
    	 */
    	
//	    	System.out.println( "==============[ Bem Vindo ]=============");
//	    	System.out.println( "Digite o valor de x:");
//	    	Double x = ler.nextDouble();
//	    	System.out.println( "Digite o valor de y:");
//	    	Double y = ler.nextDouble();
//	    	
//	    	var calculo = (x * 8 +  y) - x + y / 100;
//	    	
//	    	System.out.println( "============================");
//	    	System.out.println( "O resultado é "+ calculo);
//	    	System.out.println( "============================");
    	

    }
}
