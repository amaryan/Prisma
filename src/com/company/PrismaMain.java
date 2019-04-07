package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class PrismaMain {
    /**
     * Clase que crea prismas
     * Ponemos en static la lista , el contado y la clase prisma para poder llamarla desde cualquier metodo si fuese necesario
     *
     * @author Agora Martin
     */
    static Prisma prisma;
    static ArrayList<Float> prismList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("CREANDO OBJETO PRISMA......");
        System.out.println("================================================================");

        createPrisma();
        sortPrisma();

        /*EL FOR EACH TIENE ESTA ESTRUCTURA
        for(objetodelalista variable:nombrelista){
        accion a hacer con la lista
        }
         */
        showAllBaseAreaList();
    }

    /**
     * Mostramos todas las areas base de todas las listas
     */
    private static void showAllBaseAreaList() {
        for (Float x : prismList) {
            System.out.println("prisma nª: " + prismList.indexOf(x) + " tiene el area total de: " + x);
        }
    }

    /**
     * Aqui ordenamos la lista con todas las areas base al reves de mayor a menor usando collection
     */
    private static void sortPrisma() {
        System.out.println("Ahora vamos a ordenar.....");
        prismList.sort(null);
        Collections.reverse(prismList);
    }

    /**
     * aqui usando un for hasta 3 creamos prismas y anyadimos su area total a la lista
     */
    private static void createPrisma() {
        for (int i = 1; i <= 3; i++) {
            prisma = new Prisma();
            System.out.println("============================================================");
            System.out.println("Creando prisma... nª: " + i);
            prisma.setAlturaPrisma(createRandom());
            System.out.println("La altura es: " + prisma.getAlturaPrisma());
            prisma.setBaseTriangulo(createRandom());
            System.out.println("La base es: " + prisma.getBaseTriangulo());
            System.out.println("El area total es de: " + prisma.areaTotal());
            System.out.println("============================================================");
            prismList.add(prisma.areaTotal());
        }
    }

    /**
     * Creacion de un numero aleatorio tipo int que llega hasta el numero 99
     *
     * @return random = numero random
     */
    private static int createRandom() {
        int random = (int) (Math.random() * 100);
        return random;
    }
}