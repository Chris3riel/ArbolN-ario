# Implementación de un árbol n-ario en Java con NetBeans

## Introducción

Este proyecto presenta una implementación de árboles n-arios en Java utilizando el entorno de desarrollo NetBeans. Los árboles n-arios son estructuras de datos jerárquicas que permiten almacenar información de manera organizada y eficiente. A diferencia de los árboles binarios, donde cada nodo tiene como máximo dos hijos, los árboles n-arios pueden tener hasta n hijos por nodo, lo que los hace más versátiles para modelar relaciones complejas.

## Descripción del proyecto

### El proyecto consta de las siguientes clases:
Nodo: Representa un nodo individual en el árbol n-ario. Contiene información como el dato asociado al nodo y una lista de referencias a sus hijos.
ArbolNario: Implementa la estructura principal del árbol n-ario. Contiene el nodo raíz del árbol y proporciona métodos para agregar, eliminar, buscar y recorrer nodos.

### Características principales:
Implementación robusta de árboles n-arios en Java.
Métodos para agregar, eliminar y buscar nodos en el árbol.
Recorridos preorden, inorden y posorden para explorar el árbol.
Implementación eficiente que aprovecha las capacidades de Java y NetBeans.

## Configuración del proyecto

1. Descargar e instalar NetBeans IDE.
2. Crear un nuevo proyecto de aplicación Java.
3. Agregar las clases Nodo y ArbolNario al proyecto.
4. Importar las bibliotecas necesarias (por ejemplo, java.util.ArrayList).

## Uso del proyecto

El proyecto proporciona una API simple para trabajar con árboles n-arios. A continuación, se muestran algunos ejemplos de uso:

Crear un árbol n-ario:
java
ArbolNario arbol = new ArbolNario();

Agregar un nodo al árbol:
java
Nodo nodo = new Nodo("Dato del nodo");
arbol.agregarNodo(nodo);

Eliminar un nodo del árbol:
java
arbol.eliminarNodo(nodo);


Buscar un nodo en el árbol:
java
Nodo nodoBuscado = arbol.buscarNodo("Dato del nodo buscado");

Recorrer el árbol en preorden:
java
arbol.recorrerPreorden();

Recorrer el árbol en inorden:
java
arbol.recorrerInorden();

Recorrer el árbol en posorden:

java
arbol.recorrerPosorden();


