
package poo_ejercicio_3;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;
    
    
    //Métodos
    //Constructor

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    //Método Get precio

    public float getPrecio() {
        return precio;
    }
    
    //Método para mostrar datos

    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio $: "+precio+"\n";
    }
    
}
