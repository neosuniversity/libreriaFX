# libreriaFX JAVA 11


Repositorio que tiene el codigo del curso Java 11 premium de principiante a experto el cual te enseña a realizar una aplicación de 0 a 100%

----------------------------------
Pasos para instalación de proyecto :heavy_exclamation_mark:
----------------------------------
1. Clonar el proyecto ó bien descargar el zip (Realizar un unzip)

2. Importar el proyecto en Intellij IDE usando la **opcion Open** come se muestra en la imagen
![Image of import](https://github.com/neosuniversity/libreriaFX/blob/master/src/images/intellij-open.png)

3. Es obligarorio usar JDK 11 para poder configurar el proyecto.

4. Bajar el modulo para el soporte de Java FX 11 de https://gluonhq.com/products/javafx/ (bajar respecto a su sistema operativo)

5. Ahora va a crear una carpeta en raiz con el nombre de software
Ejemplo Windows: C:\software

6. La carpeta software va a realizar un unzip y del archivo openjfx-11.0.2_windows-x64_bin-sdk.zip

7. La ruta final de los binarios debera ser la siguiente:
 Ejemplo en Windows C:\software\javafx-sdk-11.0.2\bin
 ![Image of import](https://github.com/neosuniversity/libreriaFX/blob/master/src/images/vm_fx.png)
 
 8. Si cambia la ruta del unzip o nombre de carpetas de los pasos 5,6 y 7 debera configurar en el su Intellij IDEA lo siguiente:
 En las opciones de VM: el proyecto tiene configurado lo siguiente: C:/software/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml
 Debera reemplazar : <TU_PATH_UNZIP>/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml
 
 9. Se recomienda dejar las configuraciones por default ya que esto hara que el soporte a dudas sea mas rapido de resolver.

**Nota**: Tratar de usar la opción de **Import ProJect** de Intellij IDE realizara una sobreescritura de las configuraciones que son necesarias para que el proyecto funcione, motivo por el cual se aconseja que realice la importacion del proyecto como se describe en el paso número 2.

