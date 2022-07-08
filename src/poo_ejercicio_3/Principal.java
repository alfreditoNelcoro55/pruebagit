/* Construir un programa que dada una serie de vehículos caracterizados por su
 * marca, modelo y precio, imprima las propiedades del vehículo más barato.  Para
 * ello, se deberán leer por teclado las características de cada vehículo y crear
 * una clase que represente a cada uno de ellos.
 */
package poo_ejercicio_3;

import java.util.Scanner;

public class Principal {
                                                             //método estático pertenece a la Clase
    public static int indiceCocheMBarato(Vehiculo coches[]){ //Creo un método estático 'int'que devuelve un
        float precio;        //variable local                //índice. Será el índice del coche más barato
        int indice = 0;      //variable local 
        
        precio = coches[0].getPrecio();   //donde guardo el primer precio del primer coche
        for(int i = 1; i < coches.length; i++){  //empiezo a comparar cuál es el precio menor
            if(coches[i].getPrecio()< precio){
                precio = coches[i].getPrecio();
                indice = i;                      //almaceno el índice del coche más barato
            }
        }
        return indice;
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos,indiceBarato;
        
        System.out.print("Digite la cantidad de vehículos: ");
        numeroVehiculos = entrada.nextInt();
        
        Vehiculo coches[] = new Vehiculo[numeroVehiculos]; //creamos un objeto 'coches' con arreglos []
        
        for(int i = 0; i < coches.length; i++){
            entrada.nextLine();
            System.out.println("\nDigite las características del coche "+(i+1));
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio); //llamamos al método Constructor
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
        
    }
    
}
