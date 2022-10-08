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
    	 * Date: 08/10/2022
    	 * Exercise: 1 do dia 6 - Desafio 21 dias em Java 
    	 */
	    	
	    /*
	     * Paula tem um petshop, e está precisando de um sistema
	     * para controlar seus serviços, no sistema, terá cadastro
	     * de cliente (dados Básicos) os dados o peso do Pet,
	     * depois o sistema deverá calcular o valor do banho pelo o peso do Pet,
	     * segue este cáculo:
	     * 
	     * Para macho:
	     * (pesoDoPeto * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100
	     * 
	     * Para fêmea:
	     * (pesoDoPeto * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100
	     * 
	     * Feito o caculo o sistema deverá mostrar um relatório com os dados do pedido
	     * e o valor total a pagar.
	     * 
	     * Coloque uma usuabilidade agradável.
	     */
	    	
	    	
	    System.out.println("===============[ PetAni ]===============");
	    System.out.println("Olá Paula, bom dia");
	    System.out.println("===============[ Cadastro Cliente ]===============");
	    System.err.println("Digite o nome");
	    var nomeDoCliente = ler.next();
	    System.out.println("Digite o telefone");
	    var telefoneCliente = ler.next();
	    System.out.println("===============[ Cadastro do Pet ]===============");
	    System.err.println("Digite o nome");
	    var nomeDoPet = ler.next();
	    System.err.println("Digite o sexo: M => macho / F => Fêmea");
	    var sexoDoPet = ler.next();
	    System.err.println("Digite o peso:");
	    var pesoDoPet = ler.nextDouble();
	    
	    System.out.println("===============[ Cadastro do Preço ]===============");
	    System.err.println("Digite o valor por peso");
	    var valorPorPeso = ler.nextDouble();
	    var valorTotal = 0.0;
	    if(sexoDoPet.equals("M")) {
	    	valorTotal =  (valorPorPeso * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100;
	    } else {
	    	valorTotal =  (valorPorPeso * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100;
	    }
	    DecimalFormat moedaBr = new DecimalFormat( "#,###,###,##0.00" );
	    
	    System.out.println("============[ Relatório ]=======================");
	    System.out.println("Nome do cliente: "+ nomeDoCliente);
	    System.out.println("Telefone: "+ telefoneCliente);
	    System.out.println("\n-----[ Pet ]--------");
	    System.out.println("Nome do Pet: "+nomeDoCliente);
	    System.out.println("Sexo: "+sexoDoPet);
	    System.out.println("Peso: "+pesoDoPet);
	    System.out.println("\n---------[ Pagamento ]--------");
	    System.err.println("Valor Total R$ "+ moedaBr.format(valorTotal));
	    
	    
	    
//	    (pesoDoPeto * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100
	    
//	    Para macho:
//		     * 
//		     * 
//		     * Para fêmea:
//		     * (pesoDoPeto * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100	
	    	
	    	
	    	
	    	
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
    	
//    	System.out.println("=======[ Calculo do Material de Construção ]=============");
//    	System.out.println("Olá João seja muito bem vindo, vamos começar?");
//    	System.out.println("Digite o nome do seu Cliente:");
//    	var nome = ler.next();
//    	
//    	System.out.print("Digite o endereço:");
//    	var enderecao = ler.next();
//    	
//    	System.out.print("Digite nome do material: ");
//    	var material = ler.next();
//    	
//    	System.err.printf("Digite o valor unitário de %s: ", material);
//    	var valorMaterial = ler.nextFloat();
//    	
//    	System.out.printf("Digite a quantidade de %s: ", material);
//    	var quantidadeMaterial = ler.nextInt();
//    	
//    	var valorTotal = valorMaterial * quantidadeMaterial;
//
//    	DecimalFormat moedaBr = new DecimalFormat( "#,###,###,##0.00" );
//    	
//    	System.out.println("====================================");
//    	System.out.println("Cliente: "+ nome);
//    	System.out.println("Endereco de entrega: "+ enderecao);
//    	System.out.printf("Comprou o material: %s no valor de R$ %s", material, moedaBr.format(valorMaterial));
//    	System.out.println("\nO valor total da compra deu: R$ "+ moedaBr.format(valorMaterial));
//    	if(valorTotal > 100)
//    		System.out.println("\nObs: Cliente terá desconto na próxima.");
//    	System.out.println("====================================");
//    	
    	
    	
    	
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
