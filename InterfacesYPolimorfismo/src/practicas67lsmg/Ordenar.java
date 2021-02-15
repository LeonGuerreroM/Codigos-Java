/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas67lsmg;

/**
 *
 * @author Sala5
 */
public class Ordenar {
    
    void Ordena(Ordenables S[]){
        int i ,j;
        Ordenables Aux;
        for(i=0;i<S.length;i++){
            for(j=0;j<S.length-1;j++){
                if(S[j].esmasgrande(S[j+1])==1){
                    Aux=S[j];
                    S[j]=S[j+1];
                    S[j+1]=Aux;
                }
            }
        }
    }
    
    
    
}
