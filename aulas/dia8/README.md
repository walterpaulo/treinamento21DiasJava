## Aula 8 - 10/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Exercicios

* Exercício 1
```java
/*
	    	 * Autor: Walter Paulo
	    	 * Date: 10/10/2022
	    	 * Exercise: 1 Loops do dia 8 - Desafio 21 dias em Java
	    	 * 
		     */
			
			public static void main( String[] args )
    {
				var valor = JOptionPane.showInputDialog("Calculadora\nDigite o número:");
				double valorDouble = Double.parseDouble(valor);
				String resultado = "Resultado:\n";
				for (int i = 1; i <= 10; i++) {
				resultado += valorDouble+ " X "+ i + " = " + i *valorDouble+"\n";
			}
				JOptionPane.showMessageDialog(null, resultado);
		}
```

```java
	/*
    	 * Autor: Walter Paulo
    	 * Date: 10/10/2022
    	 * Exercise: 2 Loops do dia 8 - Desafio 21 dias em Java
    	 * 
	     */
    	/*
    	 * Agora que você já sabe trabalhar com  loog e já fez fez o primeiro programa da
    	 * tabuada, do número 1 ao 10
    	 * faça um programa para calcular a tabuad, onde o usuário digta a quantidade de
    	 * números multiplicados
    	 * 
    	 * usubilidade:
    	 * Digite o número da tabuada
    	 * 1
    	 * 
    	 * Digite a quantidade de vezes será multiplicada;
    	 * 
    	 */
			public static void main( String[] args )
    {
	   
    	Scanner ler = new Scanner(System.in);
    	
	    System.out.println("#".repeat(10) +"[ Calculadora ]"+"#".repeat(10)+"\n\nDigite o número da tabuada");
	    var valor = ler.nextInt();
	    
	    System.out.println("Digite a quantidade de vezes será multiplicada:");
	    var valorMult = ler.nextInt();
    	for (int i = 1; i <= valorMult; i++) {
    		System.out.println(valor + " X "+ i + " = " + i *valorMult+"\n");
			}
		}

```