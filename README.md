# HelloArduBot &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/IntelAgir-Research-Group/OiArduBot/blob/main/LICENSE) [![npm](https://img.shields.io/badge/-npm-CB3837?logo=npm)](https://www.npmjs.com/package/npm/v/6.14.4) [![Vue.js](https://img.shields.io/badge/-Vue.js-388a65?logo=vue.js)](https://vuejs.org/) [![Eclipse IDE](https://img.shields.io/badge/-Eclipse%20IDE-2C2255?logo=EclipseIDE)](https://www.eclipse.org/downloads/) [![Xtext](https://img.shields.io/badge/-Xtext-2C2255)](https://www.eclipse.org/Xtext/) [![Xtend](https://img.shields.io/badge/-Xtend-2C2255)](https://www.eclipse.org/xtend/) [![Arduino](https://img.shields.io/badge/-Arduino-1f635b?logo=arduino)](https://www.arduino.cc/)

<p align="center">
<img src="images/logo2.png" width="30%">
</p>

**HelloArduBot: A DSL For Teaching Programming To Incoming Students With Open-source Robotic (OSR) Projects**

This DSL was initially designed in the bachelor project of Gustavo Slomski at UTFPR, Francisco Beltrão - Brazil, under the supervision of Professor [Michel Albonico](https://michelalbonico.github.io/). Its first version, in Portuguese, can be found [here](https://github.com/IntelAgir-Research-Group/OiArduBot). This version has especially been developed for further international collaboration.

**Do you want to cite us?**

```
@inproceedings{OSS_2022_HelloArduBot,
  title = {HelloArduBot: A DSL For Teaching Programming To Incoming Students With Open-source Robotic (OSR) Projects},
  author = { Gustavo Slomski and Adair José Rohlin and Paulo Varela and Michel Albonico },
  pages = { To appear },
  month = { June },
  publisher = {{Springer}},
  year      = {2021},
  booktitle = { Open Source Systems - 18th {IFIP} {WG} 2.13 International Conference,
               {OSS} 2021, Madrid, Spain, September 6-10, 2022, Proceedings }
}
```

## Artifcats

If you are interested in extending/adapting it, here is the list of software/hardware artifacts HelloArduBot is based on:
<br>

<p align="center">
<img src="images/eclipse.png" alt="Eclipse IDE"  width="120">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/xtext.png" width="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/xtend.png" width="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/arduino.png" width="60">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="images/vue.png" width="40">
</p>
<br>

## Language Model

The following model is used for this version of HelloArduBot:

<br>
<img src="images/class-diagram.png">
<br>

## Editor
We also make available the source code of HelloArduBot language editor, in the folder **./editor**. It simplifies the process, where students write their code in HelloArduBot, and can download a **.ino** file to be uploaded to Arduino-based robots.

### Follow the steps to run it:
> 1. [Clone the Project](#part-1-clone-the-project)
> 2. [Run the HelloArduBot Translator](#part-2-run-the-helloardubot-translator)
> 3. [Run the Editor Backend](#part-3-run-the-editor-backend)
> 4. [Run the HelloArduBot Editor](#part-4-run-the-helloardubot-editor)
<br/>

### Part 1. Clone the Project
<br>

```
git clone https://github.com/IntelAgir-Research-Group/oiArdubot-editor.git
```

### Part 2. Run the HelloArduBot Translator
<br>

2.1 Go to the oiArdubot-editor/backend/language_server dir:

```
$ cd oiArdubot-editor/backend/language_server
```

<br>

2.2 Run the JAR with the HelluArduBot translator:

```
java -jar language_server.jar
```

<br>

Then, you must see the following message:
<img src="images/languageserver.png" width="70%">
<br>

### Part 3. Run the Editor Backend
<br/>

3.1 Go back to the oiArdubot-editor/backend dir:

```
cd oiArdubot-editor/backend
```

<br>

3.2 Install the dependencies:

```
npm install
```

<br>

3.3 Run the backend server:

```
npm run start
```

<br>

Then, you must see the following message:

<img src="images/backend.png" width="50%">
<br>

### Part 4. Run the HelloArduBot Editor


4.1 Go to the oiArdubot-editor/frontend dir:

```
$ cd oiArdubot-editor/frontend
```
<br>

4.2 Install the dependencies:
```
npm install
```
<br>

4.3 Run the local server:
```
npm run serve
```



Then, you must see the following message:

<img src="images/frontend.png" width="50%">
<br>

Now you can access the HelloArduBot editor through  the URL [http://localhost:8080/](http://localhost:8080/) on your preferred browser:

<br>
<img src="images/editor2.png">
<br>
<br>

## Video Tutorial

See [this](#) short video of how to code a simple project with HelloArduBot.

## Do you want to contribute or collaborate?

Contact-us on [discord](https://discord.com/):

```Gustavo: Gust4v0#4049```

```Michel: michelalbonico#4386```

or join our discussion server [aqui](https://discord.gg/5tk6D9g9TW).

You can also send an email to [Professor Michel Albonico](mailto:michelalbonico@utfpr.edu.br).

We will be happy to collaborate!




