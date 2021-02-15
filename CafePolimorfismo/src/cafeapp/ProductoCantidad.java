/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

/**
 *
 * @author Sala5
 */
public class ProductoCantidad extends Producto {

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    private int Cantidad;
    
    public ProductoCantidad(int ID, String N, String D) {
        super(ID, N, D); //metodo para mandar a llamar a constructor base
        Cantidad = 0;
    }
    //cuando heredo debo tener la misma cantidad de constructores de la clase padre
    
    public ProductoCantidad(int ID, String N, String D, int kant) {
        super(ID, N, D);
        Cantidad = kant;
    }
    
    
}
