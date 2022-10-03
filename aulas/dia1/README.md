## Aula 1 - [Desafio 21 dias em Java](../../README.md)

* Instalação do Java
 
 
### Linux - Debian e derivados

```s

# Atualização de repositório
  sudo apt udpate

# Instalar Java
  sudo apt install openjdk-11-jre

# ver versão do Java
  java -version
```


### Windows 10 +
```s

```


#### GitBash
1- Baixe o instalador - (https://git-scm.com/downloads)[https://git-scm.com/downloads].
2- Clique em .exe; ​
3- Inicia Git Bash;

#### Chocolatey - Gerenciador de pacote Windows

##### Instalação [https://chocolatey.org/install](https://chocolatey.org/install)

PowerShell(Administrador)
```s
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))

# mostra versão do gereciador
choco
```

#### Instalação de pacote (Java ou similar)

```s
choco install jdk11 -params "source=false"

# ver versão
java -version
```
#### Atualizar pacote (Java ou similar)

```s
choco install jdk11 -params "static=false"
```

#### Instalação de javaruntim (Java ou similar)

```s
choco install javaruntime
```

obs: Caso o comando "java -version" não apresenta versão do Java será necessário configurar variável de ambiente.


### Dependencia Java

#### Maven

```s
# o.s. Linux
sudo apt install maven
```

```s
# o.s. Windows
choco install maven
```

#### Gradle

```s
# o.s. Linux
sudo apt install gradle
```

```s
# o.s. Windows
choco install gradle
```