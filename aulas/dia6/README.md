## Aula 6 - 08/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Exercícios

* Exercício 2

```s
 O governo do Brasil está precisando construir uma ponte
 que possibilita a passagem de caminhões de um estado a outro,
 a ponte ajudará no transporte de alimentos, e produtos diversos.

 Faça um programa que ajude a calcular o valor total da ponte.
 Para isso você precisa perguntar alguns itens:

 - valor por metro quadrado;
 - extensão da ponte(metro);
 - mostrar os tipos de ferragens para fundação de ponte, assim o engenheiro pode escolher uma opção, exemplo: ferro fundido; ferro de aço; e ferro normal;
 - o valor do ferro varia de acordo com a opção escolhida;
 - no final do relatório mostre o valor total construído;e
 - desse valor total contruído, mostrar também que 30% foi adquirido
 com o valor de imposto arracadado sobre a população local;

 Objeto do exercício:
 - utilizar if;e
 - switch

```

* Resolução Exercício 2

```java
public static void main( String[] args )
    {
	    	Scanner ler = new Scanner(System.in);
	    
    	/*
    	 * Autor: Walter Paulo
    	 * Date: 08/10/2022
    	 * Exercise: 2 do dia 6 - Desafio 21 dias em Java 
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
    			+ "( 2 ) = Ferro de Aço ("+taxaFerroAcao+"%);\n"
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
        			+ "Extensao: "+comprimentoPonte+" metro(s)\n"
					+ "Valor por metro: R$ "+moedaBr.format(m2valor)+"\n";
        	
        	String tipoDePonte = "Ferro Fundido";
        	
        	switch(opcaoTipoFerro) {
        	  case "1":
        		tipoDePonte = "Normal";
        	    valorTotal = ( m2valor * comprimento) * (taxaFerroNormal > 0? taxaFerroNormal : 1.0);
        	    break;
        	  case "2":
        		  tipoDePonte = "Ferro de Aço";
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

```


* Exercicio 1, feito em aula

```java
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
	    
	    
```