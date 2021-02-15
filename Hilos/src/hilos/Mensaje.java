
package hilos;

/**
 *
 * @author Sala5
 */
public class Mensaje implements Tiempo{

    boolean Flag=true;
    
    public void Init(){
        do{
            System.out.println("Ciclo continuo");
        }while(Flag==true);
    }    
    @Override
    public void Ejecutar() {
        Flag=false;
        System.out.println("Tiempo terminado");
    }
    
}
