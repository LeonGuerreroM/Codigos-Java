/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaautomotriz;

import java.util.Vector;

/**
 *
 * @author leonmg
 */
public class Cliente {
    private String Nombre;
    private int edad;
    private int idCliente;

    public Cliente(String Nombre, int edad, int idCliente) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.idCliente = idCliente;
    }
    
    Vector<Automovil> carros = new Vector<Automovil>();
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
   public Vector<Automovil> getCarros() {
        return carros;
    }

    public void setCarros(Vector<Automovil> carros) {
        this.carros = carros;
    }
    
  void agregarAuto(){
      
  }
  
  void removerAuto(){
      
  }
    
}
