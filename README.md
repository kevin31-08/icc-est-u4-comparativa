## CONCLUSION.
Se busca omstrar en consola los tiempo de ejecucion que requieren los metodos de ordenamineto Insertion y Quick Sort para el ordenamiento de una lista en dos formas diferentes, la una completamente desordenada y la otra con un ultimo elemento de ordenar,usando un controlador que contiene ambos metodos y se usa dentro de otro metodo llamado resultado que recopila la informacion de la ejecucion para mostrar los dichos datos en consola.

## RESULTADOS OBTENIDOS.

## Tabla 1. Escenario 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserccion | Tiempo Quick Sort | Algortimo mas rapido| Observacion |
|:--------------|:------------|:-------:|:-------:|:-----------|
| 10.000 | 65,35 ms |14,35 ms | QuickSort | El metodo QuickSort es 4 veces mas rapido|
| 50.000 | 1040,10 ms| 54,73 ms | QuickSort | El metodo QuickSort es 20 veces mas rapido |
| 100.000 | 6192,10 ms | 153,54 ms| QuickSort | El metodo QuickSort es 40 veces mas rapido |

## Tabla 2. Escenario 2: arreglo ordenado mas una nueva persona

| Tamaño de muestra | Tiempo Inserccion | Tiempo Quick Sort | Algortimo mas rapido| Observacion |
|:--------------|:------------|:-------:|:-------:|:-----------|
| 10.001 | 0,11 ms | 2209,91 ms | InsertionSort | El metodo InsertionSort es 20.090 veces mas rapido|
| 50.001 | 0,73 ms| 7593,03 ms | InsertionSort | El metodo InsertionSort es 10.401 veces mas rapido |
| 100.001 | 1.58 ms | 22544,64 ms| InsertionSort | El metodo QuickSort es 14.268 veces mas rapido |

## Analisis Requeridos 

- ¿Qué algoritmo fue más rápido en el escenario desordenado?

En los tamaños de listas desordenados el metodo QuickSort fue el mas rapido en estos casos. Esto se debe a que el metodo tiene una complejidad de O(n log n) que lo hace mucho mas eficiente.

- ¿Qué algoritmo fue más rápido en el escenario casi ordenado?

En este caso el InsertionSort fue mucho mas rapido ,llegando a ser 20.090 mas rapido . Esto se debe a que el insertion toma un elemento y lo compara hacia atras y como el arreglo esta casi ordenado menos el ultimo elemento unicamente recorre hacia atras buscando la posicion del ultimo elemento , lo que reduce mucho el tiempo de ejecucion que se toma.

- ¿El crecimiento del tamaño de la muestra afecto por igual a los dos algoritmos?

No eso depende de como se presente cada escenario , el crecimiento del tamaño de un arreglo puede afectar muchos mas a uno que al otro, y lo tenemos de ejemplo: en el primer escenario el InsertionSort resulto mucho mas afectado en su tiempo de ejecucion y en QuickSort el segundo escenario lo afecto mas. Esto es debido a su complejidad y logica que tiene cada algoritmo.

- ¿Por qué inserción puede mejorar cuando el arreglo ya está casi ordenado?

El InsertionSort funciona comparando elementos hacia atras , asi seprando los ordenados con el que falta por ordenar , asi desplaza cada elemento hasta encontrar la poscion en la que va correctamente , esto provoca que realize muy pocas comparaciones ,porque no realizo ningun desplazamiento excepto el ultimo lo que provoco que su tiempo de ejcucion se redusca de manera significativa.

- ¿Por qué QuickSort suele ser mejor cuando los datos estan muy desordenados?

El QuickSort divide el problema en pivotes desde el inicio , estos distribuyen los elementos de forma muy efeciente cuando el arreglo esta desordenado , este se organiza en sudarreglos cada vez mas pequeños lo que hace comparaciones O(n log n) , esto provoco que su tiempo de ejecucion al realizar dichas comparaciones se vea afectado.

## CONCLUSIONES.
Conclusion 1: El metodo QuickSort fue muy eficiente cuando los datos estan desordenados , porque divide mejor los distintos grupos de pivotes y eso mejora las comparaciones , esto provoco que tenga tiempos muchos mas bajos que el InsertionSort en los casos de ordenar . Pero en cambio el Insertion debido a su complejidad O(n^2) se demoro mucho mas por las comparaciones que hace internamente.

Conclusion 2: El metodo InsertSort mostro mejor rendimiento cuando los arreglos ya estaba ordenamos menos un elemento y su tiempo de ejecucion se redujo mucho incluso en arreglos de 100.000 elementos. Esto demuestra que el Insertio en arreglos casi en su mayoria arreglados aprovecha eficazmente los elementos ordenados evitando comparaciones demas y trabajo innecesario.

Conclusión 3: En el trabajo podemos deducir que un rendimiento del algoritmo no solo se centra en el metodo de ordenamiento que se utiliza ,sino que tambien en el estado de los arreglos en los que se encuentran o estan organizados , la eleccion de un metodo de ordenamiento no solo depende de que tan rapido ordene sino tambien su complejidad .