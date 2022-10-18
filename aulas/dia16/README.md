## Aula 16 - 18/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Banco de dados
é uma coleção organizada de informações ou dados.

#### Sistema de gerenciamento de banco de dados

O SGBD, Sistema de Gerenciamento de Banco de Dados, ou Sistema de Gestão de Bases de Dados

#### Object Relational Mapper
O ORM (Object Relational Mapper) é uma técnica de mapeamento objeto relacional que permite fazer uma relação dos objetos com os dados que os mesmos representam. 

#### Java Persistence API
O JPA, Java Persistence API, é um framework leve, baseado em POJOS (Plain Old Java Objects) para persistir objetos Java.

#### Configuração projeto Spring Boot

##### Driver do banco
Configura o pom.xml de acordo com o banco escolhido.
* PostgreSQL
```xml
  <dependencies>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <scope>runtime</scope>
    </dependency> 
  </dependencies>
```
* MySQL
```xml
  <dependencies>
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <scope>runtime</scope>
    </dependency>
  </dependencies>
```

#### Configura o banco PostgreSQL
##### Para configurar o banco no projeto, primeiramente, você precisa criar uma base de dados. Depois vá para o projeto Spring Boot edita o arquivo application.properties no diretório "src/main/resources/".

```sql
# conexao com o banco postgreSQL
spring.datasource.url= jdbc:postgresql://localhost:5432/nomeBaseDeDados

# usuario do banco
spring.datasource.username=postgres

# senha do banco
spring.datasource.password=banco123

spring.jpa.hibernate.ddl-auto=update
```

#### Modelando classe

```java
@Entity //Transforma classe em entidade ou modelo
public class Profissional {

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;
  ...

```

#### Repositório
Conexão direta com o banco de dados. Adicione a interface e nomea profissionalReposity.java.

```java

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Integer>{

}
```



