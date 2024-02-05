package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in);
    String nombre, placa;
    float distancia, litros, precio, consumoTotal, costoTotal;

        System.out.println("nombre: ");
        nombre = lea.nextLine();
        System.out.println("placa");
        placa = lea.nextLine();
        System.out.println("Distancia del viaje: ");
        distancia = lea.nextFloat();
        System.out.println("consumo de combustible(litros por cada 100 km): ");
        litros = lea.nextFloat();
        System.out.println("precio por litros: ");
        precio = lea.nextFloat();

        consumoTotal = distancia*litros;
        costoTotal= consumoTotal*precio;

        System.out.println("nombre: " + nombre);
        System.out.println("placa: " + placa);
        System.out.println("consumo total de combustible:" + consumoTotal + "litros");
        System.out.println("costo total de combustible: $" + costoTotal);





    }
}