import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = lector.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = lector.nextLine();
        System.out.print("Ingrese el email del cliente: ");
        String email = lector.nextLine();
        System.out.print("Ingrese el número de teléfono del cliente: ");
        String numeroTelefono = lector.nextLine();

        double saldoInicial = 0;
        boolean saldoValido = false;

        while (!saldoValido) {
            try {
                System.out.print("Ingrese el saldo inicial: $");
                saldoInicial = lector.nextDouble();
                saldoValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Inténtelo de nuevo.");
                lector.nextLine();
            }
        }

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldoInicial, nombreCliente, email, numeroTelefono);

        int opcion;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Depositar fondos");
            System.out.println("2. Retirar fondos");
            System.out.println("3. Salir");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double cantidadDeposito;
                    try {
                        cantidadDeposito = lector.nextDouble();
                        if (cantidadDeposito > 0) {
                            saldoInicial += cantidadDeposito;
                            System.out.println("Depósito exitoso. Saldo actual: $" + saldoInicial);
                        } else {
                            System.out.println("Cantidad inválida. Inténtelo de nuevo.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Inténtelo de nuevo.");
                        lector.nextLine();
                    }
                    break;
                case 2:
                    int intentos = 0;
                    while (intentos < 3) {
                        System.out.print("Ingrese la cantidad a retirar: $");
                        double cantidadRetiro;
                        try {
                            cantidadRetiro = lector.nextDouble();
                            if (cantidadRetiro > 0) {
                                double nuevoSaldo = saldoInicial - cantidadRetiro;
                                if (nuevoSaldo >= 0) {
                                    saldoInicial = nuevoSaldo;
                                    System.out.println("Retiro exitoso. Saldo actual: $" + saldoInicial);
                                    break; 
                                } else {
                                    System.out.println("Saldo insuficiente. Intentos restantes: " + (2 - intentos));
                                    intentos++;
                                }
                            } else {
                                System.out.println("Cantidad inválida. Inténtelo de nuevo.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Inténtelo de nuevo.");
                            lector.nextLine();
                        }
                    }
                    if (intentos == 3) {
                        System.out.println("Máximo de intentos alcanzado. Regresando al menú principal.");
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
        lector.close();
    }
}