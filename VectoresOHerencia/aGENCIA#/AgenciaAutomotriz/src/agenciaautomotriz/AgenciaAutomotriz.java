
package agenciaautomotriz;

import java.util.Scanner;

public class AgenciaAutomotriz {

    public static void main(String[] args) {
       int j, k, l, m, carr,ca;
       String n;
       int id, e, id1, id2;
       char a, b, c, d,f;
       String matricula, marca, modelo;
       int anio;
       Scanner leer = new Scanner(System.in);
       Scanner leerInt = new Scanner(System.in);
       Scanner leerChar = new Scanner(System.in);
       Agenciamasmas nuevaAgencia = new Agenciamasmas();
       
       AutoMantenido a1 = new AutoMantenido("aaa","tesla","s",2000,0);
       AutoMantenido a2 = new AutoMantenido("bbb","honda","civic",2000,1);
       AutoMantenido a3 = new AutoMantenido("ccc","vw","jetta",2000,2);
       nuevaAgencia.autosAgencia.add(a1);
       nuevaAgencia.autosAgencia.add(a2);
       nuevaAgencia.autosAgencia.add(a3);
       Cliente c1=new Cliente("Miguel",30,0);
       Cliente c2=new Cliente("Vanessa",32,1);
       Cliente c3=new Cliente("Juan",40,2);
       nuevaAgencia.clientesAgencia.add(c1);
       nuevaAgencia.clientesAgencia.add(c2);
       nuevaAgencia.clientesAgencia.add(c3);
      
       
       System.out.println(nuevaAgencia.clientesAgencia.size());
       
        do{
        System.out.println("Menu Principal");
        System.out.println("1.-Clientes");
        System.out.println("2.-Automoviles");
        System.out.println("3.-Salir");
        j=leerInt.nextInt();
        
        switch(j){ //sw para automoviles o clientes
            case 1: //clientes 
                do{
                System.out.println("Menu Clientes");
                System.out.println("1.-Añadir Cliente");
                System.out.println("2.-Modificar datos de un cliente"); //nombre, edad
                System.out.println("3.-Eliminar Cliente"); //todo con ids
                System.out.println("4.-Consultar datos de un cliente");
                System.out.println("5.-Listar clientes");
                System.out.println("6.-Opciones de Autos de clientes");
                System.out.println("7.-Listar clientes con auto");
                System.out.println("8.-Salir");
                k=leerInt.nextInt();
                switch(k){ //sw para el menu de clientes
                    case 1: 
                        String nombre;
                        int edad;
                        System.out.println("Ingrese el nombre del cliente");
                        nombre=leer.nextLine();
                        System.out.println("Ingrese la edad del cliente");
                        edad=leerInt.nextInt();
                        nuevaAgencia.añadirCliente(nombre, edad); 
                        break;
                    case 2: 
                        do{
                        nuevaAgencia.listarClientes();
                        System.out.println("¿Que desea modificar?");
                        System.out.println("1.-Nombre");
                        System.out.println("2.-Edad");
                        System.out.println("4.-Salir");
                        l=leerInt.nextInt();
                        switch(l){ //sw para modificacion de datos
                            case 1:
                                System.out.println("Teclee el id del cliente al que quiere cambiarle el nombre");
                                id=leerInt.nextInt();
                                System.out.println("Teclee el nuevo nombre");
                                n=leer.nextLine();
                                nuevaAgencia.clientesAgencia.elementAt(id).setNombre(n);
                                break;
                            case 2:
                                System.out.println("Teclee el id del cliente al que quiere cambiarle la edad");
                                id=leerInt.nextInt();
                                System.out.println("Teclee la nueva edad");
                                e=leerInt.nextInt();
                                nuevaAgencia.clientesAgencia.elementAt(id).setEdad(e);
                                break;
                            default:
                                    System.out.println("-----");
                            break;
                        } 
                        System.out.println("Si desea repetir el menu de modificacion de datos de cliente, presione s. Si no, presiona q");
                        a=leerChar.next().charAt(0);
                        }while(a=='s'); 
                        break;
                    case 3: //eliminar cliente
                        nuevaAgencia.listarClientes();
                        System.out.println("Teclee el id del cliente al que quiere eliminar");
                        id=leerInt.nextInt();
                        nuevaAgencia.eliminarCliente(id);
                        break;
                    case 4: //consultar datos de un cliente
                        int ide, edade;
                        String nombree;
                        nuevaAgencia.listarClientes();
                        System.out.println("Teclee el id del cliente del que quiere conocer informacion");
                        id=leerInt.nextInt();
                        ide=nuevaAgencia.clientesAgencia.elementAt(id).getIdCliente();
                        edade=nuevaAgencia.clientesAgencia.elementAt(id).getEdad();
                        nombree=nuevaAgencia.clientesAgencia.elementAt(id).getNombre();
                        System.out.println(ide+" "+nombree+" "+edade);
                        System.out.println("Desea ver la lista de autos (por matricula) de este cliente");
                        System.out.println("Si es asi, presione 1. Si no, presione 2");
                        carr=leerInt.nextInt();
                        if(carr==1){
                            nuevaAgencia.consultarAutosDeUnCliente(id);
                        }
                        break;
                    case 7:
                        nuevaAgencia.listarClientesConAuto();
                    break;
                    case 6:
                        do{
                                System.out.println("Menu de autos del Cliente");
                                System.out.println("1.-Agregar auto a su coleccion");
                                System.out.println("2.-Eliminar autos de su coleccion");
                                System.out.println("3.-Salir");
                                m=leerInt.nextInt();
                                switch(m){
                                    case 1: //agregar auto
                                        System.out.println("Lista clientes");
                                        nuevaAgencia.listarClientes();
                                        System.out.println("");
                                        System.out.println("Lista Autos");
                                        nuevaAgencia.listarAutos();
                                        System.out.println("");
                                        System.out.println("Ingrese el id del cliente");
                                        id1=leerInt.nextInt();
                                        System.out.println("Ingrese el id del auto a agregarse");
                                        id2=leerInt.nextInt();
                                        nuevaAgencia.añadirAutoaColeccionCliente(id1, id2);
                                        break;
                                    case 2:
                                        System.out.println("Lista clientes");
                                        nuevaAgencia.listarClientes();
                                        System.out.println("");
                                        System.out.println("Lista Autos");
                                        nuevaAgencia.listarAutos();
                                        System.out.println("");
                                        System.out.println("Ingrese el id del cliente");
                                        id1=leerInt.nextInt();
                                        System.out.println("Ingrese el id del auto a retirarse");
                                        id2=leerInt.nextInt();
                                        nuevaAgencia.removerAutoColeccion(id1, id2);
                                }
                                System.out.println("Si desea repetir el menu de autos de un cliente, presione s. Si no, presiona q");
                                f=leerChar.next().charAt(0);
                                }while(f=='s'); 
                        break;
                    case 5:
                        nuevaAgencia.listarClientes();
                        break;
                    default:
                        System.out.println("-----");
                        break;
                    
                }
                System.out.println("Si desea repetir el menu de clientes, presione s. Si no, presione q");
                b=leerChar.next().charAt(0);
                }while(b=='s');
            break; //break de superMenu cllientes
            case 2:
                do{
                System.out.println("Menu Automoviles");
                System.out.println("1.-Añadir Automovil");
                System.out.println("2.-Modificar datos de un automovil");
                System.out.println("3.-Eliminar automovil");
                System.out.println("4.-Listar Autos");
                System.out.println("5.-Consultar datos de un automovil");
                System.out.println("6.-Agregar mantenimiento a un auto");
                System.out.println("7.-Listar mantenimientos de un auto");
                System.out.println("8.-Salir");
                k=leerInt.nextInt();
                switch(k){
                    case 1:
                        System.out.println("Ingrese la matricula del auto");
                        matricula=leer.nextLine();
                        System.out.println("Ingrese la marca del auto");
                        marca=leer.nextLine();
                        System.out.println("Ingrese el modelo del auto");
                        modelo=leer.nextLine();
                        System.out.println("Ingrese el año del auto");
                        anio=leerInt.nextInt();
                        nuevaAgencia.añadirAutomovil(matricula, marca, modelo, anio);
                        System.out.println("Auto agregado");
                        break;
                    case 2:
                        nuevaAgencia.listarAutos();
                        System.out.println("Ingrese el id del auto al que le desea cambiar datos");
                        id=leerInt.nextInt();
                        System.out.println("Para las proximas preguntas, conteste 1 para Si y 2 para No");
                        System.out.println("Desea cambiar la matricula del auto");
                        ca=leerInt.nextInt();
                        if(ca==1){
                            System.out.println("Teclee la nueva matricula del auto");
                            matricula=leer.nextLine();
                            nuevaAgencia.autosAgencia.elementAt(id).setMatricula(matricula);
                        }
                        
                        System.out.println("Desea cambiar la marca del auto");
                        ca=leerInt.nextInt();
                        if(ca==1){
                            System.out.println("Teclee la nueva marca del auto");
                            marca=leer.nextLine();
                            nuevaAgencia.autosAgencia.elementAt(id).setMarca(marca);
                        }
                        
                        System.out.println("Desea cambiar el modelo del auto");
                        ca=leerInt.nextInt();
                        if(ca==1){
                            System.out.println("Teclee el nuevo modelo del auto");
                            modelo=leer.nextLine();
                            nuevaAgencia.autosAgencia.elementAt(id).setModelo(modelo);
                        }
                        
                        System.out.println("Desea cambiar el año del auto");
                        ca=leerInt.nextInt();
                        if(ca==1){
                            System.out.println("Teclee el nuevo año del auto");
                            anio=leerInt.nextInt();
                            nuevaAgencia.autosAgencia.elementAt(id).setAño(anio);
                        }
                        break;
                    case 3:
                        nuevaAgencia.listarAutos();
                        System.out.println("Teclee el id del automovil que desea eliminar");
                        id=leerInt.nextInt();
                        nuevaAgencia.eliminarAutomovil(id);
                        break;
                    case 5:
                        nuevaAgencia.listarAutos();
                        System.out.println("Teclee el id del automovil del que desea saber mas");
                        id=leerInt.nextInt();
                        nuevaAgencia.consultarDatosAuto(id);
                        break;
                    case 6:
                        nuevaAgencia.listarAutos();
                        System.out.println("Teclee el id del auto al que dio mantenimiento");
                        id1=leerInt.nextInt();
                        System.out.println("Escriba una breve descripcion del matenimiento dado");
                        n=leer.nextLine();
                        nuevaAgencia.añadirMantenimiento(id1, n);
                        break;
                    case 7:
                        nuevaAgencia.listarAutos();
                        System.out.println("Teclee el id del auto del que quiere ver la lista de mantenimientos");
                        id1=leerInt.nextInt();
                        nuevaAgencia.listarMantenimientosAuto(id1);
                    break;
                    case 4:
                        nuevaAgencia.listarAutos();
                    default:
                        System.out.println("-----");
                        break;
                } //fin sw j
                System.out.println("Si desea repetir el menu de automoviles, presione s. Si no, presione q");
                d=leerChar.next().charAt(0);
                }while(d=='s'); 
                break; //break de super menu autos
            default:
                System.out.println("----");
                break;
        } //fin ultra sw
        System.out.println("Si desea repetir el menu principal, presione s. Si no, presione q");
        c=leerChar.next().charAt(0);
        }while(c=='s'); 
       
       
    }
    
}
