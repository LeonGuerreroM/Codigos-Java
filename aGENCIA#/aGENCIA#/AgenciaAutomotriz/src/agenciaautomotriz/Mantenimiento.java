
package agenciaautomotriz;

import java.util.Calendar;

/**
 *
 * @author leonm
 */
public class Mantenimiento {
    
    private String fechaD;
    private String Descripcion;
    private int IdMantenimiento;

    public Mantenimiento(String Descripcion, int IdMantenimiento) {
        this.Descripcion = Descripcion;
        this.IdMantenimiento = IdMantenimiento;
        setFechaD();
    }

    public int getIdMantenimiento() {
        return IdMantenimiento;
    }

    public void setIdMantenimiento(int IdMantenimiento) {
        this.IdMantenimiento = IdMantenimiento;
    }

    public Mantenimiento(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    Calendar fecha = Calendar.getInstance();

    public String getFechaD() {
        return fechaD;
    }

    public void setFechaD() {
        String x,y,z,fechaD;
        x=Integer.toString(fecha.get(Calendar.DATE));
        y=Integer.toString(fecha.get(Calendar.MONTH));
        z=Integer.toString(fecha.get(Calendar.YEAR));
        fechaD=x+"/"+y+"/"+z;
        this.fechaD=fechaD;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
