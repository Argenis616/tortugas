# icc-tortuga
Tortuga en JavaFX para hacer dibujos

Utilizar interfaces gráficas siempre es un algo más intrincado, aunque mucho más vistoso y emocionante.  Para que comiences a trabajar con ellas, usaremos el apoyo de otra herramienta para compilación: _Maven_.  Es como _Ant_, pero permite instalar dependencias de forma automática.  Así como _ant_ requiere un archivo ```build.xml```, _Maven_ utiliza un archivo ```pom.xml```.

Suponiendo que incias en una terminal, dentro del directorio de este repo, para compilar y ejecutar el codigo auxiliar entra a la carpeta _tortugafx_:

```
cd tortugafx
```

y utiliza

```
mvn clean javafx:run
```

Para generar la documentación utiliza

```
mvn javadoc:javadoc
```

encontrarás los archivos html generados dentro del directorio

```
target/site/apidocs/
```
