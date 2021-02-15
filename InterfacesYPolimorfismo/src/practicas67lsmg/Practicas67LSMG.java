
package practicas67lsmg;

/**
 *
 * @author Sala5
 */
public class Practicas67LSMG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ordenables [] obj = new Ordenables[5];
        Ordenar obj2=new Ordenar();
        Circulo o1 = new Circulo(20);
        Circulo o2 = new Circulo(40);
        Circulo o3 = new Circulo(75);
        Cuadrilatero o4=new Cuadrilatero(12,28);
        Cuadrilatero o5=new Cuadrilatero(35,9);
        
        obj[0]=o1;
        obj[1]=o2;
        obj[2]=o3;
        obj[3]=o4;
        obj[4]=o5;
        
        System.out.println("Areas sin ordenar");
        System.out.println(o1.calcularArea());
        System.out.println(o2.calcularArea());
        System.out.println(o3.calcularArea());
        System.out.println(o4.calcularArea());
        System.out.println(o5.calcularArea());
        
        obj2.Ordena(obj);
        
        System.out.println("Areas ordenadas");
        System.out.println(((Figura)(obj[0])).calcularArea()); //polimorfismo. La interrfaz se comporta como una clase por el cast
        System.out.println(((Figura)(obj[1])).calcularArea());
        System.out.println(((Figura)(obj[2])).calcularArea());
        System.out.println(((Figura)(obj[3])).calcularArea());
        System.out.println(((Figura)(obj[4])).calcularArea());
       
    }
    
}
