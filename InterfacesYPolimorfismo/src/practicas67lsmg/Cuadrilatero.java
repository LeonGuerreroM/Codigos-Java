/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas67lsmg;

/**
 *
 * @author Sala5
 */
public class Cuadrilatero extends Figura implements Ordenables {
    int base;
    int altura;

    public Cuadrilatero(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    int calcularArea(){
        Area=base*altura;
        return Area;
    }

    @Override
    public int esmasgrande(Ordenables S) {
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
