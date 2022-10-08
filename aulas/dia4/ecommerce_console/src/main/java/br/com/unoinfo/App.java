package br.com.unoinfo;

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
	    System.out.println("Nome do Pet: "+nomeDoPet);
	    System.out.println("Sexo: "+sexoDoPet);
	    System.out.println("Peso: "+pesoDoPet);
	    System.out.println("\n---------[ Pagamento ]--------");
	    System.err.println("Valor Total R$ "+ moedaBr.format(valorTotal));
	    
    	

    }
}
