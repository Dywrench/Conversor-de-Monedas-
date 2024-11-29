import java.util.Scanner;

public class View {

    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }
    public int leerInt(String mensaje) {
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo.");
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }
    public String leerString(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }

    public double leerDouble(String mensaje) {
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Intente de nuevo.");
            sc.next();
        }
        double valor = sc.nextDouble();
        sc.nextLine();
        return valor;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
