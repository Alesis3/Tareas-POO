import java.util.Scanner;
public class Tarea2 {
    public static void main(String[] args) {

        String[] nombres;
        System.out.println("Ingrese Nombre, Profesión y Nacionalidad: ");

        Scanner teclado = new Scanner(System.in);
        String input = "";
        input = teclado.nextLine();
        nombres = input.split(" ");
        System.out.println("Nombre: " + nombres[0] );
        System.out.println("Profesión: "+ nombres[1]);
        System.out.println("Pais: " + nombres[2]);




    }
}