## Aula 13 - 15/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Interface
Um tipo de contrato que todo classe quando implementa herda, deve respeitar suas cláusulas.

```java
public interface IPessoa{
  int getId();
  void setId(int id);

  String getNome();
  void setNome(String nome);
}
```

### Enum
Definir uns tipos de dados.

```java

public enum Tipo{
  JSON,
  CSV,
  XML,
}
```

### Abstração
um contrato mais sofisticado comparando com a interface, nessa classe os métodos pode ser obrigatório ou não. Para método obrigatório, deve coloca o abstract. O uso do final manter a estrutura do método, evitando a sobrescrita(Override).

### Padrão Strategy
O padrão Strategy ajuda a gerenciar toda essa complexidade imposta pelas lógicas condicionais.