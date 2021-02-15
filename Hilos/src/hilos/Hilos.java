
package hilos;
/**
 *
 * @author leonm
 */
public class Hilos {

    public static void main(String[] args) {
        Ventana V1;
        V1=new Ventana();
        
        
        
        Proceso P1,P2;
        P1=new Proceso(1000000);
        P2=new Proceso(2000000000);
        
        Mensaje M1;
        M1=new Mensaje();
        
        P1.setTiempo(M1);
        P1.start();
        
        P2.setTiempo(V1);
        P2.start();
        
        V1.Init();
    }
    
}
