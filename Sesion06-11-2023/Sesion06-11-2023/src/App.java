import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    byte elegir;

 

    System.out.println(" Que  operacion desea efectuar con ");

    System.out.println("::::::::::::::::::::::::::::::::::::::");

    System.out.println("1) Depositar Fondos ");

    System.out.println("2) Retirar Fondos");

    System.out.println("3) Fin");


    elegir = lector.nextByte();

    switch (elegir) {
      case 1:
      Cuentabancaria cuenta = new Cuentabancaria();
      System.out.print("Como Digite el numero de cuenta  : ");
      int numero = lector.nextLine();
      Cuentabancaria.setnumero(numero);
      System.out.print("Cual es la duracion de la pelicula: ");
      int duracion = lector.nextInt();
      Cuentabancaria.establecerDuracion(duracion);
      System.out.print("Cual es la calidad de la pelicula: ");
      lector.nextLine();
      String calidad = lector.nextLine();
      Cuentabancaria.establecerCalidad(calidad);
      System.out.print("Cual es la clasificacion de la pelicula: ");
      String clasificacion = lector.nextLine();
      Cuentabancaria.establecerClasificacion(clasificacion);
      System.out.print("Cual es el genero de la pelicula: ");
      String genero = lector.nextLine();
      Cuentabancaria.establecerGenero(genero);
      System.out.println("Nombre:" + Cuentabancaria.mostrarNombre());
      System.out.println("Duracion: " + Cuentabancaria.mostrarDuracion());
      System.out.println("Calidad: " + Cuentabancaria.mostrarCalidad());
      System.out.println("Clasificacion: " + Cuentabancaria.mostrarClasificacion());
      System.out.println("Genero: " + Cuentabancaria.mostrarGenero());

        }

        break;

      case 2:
      Cuentabancaria cuenta = new Cuentabancaria();
     

        }
        break;
      }
    