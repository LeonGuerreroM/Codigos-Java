
package agenciaautomotriz;

import java.util.Vector;

public class AutoMantenido extends Automovil {
    
    public AutoMantenido(String matricula, String marca, String modelo, int año, int idAuto){
        super(matricula, marca, modelo, año, idAuto);
    }
    
    Vector<Mantenimiento> reparaciones = new Vector<Mantenimiento>();
    
}
