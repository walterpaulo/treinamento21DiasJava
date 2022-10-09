## Aula 7 - 09/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Exercício

```java

			/*
    	 * Autor: Walter Paulo
    	 * Date: 09/10/2022
    	 * Exercise: Loops do dia 7 - Desafio 21 dias em Java
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

```

* Resolução

```java

	    	Scanner ler = new Scanner(System.in);
	    
	    	/*
	    	 * Autor: Walter Paulo
	    	 * Date: 09/10/2022
	    	 * Exercise: Loops do dia 7 - Desafio 21 dias em Java
	    	 * 
		     */
	    	
	    	String MSG_TITULO = "Sistema de Incêndio\n";
	    	String MENU_PRINCIPAL = "\n\nEscolhe uma opção:\n"
	    			+ "( 1 ) Digite a quantidade de litros do caminhão\n"
	    			+ "( 2 ) Histórico\n"
	    			+ "(sair) Sair\n";
	    	
	    	String PERGUNTA_TAMANHO_METRO_FOGO = "\nDigite o tamanho em metro do fogo";
	    	String PERGUNTA_QUANTIDADE_LITRO = "\nDigite a quantidade de litros do caminhão";
	    	String MENSAGEM = "";
	    	String HISTORICO = "\n Histórico\n";
	    	
	    	
	    	boolean ocorrencia = true;
	    	boolean abastecer = true;
	    	boolean calculo = false;
	    	
	    	String menu = "";
	    	
	    	double tamanhoMetroFogo = 0.0;
	    	double quantidadeLitro = 0.0;
	    	double quantidadeAguaApaparFogo = 0.0;
	    	double quantidadeAguaCaminhao = 0.0;
	    	int count = 0;
	    	do {
	    		
	    		if(ocorrencia) {
	    			MENSAGEM =  MSG_TITULO;
	    			MENSAGEM += PERGUNTA_TAMANHO_METRO_FOGO;
	    			String txttamanhoMetroFogo = JOptionPane.showInputDialog(MENSAGEM);
	    			tamanhoMetroFogo = Double.parseDouble(txttamanhoMetroFogo);
	    			calculo = true;
	    			
	    		}
	    		if(abastecer) {
	    			MENSAGEM = MSG_TITULO; 
	    			MENSAGEM += PERGUNTA_QUANTIDADE_LITRO;
	    			if(quantidadeAguaApaparFogo <= quantidadeAguaCaminhao && quantidadeAguaCaminhao > 0.0) {
	    				MENSAGEM = MSG_TITULO;
	    				MENSAGEM += "Litro(s) não adicionado, fogo apagado!";
	    				JOptionPane.showMessageDialog(null, MENSAGEM );
	    				calculo = false;
	    				abastecer = false;
	    				quantidadeAguaCaminhao = 0.0;
	    				continue;
	    			}else if(quantidadeAguaApaparFogo > quantidadeAguaCaminhao && quantidadeAguaCaminhao > 0.0){
	    				String quantidaDeListro = JOptionPane.showInputDialog(MENSAGEM);
	    				quantidadeLitro = Double.parseDouble(quantidaDeListro);
	    				ocorrencia = false;
	    				calculo = true;
	    			}
	    			else if(quantidadeAguaApaparFogo == quantidadeAguaCaminhao && quantidadeAguaCaminhao == 0.0){
	    				String quantidaDeListro = JOptionPane.showInputDialog(MENSAGEM);
	    				quantidadeLitro = Double.parseDouble(quantidaDeListro);
	    				if(ocorrencia)
	    					quantidadeAguaApaparFogo = tamanhoMetroFogo / 5;
	    				ocorrencia = false;
	    				calculo = true;
	    			}else {
	    				MENSAGEM = MSG_TITULO;
	    				MENSAGEM += "Litro(s) não adicionado, fogo apagado!";
	    				JOptionPane.showMessageDialog(null, MENSAGEM );
	    			}
	    		}
	    		
	    		if(calculo) {
	    			quantidadeAguaCaminhao += quantidadeLitro / 5;
	    			quantidadeLitro = 0.0;
	    			count += 1;
	    			if( quantidadeAguaApaparFogo > quantidadeAguaCaminhao) {
	    				HISTORICO += "\nFogo: ACESSO   Apagado: "+( quantidadeAguaCaminhao * 5 )+" metro(s)  Falta: "
	    						+((quantidadeAguaApaparFogo - quantidadeAguaCaminhao) * 5)+" litro(s), fase "+count;
	    				JOptionPane.showMessageDialog(null, HISTORICO);
	    				calculo = false;
	    				abastecer = true;
	    			}
	    			else if(quantidadeAguaApaparFogo == quantidadeAguaCaminhao) {
	    				HISTORICO += "\nFogo: APAGADO Apagado: "+( quantidadeAguaCaminhao * 5 )+" metro(s)  Falta: "
	    						+((quantidadeAguaApaparFogo - quantidadeAguaCaminhao) * 5)+" litro(s), fase "+count ;
	    				JOptionPane.showMessageDialog(null, HISTORICO);
	    				calculo = false;
	    			}else {
	    				calculo = false;
	    				abastecer = false;
	    				HISTORICO += "\nFogo: APAGADO Apagado: "+(quantidadeAguaApaparFogo)*5+" metro(s)  Falta: "
	    						+((quantidadeAguaApaparFogo - quantidadeAguaCaminhao) * 5)+" litro(s), fase "+count ;
	    			}
	    		}
	    		
	    		menu = MSG_TITULO;
	    		menu += MENU_PRINCIPAL;
	    		String opcao = JOptionPane.showInputDialog(menu);
	    		
	    		if(Integer.parseInt(opcao) == 1)
	    			abastecer = true;
	    		
	    		if(Integer.parseInt(opcao) == 2) {
	    			JOptionPane.showMessageDialog(null, HISTORICO);
	    			abastecer = false;
	    		}
	    		
	    		if(opcao.toLowerCase().equals("sair")) {
	    			break;
	    		}
	    		
	    	} while(true);
    }
```


