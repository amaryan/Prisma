package com.company;

public class Prisma {
    /**
     * Attributos del prisma
     */
    int baseTriangulo;
    int alturaPrisma;


    public int getBaseTriangulo() {

        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Metodos para sacar el area total del prisma
     *
     * @return
     */

    public float alturaTriangulo() {
        float alturaTriangulo = (float) (Math.sqrt(3) / 2) * baseTriangulo;
        return alturaTriangulo;
    }

    public float areaBase() {
        float areaBase = (baseTriangulo * alturaTriangulo()) / 2;
        return areaBase;
    }

    public float perimetro() {
        float perimetro = baseTriangulo * 3;
        return perimetro;
    }

    public float areaLateral() {
        float areaLateral = perimetro() * alturaPrisma;
        return areaLateral;
    }

    public float areaTotal() {
        float areaTotal = 2 * (areaBase()) + areaLateral();
        return areaTotal;
    }
}
