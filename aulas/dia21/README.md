## Aula 21 - 23/10/2022 - [Desafio 21 dias em Java](../../README.md)

### Computação em Nuvem

<hr>

#### Web Server ou PAAS

* Suporte oferecido: executáveis e containers;


"Servidor web (web server)" pode referir ao hardware ou ao software, ou ambos trabalhando juntos [(MOZILLA, 2022)](https://developer.mozilla.org/pt-BR/docs/Learn/Common_questions/What_is_a_web_server).

> Heroku;
  - inicia uma conexão no banco Mysql;
    - tem plano free;
    - o projeto deve possuir variáveis de ambientes, url, nome, senha e banco;
    - cobrado por hora;
  - configuração de variáveis de ambientes;
  - Java 11 - Cria o arquivo system.preperties na raiz do projeto e adicione esta linha java.runtime.version=11. Pronto para uso.
  - Suporte para domínio free ou personalizado para uso profissional no plano pago, o [Registro.br](https://registro.br/);
  - suporte com o [GitHub](https://github.com/) para deploy;

  <hr>


#### Aplicação IAAS

* Suporte oferecido: servidor, storage e Rede;

"Infrastructure as a Service (Infraestrutura como Serviço) No modelo IaaS, a empresa contrata uma capacidade de hardware que corresponde à memória, armazenamento e processamento, por exemplo. Podem entrar nesse pacote de contratações os servidores, roteadores, racks, entre outros"[(SOFTLINE, 2022)](https://brasil.softlinegroup.com/sobre-a-empresa/blog/iaas-paas-saas-nuvem)

> Aws
  - cria um EC2 (máquina virtual);
    - ubuntu versão 20.04 (suporte longo);
    - criação de chave ssh para acesso desse host;
    - configuração de variáveis de ambiente no arquivo bashc
      - para acessar digite vim /home/MeuUsuário/.bashrc no terminal;
    - pacotes:
      - maven;
      - apache2 (Servidor Web)
        - ProxyPass, quando acessar a porta 80 e será direcionado para o ip da vm;
          -ProxyPass e ProxyPassReverse configuração no arquivo 000-default.conf no diretório /etc/apache2/sites-enabled;
          - abilitar os modulos proxy e proxy_http
    - Grupo de segurança Security Groups
      - liberação de portas, abertura da porta 80;
  - RDS (banco de dados)
    - define o usuário e senha;
    - 
  - cobrado por hora;


> Azure
  - cria um virtual Machine, similar ao EC2 da Aws;
    - cria um grupo;
    - ubuntu version 20.04;
    - nomea a vm;
    - cria um par de chave ssh;
    - usuário azureuser;
    - configuração de variáveis de ambiente no arquivo bashc
      - para acessar digite vim /home/MeuUsuário/.bashrc no terminal;
    - cobrado por hora;
  - pacotes:
    - maven;
  - MySQL;
    - acesso remote; 
  - connection security
    - abertura de conexões
  - Networking
    - liberação de portas, abertura da porta 80;

> Docker
 - cria um arquivo Dockerfile para gerar imagem e docker-compose.yml para gerenciar containers, exemplo projeto e banco, configuração de acesso,...;
 - proxy pass da porta 80 no projeto e 8080 para acesso externo;
 - cria um EC2
  - ubuntu version 20.04;
  - liberar a porta 8080 (security groups);
  - baixar
  - pacotes:
    -atualização de repositório
    - comandos para instalar pocotes;
      - sudo apt install docker
      - sudo apt install docker-compose
      - sudo apt install maven
      - sudo apt install nginx
  - gera a image do projeto
    - docker build -t caminho .

> Obs: 
>* medida de segurança é recomendado configurar url, usuário e senha em variáveis de ambiente;e
>* Se utilizar a Aws ou Azure para estudos, no final do treinamento excluir as configuraçẽos feitas no decorrer do curso para evitar cobranças.