### Loop

Laços de repetição ou laços de iteração ou simplesmente loops, são comandos presentes no bloco sejam repetidos diversas vezes.

#### for

```java
para (instrução 1; instrução 2; instrução 3) {
  // code block to be executed
}

A instrução 1 é executada (uma vez) antes da execução do bloco de código.

A instrução 2 define a condição para executar o bloco de código.

A instrução 3 é executada (todas as vezes) após a execução do bloco de código.
```

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

```

#### while
Os loops podem executar um bloco de código desde que uma condição especificada seja alcançada.

```java
Scanner ler = new Scanner(System.in);
	    
    	/*
    	 * Autor: Walter Paulo
    	 * Date: 09/10/2022
    	 * Example: Loops do dia 7 - Desafio 21 dias em Java 
    	 */
	    	
	   System.out.println("Digite 's' para entrar no loop");
	   String valorDigitado = ler.next();
	   
	   while(valorDigitado.toLowerCase().equals("s")) {
		   
		   
		   System.out.println("Sair do loop, digite 'sair'");
		   String valor = ler.next();
		   
//		   # o continue iniciar do início do laço
		   if(valor.toLowerCase().equals("pular")) continue;
		   System.out.println("===========[ "+ valor+" ]===========");
		   
		   /*
		    * o break finaliza o laço
		    * obs: função de válvula de escape( senão você terá um loop infinito)
		    */
		   if(valor.toLowerCase().equals("sair")) break;
	   }
	   System.out.println("exit");

```


#### do/while

```java
	Scanner ler = new Scanner(System.in);
	    
    	/*
    	 * Autor: Walter Paulo
    	 * Date: 09/10/2022
    	 * Example: Loops do dia 7 - Desafio 21 dias em Java
    	 * do/while: sempre executa a primeira interação. 
    	 */
	    	
	   
	   do {
		   
		   
		   System.out.println("Bem Vindo!\n\nPara sair do loop, digite 'sair'");
		   String valor = ler.next();
		   
//		   # o continue iniciar do início do laço
		   if(valor.toLowerCase().equals("pular")) continue;
		   System.out.println("===========[ "+ valor+" ]===========");
		   
		   /*
		    * o break finaliza o laço
		    * obs: função de válvula de escape( senão você terá um loop infinito)
		    */
		   if(valor.toLowerCase().equals("sair")) break;
	   } while(true);
	   System.out.println("exit");

```