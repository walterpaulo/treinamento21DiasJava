## Aula 3 - [Desafio 21 dias em Java](../../README.md)

### Gradle
* [Pacote Gradle 7.5.1](https://services.gradle.org/distributions/gradle-7.5.1-bin.zip)
Iniciar um projeto
```s
gradle init
# Select type of project to generate:
  # 1: basic
  # 2: application
  # 3: library/
  # 4: Gradle plugin
# Enter selection (default: basic) [1..4]
2

# Select implementation language:
  # 1: C++
  # 2: Groovy
  # 3: Java
  # 4: Kotlin
  # 5: Scala
  # 6: Swift
# Enter selection (default: Java) [1..6] 
3

# Split functionality across multiple subprojects?:
  # 1: no - only one application project
  # 2: yes - application and library projects
# Enter selection (default: no - only one application project) [1..2] 
1

# Select build script DSL:
  # 1: Groovy
  # 2: Kotlin
# Enter selection (default: Groovy) [1..2]
1
# Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] 
yes

# Select test framework:
  # 1: JUnit 4
  # 2: TestNG
  # 3: Spock
  # 4: JUnit Jupiter
# Enter selection (default: JUnit Jupiter) [1..4] 
1

# Project name (default: gradle_project): 
ecommerce

# Source package (default: ecommerce): 
br.com.unoinfo

# > Task :init
# Get more help with your project: https://docs.gradle.org/7.5.1/samples/sample_building_java_applications.html

# BUILD SUCCESSFUL in 4m 12s
# 2 actionable tasks: 2 executed


```
#### Configarar o manifesto gradle
 Edite o arquivo build.gradle
```s
# coloque o pacote da aplicação
tasks.jar {
    manifest.attributes["Main-Class"] = "br.com.unoinfo.App"
}

```


#### Iniciar
```s
gradle run
```

#### Como fazer build
```s
gradle build
```

#### Como rodar testes
```s
gradle test
```

#### Mostra opções disponíveis
```s
gradle tasks
```

#### Como rodar a aplicação
```s
gradle jar # gera o binário da aplicação
java -jar app/build/libs/app.jar # roda o binário gerado


gradle war # gera o binário da aplicação
java -war app/build/libs/app.jar # roda o binário gerado

gradle bootRun # Roda os testes da aplicação para aplicações springboot
./gradlew bootRun # rodar por shell script
```

#### Ver estatisticas de build no serviço do gradle
```s
gradle build --scan # ao aceitar os termos vc passa a ter uma interface na web com estatísticas de build
```


#### Configuração
```s
sudo unzip gradle-7.5.1-bin.zip -d /opt/
sudo ln -s /opt/gradle-7.5.1/bin/gradle /bin
```

Obs: Para debugar no VSCode instale plugin Deno v3.13.1.
