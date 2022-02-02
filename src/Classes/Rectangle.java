package Classes;

import Interfaces.Form;

public class Rectangle implements Form {

    //region [Propiedades]
    private float base,height;
    //endregion

    //region [Constructores]
        public Rectangle(float base, float height){
        this.setBase(base);
        this.setHeight(height);
    }
    //endregion

    //region [Getters y Setters]
    public void setBase(float base){
        this.base = base;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public double getBase() {
        return this.base;
    }
    public double getHeight() {
        return this.height;
    }
    //endregion

    //region [Métodos]
    public void area(float base, float height){
        System.out.println("El área es: "+height*base);
    }

    public void area(){
        System.out.println("\nEl área es: "+height*base);
    }

    @Override
    public void perimeter(float base, float height) {
        System.out.println("\nEl perímetro es: "+height*2+base*2);
    }

}
