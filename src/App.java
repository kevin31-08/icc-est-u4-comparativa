import java.util.concurrent.Callable;

import controles.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Bencharking;

public class App {
    public static void main(String[] args) throws Exception {
        SortPersonaMethods controller = new SortPersonaMethods();
        Persona[] personas = generarPersonas(10000);
        Persona[] personasInsercion = personas.clone();
        Persona[] personasQuick = personas.clone();

         Resultado tiempo1 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsercion);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personasInsercion.length
        );
        Resultado tiempo2 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasQuick,0,personasQuick.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personasQuick.length
        );

        Persona[] personas1 = generarPersonas(10_001);
        controller.insertionSort(personas1);
        personas1[personas1.length-1] = new Persona("kevin ", 10);

        Resultado tiempo3 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personas1);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personas1.length
        );

        Persona[] personas2 = generarPersonas(10_001);
        controller.quickSort(personas2, 0, personas2.length-1);
        personasQuick[personasQuick.length - 1] = new Persona("kevin s", 10);

        Resultado tiempo4 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(
                        personas2,
                        0,
                        personas2.length - 1
                    );
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personas2.length
        );
        
        
        System.out.println(tiempo1);
        System.out.println(tiempo2);
        System.out.println(tiempo3);
        System.out.println(tiempo4);


        Persona[] personas3 = generarPersonas(50_000);
        Persona[] personas4 = personas3.clone();
        Persona[] personas5 = personas3.clone();

        Resultado tiempo5 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personas4);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personas3.length
        );
        Resultado tiempo6 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personas5,0,personas5.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personas5.length
        );

        Persona[] personas7 = generarPersonas(50_001);
        controller.insertionSort(personas7);
        personas7[personas7.length-1] = new Persona("Edwin ", 20);

        Resultado tiempo7 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personas7);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personas7.length
        );

        Persona[] personas8 = generarPersonas(50_001);
        controller.quickSort(personas8, 0, personas8.length-1);
        personas8[personas8.length-1] = new Persona("martin ", 23);

        Resultado tiempo8 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personas8,0,personas8.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personas8.length
        );

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        System.out.println(tiempo5);
        System.out.println(tiempo6);
        System.out.println(tiempo7);
        System.out.println(tiempo8);

        Persona[] personas9 = generarPersonas(100_000);
        Persona[] personas10 = personas9.clone();
        Persona[] personas11 = personas9.clone();

        Resultado tiempo9 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personas10);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personas10.length
        );
        Resultado tiempo10 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personas11,0,personas10.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personas11.length
        );

        Persona[] personas12 = generarPersonas(100_001);
        controller.insertionSort(personas12);
        personas12[personas12.length-1] = new Persona("Miguel ", 13);

        Resultado tiempo11 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personas12);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personas12.length
        );

        Persona[] personas13 = generarPersonas(100_001);
        controller.quickSort(personas13, 0, personas13.length-1);
        personas13[personas13.length-1] = new Persona("david ", 12);

        Resultado tiempo12 = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personas13,0,personas13.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personas13.length
        );

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        System.out.println(tiempo9);
        System.out.println(tiempo10);
        System.out.println(tiempo11);
        System.out.println(tiempo12);


    }

    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona" + (i + 1);
            int edad = (int)(Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }
}

    
   
