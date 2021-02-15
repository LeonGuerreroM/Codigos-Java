/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

import java.util.Vector;

/**
 *
 * @author leonm
 */
public class CafeteriaCantidad extends Cafeteria{
    //protected Vector <ProductoCantidad> Productos; //arreglo de tamaño variable
    //protected Vector <VentaProducto> Ventas;
    
    public CafeteriaCantidad(int nv){
        super(nv);
        //Productos=new Vector<ProductoCantidad>();
        //Ventas=new Vector<VentaProducto>();
    }
    void restarProductos(int cantidad, int numProducto){ //modifica el vector productos de cafeteriaCantidad para restarle al indice del producto enviado la cantidad enviada (que es la misma que se registra en la venta)
        int x,y;
        x=Productos.elementAt(numProducto-1).getCantidad(); //-1 porque el id enviado es del 1 en adelante y el vector empieza en 0
        y=x-cantidad;
        Productos.elementAt(numProducto-1).setCantidad(y);
    }
}
