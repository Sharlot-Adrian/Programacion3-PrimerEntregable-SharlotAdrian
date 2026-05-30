import java.util.Scanner;
import java.util.ArrayList;

public class SistemaGestion {
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Profesor> registroProfesores = new ArrayList<>();
    ArrayList<Estudiante> registroEstudiantes = new ArrayList<>();

    public void menu(){
        int opcion = 0;

        do{
            System.out.println("============================================");
            System.out.println("        SISTEMA DE GESTION ACADEMICA        ");
            System.out.println("============================================");
            System.out.println("1. Registrar estudiante                     ");
            System.out.println("2. Registrar profesor                       ");
            System.out.println("3. Registrar materia                        ");
            System.out.println("4. Asignar materia a estudiante             ");
            System.out.println("5. Registrar calificacion                   ");
            System.out.println("6. Buscar estudiante                        ");
            System.out.println("7. Mostrar estudiantes                      ");
            System.out.println("8. Mostrar materias                         ");
            System.out.println("9. Mostrar reporte de promedios             ");
            System.out.println("10. Salir                                   ");
            System.out.println("============================================");

            System.out.println("\nIngrese la opcion que desee seleccionar: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
                case 7:{
                    break;
                }
                case 8:{
                    break;
                }
                case 9:{
                    break;
                }
                case 10:{
                    break;
                }
                default:{
                    System.out.println("Esa opcion no es valida.");
                    break;
                }
            }
        }while(opcion != 10);
    }
}
