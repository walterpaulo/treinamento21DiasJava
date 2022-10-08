package br.com.unoinfo;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
    	 * Exercise: 2 do dia 6 - Desafio 21 dias em Java 
    	 */
	    	
	    /*
	     *  O governo do Brasil está precisando construir uma ponte
		 * que possibilita a passage de caminhoẽos de um estado a outro,
		 * a ponte ajudará no transporte de alimentos, e alimentos diversos de brasileiros.
		 * 
		 * Faça um programa que ajude a calcular o valor total da ponte.
		 * Para isso você precisa pergutar alguns itens:
		 * 
		 * - valor pro metro quadrado;
		 * - total de mentro da ponte;
		 * - mostrar as opçoes de ferro da fundação da ponte, assim o engenheiro pode escolher
		 * uma opção, exemplo: ( ferro fundido, Ferro com aço, ferro normal);
		 * - o valor do ferro varia de acordo com a opção escolhido;
		 * - no final do relatório mostre o valor total construido;e
		 * - desse valor total contruído, mostrar também que 30% foi adquirido
		 * com o valor de imposto arracadado sobre a população local;
		 * 
		 * Objeto do exercício:
		 * - utilizar if;e
		 * - switch
	     */
	    	
    	double taxaFerroFundido = 1.2;
    	double taxaFerroAcao = 1.3;
    	double taxaFerroNormal = 0.0;
    	double taxaImposto = 30.0;
    	
    	double valorTotal = 0.0;
	    
    	String msgInicial = "[ Infraestrutua - Governo Federal ]\n\n";
    	String menu = msgInicial;
    	
    	menu += "Escolha uma opção:\n ( 1 ) = Orçamento de Ponte;\n ( 0 ) = Sair;\n\n";
    	var menuTipoFerro = "[ Ponte - Governo Federal ]\n\nEscolha uma opção:\n"
    			+ "( 1 ) = Ferro normal ("+taxaFerroNormal+"%);\n"
    			+ "( 2 ) = Ferro com Aço ("+taxaFerroAcao+"%);\n"
    			+ "( 3 ) = Ferro Fundido ("+taxaFerroFundido+"%);\n\n";
    	var msgSair = "Um Governo mais forte para todos!";
    	
        var opcao = JOptionPane.showInputDialog(null, menu);
        
        if(Integer.parseInt(opcao) == 1) {
        	String relatorio = msgInicial;
        	relatorio += "________________| Relatório |________________\n";
        	
        	var opcaoTipoFerro = JOptionPane.showInputDialog(menuTipoFerro);
        	
        	var valorValorM2 = JOptionPane.showInputDialog("Digite o valor do metro quadrado:");
        	var comprimentoPonte = JOptionPane.showInputDialog("Digite a metragem da ponte:");
        	
        	double m2valor = Double.parseDouble(valorValorM2);
        	double comprimento = Double.parseDouble(comprimentoPonte);
        	DecimalFormat moedaBr = new DecimalFormat( "#,###,###,##0.00" );
        	
        	relatorio += "\nDescrição Técnica\n"
        			+ "Departamento: Infraestrutura\n"
        			+ "Obra: Ponte\n"
        			+ "Metragem: "+comprimentoPonte+" metro(s)\n"
					+ "Valor por metro: R$ "+moedaBr.format(m2valor)+"\n";
        	
        	String tipoDePonte = "Ferro Fundido";
        	
        	switch(opcaoTipoFerro) {
        	  case "1":
        		tipoDePonte = "Normal";
        	    valorTotal = ( m2valor * comprimento) * (taxaFerroNormal > 0? taxaFerroNormal : 1.0);
        	    break;
        	  case "2":
        		  tipoDePonte = "Ferro com Aço";
        		  valorTotal = ( m2valor * comprimento) * (taxaFerroAcao > 0? taxaFerroAcao : 1.0);
        	    break;
        	  default:
        		  valorTotal = ( m2valor * comprimento) * (taxaFerroFundido > 0? taxaFerroFundido : 1.0);
        	}
        	
        	relatorio += "Tipo: "+tipoDePonte+"\n"
        			+ "Imposto da população em porcentagem: "+taxaImposto+"%\n"
        			+ "Imposto da população em moeda: R$ "+ moedaBr.format((valorTotal * taxaImposto) / 100)
        			+ "\nValor Total: R$ "+moedaBr.format(valorTotal);
        	
        	JOptionPane.showMessageDialog(null, "Valor:" + relatorio);
        	
        	
        }else {
        	JOptionPane.showMessageDialog(null, msgSair);
        }
    }
}
