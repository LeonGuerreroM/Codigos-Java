/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

import java.util.Vector;

/**
 *
 * @author ivazq
 */
public class Venta {
    String Fecha;
    int IDVenta;
    Vector <VentaProducto> VentaProductos; //declara vector
    Venta (int IDVenta,String Fecha)
    {
        VentaProductos=new Vector <VentaProducto>(); //inicializa vector
        this.IDVenta=IDVenta;
    }
    
    void addVenta(Producto p,int cantidad)
    {
        VentaProductos.add(new VentaProducto(p,cantidad));
    }
    
    
    void remomeVenta()
    {
        int index=VentaProductos.size()-1;
        if (index>=0)
        {
            VentaProductos.remove(index);
        }
    }
    
    String ListarVenta()
    {
        String Lista="";
        int size;
        int i;
        size=VentaProductos.size(); //funcion para obtener tamaño del vector
        for(i=0;i<size;i++)
        {
            Lista=Lista + VentaProductos.get(i).GetVenta() + "\n"; //estudiar elementos de clase vector
        }
        return Lista;
    }
}
