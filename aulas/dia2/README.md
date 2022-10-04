## Aula 2 - [Desafio 21 dias em Java](../../README.md)

### Editores

* Eclipse IDE 2022‑09 - [Linux](https://eclipse.c3sl.ufpr.br/oomph/epp/2022-09/R/eclipse-inst-jre-linux64.tar.gz)
* Eclipse IDE 2022‑09 - [Windows](https://eclipse.c3sl.ufpr.br/technology/epp/downloads/release/2022-09/R/eclipse-java-2022-09-R-win32-x86_64.zip)
* IntelliJ IDEA 2022.2.2 Community - [Linux](https://download.jetbrains.com/idea/ideaIC-2022.2.2.tar.gz)
Netbeans 15 [Linux](https://dlcdn.apache.org/netbeans/netbeans/15/netbeans-15-bin.zip)
Visual Studio Code (VSCode) - [Linux](https://code.visualstudio.com/sha/download?build=stable&os=linux-x64)

Obs: Instalar o plugin Extension "Pack for Java v0.25.3" na IDE VSCode

 
 #### Para outra plataforma
 * [Eclipse - Download](https://www.eclipse.org/downloads/packages/)
 * [IntelliJ - Download](https://www.jetbrains.com/pt-br/idea/download/)
 * [Apache NetBeans - Download](https://netbeans.apache.org/download/index.html)
 * [Visual Studio Code - Download](https://code.visualstudio.com/download#)

 ### Gerar o projeto Maven
 [ver código](./maven_project/)

 #### Copia este código no terminal/Bash

 ```s
mvn archetype:generate                                  \
  -DinteractiveMode=false                               \
  -DarchetypeArtifactId=maven-archetype-quickstart      \
  -DarchetypeVersion=1.4                                \
  -DgroupId=br.com.maven_build                          \
  -DartifactId=maven_build 
 ```