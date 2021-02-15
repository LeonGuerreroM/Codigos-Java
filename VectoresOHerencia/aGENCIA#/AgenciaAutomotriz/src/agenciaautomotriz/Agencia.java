
package agenciaautomotriz;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Sala5
 */
public class Agencia {
    Scanner leerInt;
    Scanner leer;

    public Agencia() {
        leerInt = new Scanner(System.in);
        leer = new Scanner(System.in);
    }
    
    Vector<Cliente> clientesAgencia = new Vector<Cliente>();
    
    void añadirCliente(String nombre, int edad){
        int indice;
        indice=clientesAgencia.size();
        Cliente obj = new Cliente(nombre, edad, indice);
        clientesAgencia.add(obj);
    }
    
    void listarClientes(){
      int tamaño, i;
      tamaño=clientesAgencia.size();
      for(i=0;i<tamaño;i++){
          System.out.println(clientesAgencia.elementAt(i).getIdCliente()+"  "+clientesAgencia.elementAt(i).getNombre());
      }
    }
    
    void modificarDatosCliente(int id){
        //al rato :V
    }
    
    void eliminarCliente(int id){
        clientesAgencia.removeElementAt(id);
    }
    
    void consultarAutosDeUnCliente(int id){
      int tamaño, i;
      //tamaño=clientesAgencia.size();
      tamaño=clientesAgencia.elementAt(id).carros.size();
      for(i=0;i<tamaño;i++){
          System.out.println(clientesAgencia.elementAt(id).carros.elementAt(i).getMatricula()+" "+clientesAgencia.elementAt(id).carros.elementAt(i).getMarca()+" "+clientesAgencia.elementAt(id).carros.elementAt(i).getModelo());
      }
    }
    
    
    
    
}
