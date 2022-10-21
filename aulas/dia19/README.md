## Aula 19 - 21/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Novo projeto

* Spring Web Web;
* Thymeleaf Template Engines;
* PostgreSQL Driver SQL;
* Spring Data JPA SQL;

Link para baixar [projeto](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.7.5&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,thymeleaf,thymeleaf,postgresql,data-jpa) novo.

## Camanda Controller

* anotação @Controller
* os métodos são do tipo string;
* e retorno o nome do arquivo com extersão .xhtml;
* o diretório resource/templates/static localiza todos arquivos estático, .xhtml... .

### Área comun (doc layout)[https://www.thymeleaf.org/doc/articles/layouts.html]
cria um diretório em resource/templates/static/shareds para os itens compartilhados.

* cria um tamplate chamado head.html

Adiciona o head.html no arquivo principal
```html
<div th:replace="shareds/header"></div>
```


