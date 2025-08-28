import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 

        VeterinariaController veterinariaController = new VeterinariaController();

        while (true){
        System.out.println("Veterinaria Animalitos");
        System.out.println("*****Opciones del menu: *****");
        System.out.println("1. Registrar mascota nueva");
        System.out.println("3. Agendar una consulta");
        System.out.println("4. Ver especie más atendida");
        System.out.println("5. Ver promedio de consultas por día");
        System.out.println("3. Salir del sistema");
        System.out.print("¿Qué desea hacer hoy?");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {

        case 1: 
        System.out.print("Ingrese la especie de la mascota: ");
        String especie = scanner.nextLine();
        System.out.print("Ingrese la raza de la mascota: ");
        String raza = scanner.nextLine();
        System.out.print("Datos del dueño");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el numero celular: ");
        int celular = scanner.nextInt();
        veterinariaController.crearDueño(nombre, apellido, celular);
        veterinariaController.crearMascota(especie, raza, dueño)

        case 2: 
        System.out.print("Ingrese la fecha de la consulta: ");
        float fecha = scanner.nextFloat();
        System.out.print("Ingrese el motivo de la consulta (enfermedad, cuidado, otros) : ");
        String motivo = scanner.nextLine();
        System.out.print("Si la mascota ya está registrada ingrese el nombre de la mascota");
        String mascota = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        veterinariaController.crearConsulta(fecha, motivo, mascota);
        veterinariaController.crearConsulta(fecha, motivo)




        }









    }
}