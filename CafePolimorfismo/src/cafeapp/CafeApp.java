/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeapp;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ivazq
 */
public class CafeApp {

    /**
     * @param args the command line arguments
     */
    static CafeteriaCantidad UPP;
    static Scanner Teclado;
    static int ID=1;    
    
    public static void main(String[] args) {
        // TODO code application logic here
        UPP=new CafeteriaCantidad(1);
        Teclado=new Scanner(System.in);
        
        int Opc=0;
        while (Opc!=5)
        {
            System.out.println("Cafeteria UPP");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Remover Producto");
            System.out.println("3. Listar Productos");
            System.out.println("4. Nueva Venta");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion (1-5)");
            
            Opc=Teclado.nextInt();
            
            switch (Opc)
            {
                case 1: AgregarProductos();break;
                case 2: RemoverProducto();break;
                case 3: ListarProductos();break;
                case 4: NuevaVenta();break;
                    
            }
            
        }
        
    }
    
    protected static void AgregarProductos()
    {
        int opc=1;
        int cantidad;
        String P;
        String D;
        String resp=Teclado.nextLine();
        System.out.println("----- Agregar Productos -----");
        
        while (opc!=0)
        {
            System.out.println("Ingresa Nombre del Producto");
            P=Teclado.nextLine();
            System.out.println(P);
            System.out.println("Ingresa Descripción del Producto");
            D=Teclado.nextLine();
            System.out.println("Ingrese la cantidad del producto");
            cantidad=Teclado.nextInt();
            resp=Teclado.nextLine();
            System.out.println("Agregar producto 0=No 1=Si");
            opc=Teclado.nextInt();
            resp=Teclado.nextLine();
            if (opc==1)
            {
                ProductoCantidad aux;
                aux=new ProductoCantidad(ID,P,D,cantidad); //por fuera porque el metodo add te pide que metas objeto de tipo producto
                //le estoy mandando un productoCantidad pero se comporta como producto; los hijos pueden pasar como sus padres debido al polimorfismo
                //la clase hija de los hijos puede comportarse como el abuelo (herencia tipo lienal, unica en java)
                //el hijo puede comportarse como el padre; el padre no puede comportarse como el hijo
                UPP.AddProducto(aux);
                ID++;
            }
            System.out.println("Agregar otro producto 0=No 1=Si");
            opc=Teclado.nextInt();
            resp=Teclado.nextLine();
        }
    }
    
    static void ListarProductos()
    {
        Vector<ProductoCantidad> Lista;
        Lista=UPP.ListarProductos();
        int size=Lista.size();
        int i;
        System.out.println("----- Listar Productos -----");
        for(i=0;i<size;i++)
        {
            System.out.println( (i+1) +" " + Lista.get(i).getNombre() + " " + Lista.get(i).getDescripcion()+" "+((ProductoCantidad)Lista.get(i)).getCantidad()+" "+((ProductoCantidad)Lista.get(i)).getDescripcion()); //con get i obtiene la referencia de un producto, si quieres sus datos usa los otros get
            //con get i tienes referencia a producto, si quieres que sea ProductoCantidad debes hacer casting (segundo polimorfismo, puedes convertir un padre en su hijo casteandolo)
        }
    }
    
    static void RemoverProducto()
    {
        int opc;
        String resp;
        ListarProductos();
        System.out.println("----- Remover Producto -----");
        System.out.println("Selecciona un producto");
        opc=Teclado.nextInt();
        resp=Teclado.nextLine();
        UPP.removeProducto(opc-1);
        ListarProductos();
    }
    
    static void NuevaVenta()
    {
        int opc=0;
        String resp;
        System.out.println("----- Nueva Venta -----");
        Venta V=UPP.CrearNuevaVenta();
        while ((opc!=6) && (opc!=9))
        {
            System.out.println("1. Listar Productos");
            System.out.println("2. Adicionar Producto");
            System.out.println("3. Carrito Actual");   
            System.out.println("6. Realizar Venta");
            System.out.println("9. Cancelar Venta");
            opc=Teclado.nextInt(); //corregir lo del buffer 2Bv
            resp=Teclado.nextLine();
            switch (opc)
            {
                case 1: ListarProductos();break;
                case 2: AdicionarProductos(V);break;
                case 3: Carrito(V);break;
                case 6: RealizarVenta(V);break;
                case 9: V=null;break;
            }
        }      
    }
    
    static void AdicionarProductos(Venta V)
    {
        Producto p;
        int producto;
        int cantidad;
        String resp;
        System.out.println("Ingresa número de producto");
        producto=Teclado.nextInt();
        resp=Teclado.nextLine();
        p=UPP.GetProducto(producto);
        System.out.println(p.getNombre()+" "+p.getDescripcion());
        System.out.println("Ingresa Cantidad");
        cantidad=Teclado.nextInt();
        resp=Teclado.nextLine();
        if(cantidad>0)
        {
            if(cantidad<UPP.Productos.elementAt(producto-1).getCantidad()){
            V.addVenta(p, cantidad);
            UPP.restarProductos(cantidad, producto); //metodo que recibe de que producto y cuantos
            }else{
                System.out.println("No hay suficientes unidades para abastecer ese pedido");
            }
        }
    }
    
    static void Carrito(Venta V)
    {
        System.out.println(V.ListarVenta());
    }
    
    static void RealizarVenta(Venta V)
    {
        UPP.AddVenta(V);
    }
}
