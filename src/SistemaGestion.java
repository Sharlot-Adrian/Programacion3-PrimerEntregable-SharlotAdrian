import java.util.Scanner;
import java.util.ArrayList;

public class SistemaGestion {
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Persona> registroProfesores = new ArrayList<>();
    ArrayList<Persona> registroEstudiantes = new ArrayList<>();
    ArrayList<Materia> registroMaterias = new ArrayList<>();

    public void recorrerRegistroEstudiantes(){
        for(int i = 0; i < registroEstudiantes.size(); i++){
            registroEstudiantes.get(i).mostrarInformacion();
        }
    }

     public void recorrerRegistroMaterias(){
        for(int i = 0; i < registroMaterias.size(); i++){
            registroMaterias.get(i).mostrarInformacion();
        }
    }

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
                case 1:{ //Atributos de estudiante: String nombre, String apellido, 
                // String matricula, int edad, String carrera, String fechaInscripcion
                    System.out.println("\n[ REGISTRAR ESTUDIANTE ]");
                    System.out.println("*------------------------------------------*");
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el apellido del estudiante: ");
                    String apellido = scanner.nextLine();

                    System.out.println("Ingrese la matricula del estudiante");
                    String matricula = scanner.nextLine();

                    System.out.println("Ingrese la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese la carrera del estudiante: ");
                    String carrera = scanner.nextLine();

                    System.out.println("Ingrese la fecha de inscripcion del estudiante: ");
                    String fechaInscripcion = scanner.nextLine();

                    System.out.println("*------------------------------------------*");

                    Persona est = new Estudiante(nombre, apellido, matricula, edad, carrera, fechaInscripcion);
                    registroEstudiantes.add(est);
                    System.out.println("[ Se ha agregado un estudiante satisfactoriamente!]");
                    System.out.println("*------------------------------------------*");

                    break;
                }
                case 2:{
                    //Atributos de profesor: String nombre, String apellido, 
                    // String codigo, String especialidad
                    System.out.println("\n[ REGISTRAR PROFESOR ]");
                    System.out.println("*------------------------------------------*");
                    System.out.println("Ingrese el nombre del profesor: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el apellido del profesor: ");
                    String apellido = scanner.nextLine();

                    System.out.println("Ingrese el codigo del profesor");
                    String codigo = scanner.nextLine();

                    System.out.println("Ingrese la especialidad del profesor: ");
                    String especialidad = scanner.nextLine();

                    System.out.println("*------------------------------------------*");

                    Persona prof = new Profesor(nombre, apellido, codigo, especialidad);
                    registroProfesores.add(prof);
                    System.out.println("[ Se ha agregado un profesor satisfactoriamente!]");
                    System.out.println("*------------------------------------------*");

                    break;
                }
                case 3:{

                    //Atributos de materia: String codigo, 
                    // String nombreMateria, int cantidadCreditos
                    System.out.println("\n[ REGISTRAR MATERIA ]");
                    System.out.println("*------------------------------------------*");
                    System.out.println("Ingrese el codigo de la materia: ");
                    String codigo = scanner.nextLine();

                    System.out.println("Ingrese el nombre de la materia: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese la cantidad de creditos de la materia");
                    int cantidadCreditos = scanner.nextInt();

                    System.out.println("*------------------------------------------*");
                    registroMaterias.add(new Materia(codigo, nombre, cantidadCreditos));
                    System.out.println("[ Se ha agregado una materia satisfactoriamente!]");
                    System.out.println("*------------------------------------------*");

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
                    System.out.println("\n[ MOSTRAR ESTUDIANTES ]");
                    recorrerRegistroEstudiantes();
                    break;
                }
                case 8:{

                    System.out.println("\n[ MOSTRAR MATERIAS ]");
                    recorrerRegistroMaterias();
                    
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
