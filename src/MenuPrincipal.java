import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, edad, tamanio, longitud, velocidad;
        double peso;
        String nombre, patron;
        Leon leon = new Leon();
        Tigre tigre = new Tigre();
        Guepardo guepardo = new Guepardo();
        Pantera pantera = new Pantera();
        Jaguar jaguar = new Jaguar();

        do{
            System.out.println("\n*** MENU ***");
            System.out.println("\n1. Ver datos Leon");
            System.out.println("2. Ver datos Tigre");
            System.out.println("3. Ver datos Guepardo");
            System.out.println("4. Ver datos Pantera");
            System.out.println("5. Ver datos Jaguar");
            System.out.println("6. Salir");
            System.out.print("\nIngrese una opcion del menu: ");
            menu = sc.nextInt();
            switch (menu){
                case 1:{
                    System.out.println("\n*** LEON ***");

                    System.out.print("\nIngrese el nombre del leon: ");
                    nombre = sc.next();
                    System.out.print("Ingrese la edad del leon: ");
                    edad = sc.nextInt();
                    System.out.print("Ingrese el peso del leon: ");
                    peso = sc.nextDouble();
                    System.out.print("Ingrese el tamanio de la melena del leon: ");
                    tamanio = sc.nextInt();

                    leon.setNombre(nombre);
                    leon.setEdad(edad);
                    leon.setPeso(peso);
                    leon.setTamanio_melena(tamanio);

                    System.out.println("\nNombre: " + leon.getNombre());
                    System.out.println("Edad: " + leon.getEdad());
                    System.out.println("Peso: " + leon.getPeso() + " kg");
                    System.out.println("Tamanio de melena: " + leon.getTamanio_melena() + " cm");
                    System.out.println();
                    leon.cazar();
                    break;
                }
                case 2:{
                    System.out.println("\n*** TIGRE ***");

                    System.out.print("\nIngrese el nombre del tigre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese la edad del tigre: ");
                    edad = sc.nextInt();
                    System.out.print("Ingrese el peso del tigre: ");
                    peso = sc.nextDouble();
                    System.out.print("Ingrese el patron del tigre: ");
                    patron = sc.next();

                    tigre.setNombre(nombre);
                    tigre.setEdad(edad);
                    tigre.setPeso(peso);
                    tigre.setPatron_rayas(patron);

                    System.out.println("\nNombre: " + tigre.getNombre());
                    System.out.println("Edad: " + tigre.getEdad());
                    System.out.println("Peso: " + tigre.getPeso() + " kg");
                    System.out.println("El patron de rayas del tigre es: " + tigre.getPatron_rayas());
                    System.out.println();
                    tigre.nadar();
                    break;
                }
                case 3:{
                    System.out.println("\n*** GUEPARDO ***");

                    System.out.print("\nIngrese el nombre del guepardo: ");
                    nombre = sc.next();
                    System.out.print("Ingrese la edad del guepardo: ");
                    edad = sc.nextInt();
                    System.out.print("Ingrese el peso del guepardo: ");
                    peso = sc.nextDouble();
                    System.out.print("Ingrese el tamanio de la melena del guepardo: ");
                    velocidad = sc.nextInt();

                    guepardo.setNombre(nombre);
                    guepardo.setEdad(edad);
                    guepardo.setPeso(peso);
                    guepardo.setVelocidad_maxima(velocidad);

                    System.out.println("\nNombre: " + guepardo.getNombre());
                    System.out.println("Edad: " + leon.getEdad());
                    System.out.println("Peso: " + leon.getPeso() + " kg");
                    System.out.println("Velocidad maxima: " + guepardo.getVelocidad_maxima() + " km/h");
                    System.out.println();
                    guepardo.correr();
                    break;
                }
                case 4:{
                    System.out.println("\n*** PANTERA ***");

                    System.out.print("\nIngrese el nombre de la pantera: ");
                    nombre = sc.next();
                    System.out.print("Ingrese la edad de la pantera: ");
                    edad = sc.nextInt();
                    System.out.print("Ingrese el peso de la pantera: ");
                    peso = sc.nextDouble();
                    System.out.print("Ingrese la longitudo de la pantera: ");
                    longitud = sc.nextInt();

                    pantera.setNombre(nombre);
                    pantera.setEdad(edad);
                    pantera.setPeso(peso);
                    pantera.setLongitud_cuerpo(longitud);

                    System.out.println("\nNombre: " + pantera.getNombre());
                    System.out.println("Edad: " + pantera.getEdad());
                    System.out.println("Peso: " + pantera.getPeso() + " kg");
                    System.out.println("Longitud del cuerpo: " + pantera.getLongitud_cuerpo() + " cm");
                    System.out.println();
                    pantera.acechar();
                    break;
                }
                case 5:{
                    System.out.println("\n*** JAGUAR ***");

                    System.out.print("\nIngrese el nombre del jaguar: ");
                    nombre = sc.next();
                    System.out.print("Ingrese la edad del jaguar: ");
                    edad = sc.nextInt();
                    System.out.print("Ingrese el peso del jaguar: ");
                    peso = sc.nextDouble();
                    System.out.print("Ingrese el tamanio de las orejas del jaguar: ");
                    tamanio = sc.nextInt();

                    jaguar.setNombre(nombre);
                    jaguar.setEdad(edad);
                    jaguar.setPeso(peso);
                    jaguar.setTamanio_orejas(tamanio);

                    System.out.println("\nNombre: " + jaguar.getNombre());
                    System.out.println("Edad: " + leon.getEdad());
                    System.out.println("Peso: " + leon.getPeso() + " kg");
                    System.out.println("Tamanio de orejas: " + jaguar.getTamanio_orejas() + " cm");
                    System.out.println();
                    jaguar.explorar();
                    break;
                }
                case 6:{
                    System.out.println("\nGracias por usar nuestro menu!");
                    break;
                }
                default:{
                    System.out.println("\nOpcion no disponible del menu!");
                }
            }
        }while(menu != 6);
    }
}