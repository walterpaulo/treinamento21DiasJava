package br.com.unoinfo;

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
	    	 * Date: 09/10/2022
	    	 * Exercise: Loops do dia 6 - Desafio 21 dias em Java
	    	 * 
	    	 * 
	    	 * 
	    	 * 
		     * Denilson é um bombeiro e que precisa apagar as chamas de um prédio
		     * crie um programa utiliza os conceitos de loop para
		     * que o prédio em chama possa ser molhado com a mangueira do bombeiro Denilson
		     * até que as chamas estejam apagadas.
		     * 
		     * variável chama será capturada pelo usuário do programa. Ex:
		     * Digite o tamanho em metros de chamar: 200
		     * 
		     * Digite os litros total do caminhão de bombeiro.
		     * 
		     * Cálculo:
		     * 	para cada 5 litros de água eu apago 1 metro de chamar.
		     * 
		     * 
		     * Faça um programa mostrando o histórico desse atendimento.
		     * 
		     * Exemplo de histórico:
		     * 
		     * 100 metros de chamas
		     * eu coloquei 50 litros de água
		     * 
		     * quantidade_de_agua_por_metro = 100 / 5
		     * quantidade_de_litro_que_tenho = 50 /5
		     * 
		     * se a capacidade de água for menor, Denilson não vai conseguir apagar o fogo e terá que chamar reforços
		     * senão, mostrar o histórico assim:
		     * 
		     * =============
		     * Apagando 5 metros de fogo fase 1
		     * Apagando 5 metros de fogo fase 2
		     * Apagando 5 metros de fogo fase 3
		     * Apagando 5 metros de fogo fase 3
	         * Apagando 5 metros de fogo fase 4
	        
		     * Fogo apagado com sucesso.
		     * Sobraram X litros de agua
		     * 
		     */
	    	
	    	String MSG_TITULO = "Sistema de Incêndio\n";
	    	String MENU_PRINCIPAL = "\n\nEscolhe uma opção:\n"
	    			+ "( 1 ) Digite a quantidade de litros do caminhão\n"
	    			+ "( 2 ) Histórios\n"
	    			+ "(sair) Sair\n";
	    	
	    	String PERGUNTA_TAMANHO_METRO_FOGO = "\nDigite o tamanho em metro do fogo";
	    	String PERGUNTA_QUANTIDADE_LITRO = "\nDigite a quantidade de litros do caminhão";
	    	String MENSAGEM = "";
	    	
	    	
	    	boolean ocorrencia = true;
	    	boolean abastecer = true;
	    	
	    	do {
	    		double tamanhoMetroFogo = 0.0;
	    		double quantidadeLitro = 0.0;
	    		double quantidadeAguaApaparFogo = 0.0;
	    		double quantidadeAguaCaminhao = 0.0;
	    		
	    		String HISTORICO = "\n Histórico\n\n";
	    		
	    		if(ocorrencia) {
	    			MENSAGEM =  MSG_TITULO;
	    			MENSAGEM += PERGUNTA_TAMANHO_METRO_FOGO;
	    			String txttamanhoMetroFogo = JOptionPane.showInputDialog(MENSAGEM);
	    			tamanhoMetroFogo = Double.parseDouble(txttamanhoMetroFogo);
	    			ocorrencia = false;
	    			continue;
	    			
	    		}
	    		if(abastecer) {
	    			MENSAGEM = MSG_TITULO; 
	    			MENSAGEM += PERGUNTA_QUANTIDADE_LITRO;
	    			String quantidaDeListro = JOptionPane.showInputDialog(MENSAGEM);
	    			quantidadeLitro = Double.parseDouble(quantidaDeListro);
	    			abastecer = false;
	    			continue;
	    		}
	    		
	    		
	    		quantidadeAguaApaparFogo = tamanhoMetroFogo / 5;
	    		quantidadeAguaCaminhao = quantidadeLitro / 5;
	    		
	    		if( quantidadeAguaApaparFogo > quantidadeAguaCaminhao) {
	    			HISTORICO += "Fogo: ACESSO Apagado: "+quantidadeAguaApaparFogo+" Falta: "+(quantidadeAguaApaparFogo - quantidadeAguaCaminhao);
	    			JOptionPane.showMessageDialog(null, HISTORICO);
//	    			abastecer = true;
	    			
	    		}else if(quantidadeAguaApaparFogo == quantidadeAguaCaminhao) {
	    			
	    			break;
	    		}else {
	    			
	    		}
//	    		JOptionPane.showMessageDialog(null, HISTORICO);
	    		
	    		String menu = MSG_TITULO += MENU_PRINCIPAL;
	    		String opcao = JOptionPane.showInputDialog(menu);
	    		
	    		if(opcao.toLowerCase().equals("sair")) {
	    			break;
	    		}
	    		
	    	} while(true);
    }
}
