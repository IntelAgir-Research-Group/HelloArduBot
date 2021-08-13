# OiArduBot &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/IntelAgir-Research-Group/OiArduBot/blob/main/LICENSE) [![npm](https://img.shields.io/badge/-npm-CB3837?logo=npm)](https://www.npmjs.com/package/npm/v/6.14.4) [![Vue.js](https://img.shields.io/badge/-Vue.js-4FC08D?logo=vue.js)](https://vuejs.org/) [![Eclipse IDE](https://img.shields.io/badge/-Eclipse%20IDE-2C2255?logo=EclipseIDE)](https://www.eclipse.org/downloads/) [![Xtext](https://img.shields.io/badge/-Xtext-2C2255)](https://www.eclipse.org/Xtext/) [![Xtend](https://img.shields.io/badge/-Xtend-2C2255)](https://www.eclipse.org/xtend/) [![Arduino](https://img.shields.io/badge/-Arduino-blue?logo=arduino)](https://www.eclipse.org/xtend/)

Linguagem de alto nível baseada no Portugol para o ensino de programação com Arduino.

Essa linguagem de domínio específico foi desenvolvida como Trabalho de Conclusão de curso, na UTFPR, Francisco Beltrão, sob a orientação do professor [Michel Albonico](https://michelalbonico.github.io/) e coorientação da Profa. Maici Leite.

## Tecnologias



<br>

## Modelo

O modelo usado para desenvolvimento da linguagem é ilustrado abaixo, tendo sido exportado do nosso projeto Xtext no Eclipse.
<br>
> <img src="images/class-diagram.png">
Com base nele implementamos todas as classes existentes na [OiArduBot](https://github.com/IntelAgir-Research-Group/OiArduBot).
<br>

## Editor
### Faça o clone do projeto clicando [aqui](https://github.com/IntelAgir-Research-Group/oiArdubot-editor) e siga as instruções abaixo para execução do projeto.

<br>

### O passo a passo se divide em 3 partes:
> 1. [Tradutor da Linguagem](#parte-1-tradutor)
> 2. [Backend](#parte-2-backend)
> 3. [Frontend](#parte-3-frontend)

<br> 

### Parte 1. Tradutor da Linguagem
<br>

1.1 Acesse o diretório oiArdubot-editor/backend/language_server
```
$ cd oiArdubot-editor/backend/language_server
```
<br>

1.2 Execute o tradutor
```
java -jar language_server.jar
```
<br>

Se tudo der certo, você deverá ver uma mensagem como esta
> <img src="images/languageserver.png">
<br>

### Parte 2. Backend
<br>

2.1 Acesse o diretório oiArdubot-editor/backend
```
$ cd oiArdubot-editor/backend
```
<br>

2.2 Instale as dependências do projeto
```
npm install
```
<br>

2.3 Execute o servidor backend do projeto
```
npm run start
```
<br>

Se tudo der certo, você deverá ver uma mensagem como esta
> <img src="images/backend.png">
<br>

### Parte 3. Frontend
<br>

3.1 Acesse o diretório oiArdubot-editor/frontend
```
$ cd oiArdubot-editor/frontend
```
<br>

3.2 Instale as dependências do projeto
```
npm install
```
<br>

3.3 Execução do servidor para acesso local
```
npm run serve
```



Se tudo der certo, você deverá ver agora a seguinte mensagem:
> <img src="images/frontend.png">
<br>

Acesse [http://localhost:8080/](http://localhost:8080/) no seu navegador e você deverá ver o editor em execução
<br>
> <img src="images/editor2.png">





