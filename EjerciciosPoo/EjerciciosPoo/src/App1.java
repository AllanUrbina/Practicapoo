import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 0;

        String nombre="";
        double limiteCredito = 0.0;
        String correoElectronico;

        while (intentos < 3) {
            System.out.print("Ingrese el nombre del cliente: ");
            nombre = lector.nextLine();
            
            boolean hasNumbers = false;
            for (char c : nombre.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasNumbers = true;
                    break;
                }
            }

            if (!hasNumbers) {
                break;
            } else {
                System.out.println("El nombre no puede contener números.");
                intentos++;
            }
        }

        intentos = 0;

        while (intentos < 3) {
            try {
                System.out.print("Ingrese el límite de crédito: $");
                limiteCredito = lector.nextDouble();
                lector.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("El límite de crédito no puede contener letras.");
                intentos++;
                lector.nextLine();
            }
        }

        System.out.print("Ingrese el correo electrónico: ");
        correoElectronico = lector.nextLine();

        ClienteVip cliente = new ClienteVip(nombre, limiteCredito, correoElectronico);

        System.out.println("Cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Límite de Crédito: $" + cliente.getLimiteCredito());
        System.out.println("Correo Electrónico: " + cliente.getCorreoElectronico());
        lector.close();
    }
}