
package cafeapp;

import java.util.Vector;

public class Cafeteria {
    static int NumVentas=0; //unica para todos los objetos, comparten esa misma variable
    protected Vector <ProductoCantidad> Productos; //arreglo de tamaño variable
    protected Vector <Venta> Ventas;
    Cafeteria(int NumVentas)
    {
        Productos=new Vector<ProductoCantidad>();
        Ventas=new Vector<Venta>();
        Cafeteria.NumVentas=NumVentas;
    }
    void AddProducto(ProductoCantidad P)
    {
        Productos.add(P);  //agregar algo al vector     
    }
    
    Producto GetProducto(int index)
    {
        return Productos.get(index-1);
    }
    
    boolean removeProducto(Producto P)
    {
        
        return Productos.remove(P);
    }
      
    boolean removeProducto(int index)
    {
        if (Productos.remove(index)!=null) //quitar elementos de un vector mandandole el indice, si es null (no existe) no entra al f
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
    
    Venta CrearNuevaVenta()
    {
        NumVentas++;
        return new Venta(NumVentas,java.util.Calendar.getInstance().toString());
    }
    
    public void AddVenta(Venta V)
    {
        Ventas.add(V);
    }
    
    public  Vector<ProductoCantidad> ListarProductos()
    {
        return Productos;      
    }
}
