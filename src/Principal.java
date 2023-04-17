import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

        public static void principal1(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el número de Materias:");
            System.out.println("---------------------------------------------------");
            int size = scanner.nextInt();
            scanner.nextLine();
            String[] calificacion = new String[size];


            for (int i = 0; i < size; i++) {
                System.out.println("Ingrese la materia y la calificación : (Ejemplo:Quimica 8) ");


                calificacion[i] = scanner.nextLine();
            }
            Registro registro= new Registro();
            Registro nomMateria = new Registro();

            double[] calificaciones = registro.getGrades(calificacion);

            String[] materias = registro.registroMaterias(calificacion);

            double promedio = 0;
            for (int j = 0; j < calificaciones.length; j++) {
                promedio += calificaciones[j] / calificaciones.length;
                System.out.println("----Materia: " + materias[j] + " ----Calificación: " + calificaciones[j]);
            }
            System.out.println("Promedio final " + truncar(promedio));
        }




    public static String truncar(double numero) {
            DecimalFormat df = new DecimalFormat("#.0");
            return df.format(numero);
        }
    }


