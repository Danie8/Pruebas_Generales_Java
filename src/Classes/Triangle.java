package Classes;

public class Triangle extends Rectangle {

    //region [Propiedades]
    private float ladoA,ladoB,ladoC;
    //endregion

    //region [Constructores]
    public Triangle(float base, float height,float ladoA,float ladoB,float ladoC){
        super(base,height);
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
    //endregion

    //region [Métodos]
    @Override
    public void area(float base,float height){
        System.out.println("El área es: "+(height*base)/2);
    }

    @Override
    public void perimeter(float base, float height){
        System.out.println("No puedo calcular el perimetro con estos parámetros");
    }

    public void perimeter(float ladoA,float ladoB,float ladoC) {
        System.out.println("El perímetro es: "+(ladoA+ladoB+ladoC));
    }
    //endregion
}
