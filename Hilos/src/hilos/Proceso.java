/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Sala5
 */
public class Proceso extends Thread {//diferentes objetos el mismo comportamiento, usa interfaz
    int lapso=0;
    int num;
    boolean detener=false;
    Tiempo T1;
    
    Proceso(int num){
        this.num=num;
    }
    
    @Override
    public void run(){
        do{
            if(T1!=null){
                for(lapso=0;lapso<num;lapso++);
                    T1.Ejecutar();
                    detener=true;
                
            }
        }while(detener!=true);
    }
    
    void setTiempo(Tiempo T1){
        this.T1=T1;
    }
    

}
