package Classes;

import Classes.EjemplosRapidos;

public class Main {
    public static void main(String [] args){

        EjemplosRapidos ejemplo=new EjemplosRapidos();
        Rectangle R=new Triangle(5,2,(float)5.385,5,2);
        Triangle T=new Triangle(5,2,(float)5.385,5,2);
        ejemplo.holaMundo();
        ejemplo.ejemploFor();

        //implementacion de herencia, interface, sobrecarga y sobreescritura
        //dudas****
        R.perimeter(5,2);
        T.perimeter((float)5.385, 5, 2);
        R.area();
        R.area(10,50);

        //

        ejemplo.crearLista();

    }
}
