/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sala5
 */
public class Ventana extends JFrame implements Tiempo {
    JButton B1;
    void Init(){
        B1=new JButton("HOLA");
        add(B1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,400);
        setVisible(true);
    }

    @Override
    public void Ejecutar() {
        B1.setText("Tiempo Terminado");
    }
    
}
