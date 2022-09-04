# LABORATORIO2 CVDS  
## LA HERRAMIENTA MAVEN
### Cuál es su mayor utilidad
la característica más importante de Maven es su capacidad de trabajar en red.  
Cuando definimos las dependencias de Maven, este sistema se encargará de ubicar las librerías que deseamos utilizar en Maven Central,  
el cual es un repositorio que contiene cientos de librerías constantemente actualizadas por sus creadores.  
  
### Fases de maven
1. Validación (validate): Validar que el proyecto es correcto.
2. Compilación (compile) : Genera los archivos .class, compilando las fuentes .java. No termina este en caso de que en algún .class haya un error.
3. Test (test): Probar el código fuente usando un framework de pruebas unitarias.
4. Empaquetar (package): Empaquetar el código compilado y transformarlo en algún formato tipo .jar o .war.
5. Instalar el código empaquetado en el repositorio local de Maven, para usarlo como dependencia de otros proyectos (install).
6.	Desplegar el código a un entorno (deploy): Ubica una copia del .jar a un servidor remoto,  
permitiendo el acceso a este a cualquier otro proyecto maven que tenga acceso a ese servidor.  
  
### Ciclos de vida de la construccion  
Cada proyecto de Maven tiene tres ciclos de vida independientes, que incluyen:  
1. ciclo de vida limpio: responsable de la limpieza del proyecto;
2. ciclo de vida predeterminado: responsable del despliegue del proyecto;
3. ciclo de vida del sitio: el sitio del documento responsable de crear el proyecto;  
  

### Para qué sirven los plugins  
Un Plugin es un fragmento o componente de código hecho para ampliar las funciones de un programa o de una herramienta.  
  
### Qué es y para qué sirve el repositorio central de maven  
El repositorio de Maven (o repositorio central) tiene una estructura que permite que los archivos como, por ejemplo,  
archivos JAR tengan versiones distintas que se descubren después fácilmente con un mecanismo de denominación bien conocido.  
A continuación, las herramientas de creación pueden utilizar estos nombres para extraer dinámicamente las dependencias de la aplicación.  
En la definición de la aplicación que se denomina archivo POM, cuando se utiliza Maven como una herramienta de compilación,  
simplemente denomine las dependencias y el proceso de compilación sabrá qué hacer a partir de ahí.  
  

# EJERCICIO DE LAS FIGURAS CREAR UN PROYECTO CON MAVEN  

* Desde consola usamos el siguiente commando  
<img width="305" alt="image" src="https://user-images.githubusercontent.com/98657146/188296668-ad6ca499-5a5f-4023-b47e-203e5d749ffd.png">   
* Eso nos va a pedir los parametros que nos dan en la guia  
<img width="268" alt="image" src="https://user-images.githubusercontent.com/98657146/188296714-8ea93f54-3356-4d56-82f5-d8bfd186a60d.png">
* Despues entramos a la carpeta Patterns y usamos el comando tree
<img width="250" alt="image" src="https://user-images.githubusercontent.com/98657146/188296728-c0a558eb-789b-4746-b4f8-61ced339df0e.png">
* Luego empaquetamos y usamos el siguiente comando 
<img width="312" alt="image" src="https://user-images.githubusercontent.com/98657146/188296737-f228c4e4-bf36-49c0-82e0-c90555feb039.png">
* Despues en la clase patterns app 
<img width="304" alt="image" src="https://user-images.githubusercontent.com/98657146/188296741-9d4a98e7-2de2-457d-ae7b-6388d20a34f2.png">
* Y ya modifica el nombre 
<img width="273" alt="image" src="https://user-images.githubusercontent.com/98657146/188296747-dd1a3f61-0307-4f6a-ab15-3209eb32c05e.png">
* Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
<img width="337" alt="image" src="https://user-images.githubusercontent.com/98657146/188296767-f3a24c70-1f27-491f-bb9a-d0360b98122c.png">
Solo toma el nombre ya que en la clase app solo tomamos el primer argumento
  
* Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido
<img width="239" alt="image" src="https://user-images.githubusercontent.com/98657146/188296792-eb5aed97-a1c9-43c8-945e-1ff96689cc0a.png">
<img width="345" alt="image" src="https://user-images.githubusercontent.com/98657146/188296800-d4fe0eb2-51f8-4c61-808f-725ba8b5e830.png">
  
   
 ## HACER EL ESQUELETO DE LA APLICACIÓN
 crear los paquetes  
 <img width="265" alt="image" src="https://user-images.githubusercontent.com/98657146/188296836-51f45bb5-7d91-41ec-8205-9ca5a729e646.png">
 <img width="144" alt="image" src="https://user-images.githubusercontent.com/98657146/188296841-218ed830-dc42-414b-8b06-7f491aa17b3c.png">
   
 Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:  
 * Sin parámetros  
 <img width="314" alt="image" src="https://user-images.githubusercontent.com/98657146/188296863-3c8e8c0b-5cdc-4a09-bbd1-bb2c9b2056df.png">
 No es una entrada valida ya que la clase ShapeMain require un parametro
 
 * Parámetro: qwerty  
 <img width="315" alt="image" src="https://user-images.githubusercontent.com/98657146/188296891-ad9c426e-9ebd-4481-a216-b31485379e89.png">
  No es una entrada valida ya que la clase shapeMain pide un parametro de la clase RegularShapeType
 
 * Parámetro: pentagon  
 <img width="315" alt="image" src="https://user-images.githubusercontent.com/98657146/188296923-507bb1a4-4535-4197-94fe-5bb9454daf69.png">
  No es una entrada valida ya que la clase shapeMain pide un parametro de la clase RegularShapeType
  
  * Parámetro Hexagon
  <img width="313" alt="image" src="https://user-images.githubusercontent.com/98657146/188296941-fe4104aa-b3f3-4806-9a7e-ead20b3bdb85.png">
  Es una entrada valida ya que entra un parametron correcto y la clase muestra por pantalla el umero de lados de la figura ingresada 
    
    
    
  ### PARA QUE SIRVE GITIGNORE  
 Es un archivo de texto que le dice a git que archivos o carpetas ignorar en un Proyecto  
 
  ### COMO SE USA
  Dentro del Proyecto creamos un archivo que se llame .gitignore en el que escribimos lo que no deseamos que se suba al git como : archivos , carpetas y extensiones
 







