# OiArduBot &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/IntelAgir-Research-Group/OiArduBot/blob/main/LICENSE) [![npm](https://img.shields.io/badge/-npm-CB3837?logo=npm)](https://www.npmjs.com/package/npm/v/6.14.4) [![Vue.js](https://img.shields.io/badge/-Vue.js-388a65?logo=vue.js)](https://vuejs.org/) [![Eclipse IDE](https://img.shields.io/badge/-Eclipse%20IDE-2C2255?logo=EclipseIDE)](https://www.eclipse.org/downloads/) [![Xtext](https://img.shields.io/badge/-Xtext-2C2255)](https://www.eclipse.org/Xtext/) [![Xtend](https://img.shields.io/badge/-Xtend-2C2255)](https://www.eclipse.org/xtend/) [![Arduino](https://img.shields.io/badge/-Arduino-1f635b?logo=arduino)](https://www.arduino.cc/)

<p align="center">
<img src="images/logo2.png" width="30%">
</p>
Linguagem de alto nível baseada no Portugol para o ensino de programação com Arduino.

Essa linguagem de domínio específico foi desenvolvida como Trabalho de Conclusão de curso, na UTFPR, Francisco Beltrão, sob a orientação do professor [Michel Albonico](https://michelalbonico.github.io/) e coorientação da Profa. Maici Leite.

## Tecnologias
Para que o desenvolvimento e implementação desse projeto fosse possível, foram utilizadas diversas tecnologias, como seguem elencadas logo abaixo.
<br>

<p align="center">
<img src="images/eclipse.png" alt="Eclipse IDE"  width="120">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/xtext.png" width="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/xtend.png" width="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/arduino.png" width="60">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/vue.png" width="40">
</p>

> - [Eclipse IDE](https://www.eclipse.org/downloads/)
> - [Xtext](https://www.eclipse.org/Xtext/)
> - [Xtend](https://www.eclipse.org/xtend/)
> - [Arduino](https://www.arduino.cc/)
> - [Vue.js](https://vuejs.org/)
<br>

## Modelo

O modelo usado para desenvolvimento da linguagem é ilustrado abaixo, tendo sido exportado do nosso projeto Xtext no Eclipse.
<br>
> <img src="images/class-diagram.png">
Com base nele implementamos todas as classes existentes na [OiArduBot](https://github.com/IntelAgir-Research-Group/OiArduBot).
<br>
<br>

## Arquitetura

Caso deseja fazer um tutorial de introdução para entender melhor como estas tecnologias funcionam e trabalham de forma cooperativa, acesse:

- [Tutorial de 15 minutos](https://www.eclipse.org/Xtext/documentation/102_domainmodelwalkthrough.html): disponível no site oficial do Xtext;
- [Tutorial de 15 minutos extendido](https://www.eclipse.org/Xtext/documentation/103_domainmodelnextsteps.html): extensão do tutorial anterior;
- [Gramática do Xtext](https://www.eclipse.org/Xtext/documentation/301_grammarlanguage.html): artigo introdutório sobre a gramática que o Xtext utiliza.
<br>

## Dependências
Existem algumas dependências para execução do projeto, que podem ser baixadas a partir da lista de links a seguir.

> 1. JDK (Java Development Kit): https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html;
> 2. Eclipse e Xtext: https://www.eclipse.org/Xtext/ - Após iniciar a instalação, selecione a opção que faz menção ao desenvolvimento de linguagens de domínio específico (DSL);
> 3. Node JS e NPM: https://nodejs.org/en/download/.

## Editor
Caso deseje, você pode acessar o repositório do editor clicando [aqui](https://github.com/IntelAgir-Research-Group/oiArdubot-editor), que está separado para fins de organização. Siga as instruções abaixo para execução do projeto.


### O passo a passo se divide em 4 partes:
> 1. [Clonar o projeto](#parte-1-clonar-projeto)
> 2. [Tradutor da Linguagem](#parte-2-tradutor-da-linguagem)
> 3. [Backend](#parte-3-backend)
> 4. [Frontend](#parte-4-frontend)

<br/>

### Parte 1. Clonar projeto
<br>

1.1 Instalar o git em seu computador

Caso ainda não tenha o git instalado em sua máquina, siga um tutorial rápido de instalação clicando [aqui](https://www.hostinger.com.br/tutoriais/tutorial-do-git-basics-introducao#:~:text=Instalar%20o%20GIT%20no%20Windows%3A&text=Acesse%20o%20site%20oficial%20e,concluir%20com%20%C3%AAxito%20a%20instala%C3%A7%C3%A3o.). Se já tiver o git devidamente instalado e configurado, pode pular para o próximo passo.
<br>

1.2 Faça o clone do projeto

Com o git já instalado, execute o seguinte comando para clonar o projeto.
```
git clone https://github.com/IntelAgir-Research-Group/oiArdubot-editor.git
```
<br>

1.3 Acessar o projeto

Se desejar, acesse o projeto por meio do comando abaixo
```
cd oiArdubot-editor
```

### Parte 2. Tradutor da Linguagem
<br>

2.1 Acesse o diretório oiArdubot-editor/backend/language_server
```
$ cd oiArdubot-editor/backend/language_server
```
<br>

2.2 Execute o tradutor
```
java -jar language_server.jar
```
<br>

Se tudo der certo, você deverá ver uma mensagem como esta
> <img src="images/languageserver.png" width="70%">
<br>

### Parte 3. Backend
<br/>

3.1 Acesse o diretório oiArdubot-editor/backend
```
cd oiArdubot-editor/backend
```
<br>

3.2 Instale as dependências do projeto
```
npm install
```
<br>

3.3 Execute o servidor backend do projeto
```
npm run start
```
<br>

Se tudo der certo, você deverá ver uma mensagem como esta
> <img src="images/backend.png" width="50%">
<br>

### Parte 4. Frontend


4.1 Acesse o diretório oiArdubot-editor/frontend
```
$ cd oiArdubot-editor/frontend
```
<br>

4.2 Instale as dependências do projeto
```
npm install
```
<br>

4.3 Execução do servidor para acesso local
```
npm run serve
```



Se tudo der certo, você deverá ver agora a seguinte mensagem:
> <img src="images/frontend.png" width="50%">
<br>

Acesse [http://localhost:8080/](http://localhost:8080/) no seu navegador e você deverá ver o editor em execução
<br>
> <img src="images/editor2.png">
<br>
<br>

## Contribua

Caso queira contribuir com o projeto, estamos abertos para sugestões e melhorias! Se desejar, contate-nos no [discord](https://discord.com/):

```Gustavo: Gust4v0#4049```

```Michel: michelalbonico#4386```

ou participe do nosso servidor no discord clicando [aqui](https://discord.gg/5tk6D9g9TW).

<br/>

## Tutoriais

Se desejar aprender mais sobre o Xtext e como implementar novas funcionalidades na OiArduBot, você pode acessar nosso canal no yotube: https://www.youtube.com/channel/UCA0wEiCDD129-Mrc8RFFIDQ.


### Vídeo mais recente: Como implementar uma nova funcionalidade na OiArduBot

Link: https://www.youtube.com/watch?v=UW5lpKMP9DY




