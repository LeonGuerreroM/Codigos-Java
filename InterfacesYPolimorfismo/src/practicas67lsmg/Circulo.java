
package practicas67lsmg;

public class Circulo extends Figura implements Ordenables {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    int calcularArea(){
        Area=(int) Math.PI*(radio*radio);
        return Area;
    }
    

    @Override
    public int esmasgrande(Ordenables S ) {
        if(this.calcularArea()<(((Figura)S).calcularArea())){
            return -1;
        }
        else if(this.calcularArea()>(((Figura)S).calcularArea())){
            return 1;
        }else{
            return 0;
        }
    }
}
