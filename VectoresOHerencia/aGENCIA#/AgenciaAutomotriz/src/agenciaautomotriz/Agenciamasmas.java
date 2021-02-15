
package agenciaautomotriz;

import java.util.Vector;

public class Agenciamasmas extends Agencia {
    
    public Agenciamasmas(){
        super();
    }
    
    
    Vector<AutoMantenido> autosAgencia = new Vector<AutoMantenido>();
    
    void añadirAutoaColeccionCliente(int idC, int  idA){
        String x1,x2,x3;
        int x4, indiceCA, indiceCC,i,j,indice,z=0;
        boolean esta;
        
        esta=estaElAuto(idA);
        
        indice=clientesAgencia.elementAt(idC).carros.size();
        
        if(esta==false){
        x1=autosAgencia.elementAt(idA).getMatricula();
        x2=autosAgencia.elementAt(idA).getMarca();
        x3=autosAgencia.elementAt(idA).getModelo();
        x4=autosAgencia.elementAt(idA).getAño();
        Automovil obj = new Automovil(x1,x2,x3,x4,indice);
        clientesAgencia.elementAt(idC).carros.add(obj);
        }else{
            System.out.println("Este auto ya fue comprado por otro cliente");
        }
        
    }
    
    boolean estaElAuto(int idA){
        int x4, indiceCA, indiceCC,i,j,indice;
        boolean x=false;
        
        indiceCA=clientesAgencia.size();
        for(i=0;i<indiceCA;i++){
            indiceCC=clientesAgencia.elementAt(i).carros.size();
            for(j=0;j<indiceCC;j++){
                if(clientesAgencia.elementAt(i).carros.elementAt(j).getIdAuto()==idA){
                    return true;
                }else{
                    x=false;
                }
                }
            }
        return x;
    }
    
    void añadirMantenimiento(int idA,String d){
        int indice;
        String date;
        indice=autosAgencia.elementAt(idA).reparaciones.size();
        Mantenimiento obj2 = new Mantenimiento(d,indice);
        autosAgencia.elementAt(idA).reparaciones.add(obj2);
    }
    
    void listarMantenimientosAuto(int idA){
        int i, indice;
        indice=autosAgencia.elementAt(idA).reparaciones.size();
        System.out.println("Mantenimientos hechos a "+autosAgencia.elementAt(idA).getMarca()+" "+autosAgencia.elementAt(idA).getModelo());
        for(i=0;i<indice;i++){
            System.out.println(autosAgencia.elementAt(idA).reparaciones.elementAt(i).getIdMantenimiento()+" "+autosAgencia.elementAt(idA).reparaciones.elementAt(i).getDescripcion()+" "+autosAgencia.elementAt(idA).reparaciones.elementAt(i).getFechaD());        
        }
    }
    
    /*void listarClientesConAuto(){
        //boolean x;
        int indice, indiceClientes,i;
        indiceClientes= clientesAgencia.size();
        for(i=0;i<indiceClientes;i++){
            indice= clientesAgencia.elementAt(i).carros.size();
            if(indice>0){
                System.out.println(clientesAgencia.elementAt(i).getIdCliente()+"  "+clientesAgencia.elementAt(i).getNombre()+" "+clientesAgencia.elementAt(i).carros);
            }
        }
    }*/
    
    void listarClientesConAuto(){
        int indice, indiceClientes,i,j;
        indiceClientes= clientesAgencia.size();
        for(i=0;i<indiceClientes;i++){
            indice= clientesAgencia.elementAt(i).carros.size();
            if(indice>0){
                for(j=0;j<indice;j++){
                System.out.println(clientesAgencia.elementAt(i).getIdCliente()+"  "+clientesAgencia.elementAt(i).getNombre()+" "+clientesAgencia.elementAt(i).carros.elementAt(j).getMarca()+" "+clientesAgencia.elementAt(i).carros.elementAt(j).getModelo());
            }
            }
        }
    }
    
    void añadirAutomovil(String mat, String mar, String mod, int an){
        int indice;
        indice=autosAgencia.size();
        AutoMantenido obj = new AutoMantenido(mat,mar,mod,an,indice);
        autosAgencia.add(obj);
    }
    
    void listarAutos(){
      int tamaño, i;
      tamaño=autosAgencia.size();
      for(i=0;i<tamaño;i++){
          System.out.println(autosAgencia.elementAt(i).getIdAuto()+"  "+autosAgencia.elementAt(i).getMatricula()+" "+autosAgencia.elementAt(i).getMarca()+" "+autosAgencia.elementAt(i).getModelo());
      }
    }
    
    void consultarDatosAuto(int id){
        String x1,x2,x3;
        int x4;
        x1=autosAgencia.elementAt(id).getMatricula();
        x2=autosAgencia.elementAt(id).getMarca();
        x3=autosAgencia.elementAt(id).getModelo();
        x4=autosAgencia.elementAt(id).getAño();
        System.out.println("Matricula: "+x1+"  Marca: "+x2+"  Modelo: "+x3+"  Año: "+x4);
    }
    
    void eliminarAutomovil(int id){
        autosAgencia.removeElementAt(id);
    }
    
    void removerAutoColeccion(int idC, int idA){
        String m;
        int i,tama,x;
        m=autosAgencia.elementAt(idA).getMatricula();
        tama=clientesAgencia.elementAt(idC).carros.size();
        //x=clientesAgencia.elementAt(idC)
        for(i=0;i<tama;i++){
            if((clientesAgencia.elementAt(idC).carros.elementAt(i).getMatricula()).equals(m)){
                x=clientesAgencia.elementAt(idC).carros.elementAt(i).getIdAuto();
                clientesAgencia.elementAt(idC).carros.removeElementAt(x);
                break;
            }    
        }
    }
}
