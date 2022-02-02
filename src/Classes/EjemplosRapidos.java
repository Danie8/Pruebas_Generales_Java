package Classes;

import Interfaces.ExamenJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosRapidos implements ExamenJava {
    //Constructores
    public EjemplosRapidos(){
        //Constructor Vacío
    }
    //Métodos
    @Override
    public void holaMundo(){
        System.out.println("Hola, mundo. Soy Daniel.");
    }
    @Override
    public void ejemploFor(){
        String[] alumnos={"Daniel","Fernanda","Elihu","Julio"};
        System.out.println("Este es un ejemplo de For:");
        for(int i = 0; i<alumnos.length; i++){
            System.out.println(alumnos[i]);
        }
        System.out.println("Este es un ejemplo de For-Each:\n");
        for(String Aux:alumnos){
            System.out.println(Aux);
        }
    }

    // La lista debe de contener estos elementos (juan, pedro, jose, maria, sofia)
    // Itera la lista y actualizar el primer índice pasando el primer carácter a mayúscula
    // Imprimir la lista con un for-each
    @Override
    public void crearLista() {
        //List<String> ejemploLista = new ArrayList<>();
        List<String> Nombres = Arrays.asList("juan", "pedro", "jose", "maria", "sofia");

        System.out.println("\nLista Original:");
        for (String Aux : Nombres) {
            System.out.println(Aux);
        }

        for (int i = 0; i < Nombres.size(); i++) {
            char[] nombre = Nombres.get(i).toCharArray();
            nombre[0] = Character.toUpperCase(nombre[0]);
            Nombres.set(i, nombre.toString());
        }

        System.out.println("\nLista Modificada:");
        for (String Aux : Nombres) {
            System.out.println(Aux);
        }
    }

    @Override
    public void imprimirTriangulo() {

    }

    @Override
    public void operaListaNumeros() {

    }

    @Override
    public void operaListaPalabras() {

    }

    @Override
    public void adivina() {

    }

    @Override
    public void mayor() {

    }

    @Override
    public void operaTresListas() {

    }

    @Override
    public void matrices() {

    }
}
