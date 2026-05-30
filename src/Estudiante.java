import java.util.ArrayList;

public class Estudiante extends Persona {

    private String matricula;
    private int edad;
    private String carrera;
    private String fechaInscripcion;

    private ArrayList<Materia> materiasCursadas = new ArrayList<>();

    public Estudiante(String nombre, String apellido, String matricula, int edad, String carrera,
            String fechaInscripcion) {
        super(nombre, apellido);
        setMatricula(matricula);
        setEdad(edad);
        setCarrera(carrera);
        setFechaInscripcion(fechaInscripcion);
    }

    public ArrayList<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n[ INFORMACION DEL ESTUDIANTE: " + getNombre() + " " + getApellido() + "]");
        System.out.println("*------------------------------------------*");
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Fecha de inscripcion: " + getFechaInscripcion());
    }

    public void agregarMateria(Materia materia) {
        materiasCursadas.add(materia);
    }

    private double calcularSumaPuntos() {
        double puntosSumatoria = 0;
        if (!materiasCursadas.isEmpty()) {
            for (int i = 0; i < materiasCursadas.size(); i++) {
                double calif = materiasCursadas.get(i).getCalificacion();
                
                double valorPunto = 0;

                if (calif >= 90)
                    valorPunto = 4.00;
                else if (calif >= 85)
                    valorPunto = 3.50;
                else if(calif >= 80)
                    valorPunto = 3.00;
                else if(calif >= 75 )
                    valorPunto = 2.50;
                else if(calif >= 70)
                    valorPunto = 2.00;
                else if (calif >= 65)
                    valorPunto = 1.5;
                else if (calif >= 60)
                    valorPunto = 1.00;
                else
                    valorPunto= 0;

                double puntoTotal = valorPunto * materiasCursadas.get(i).getCantidadCreditos();
                puntosSumatoria += puntoTotal;

            }

        }

        return puntosSumatoria;
    }

    public double calcPromedio (){
        double sumaCreditos = 0;
        for (int i = 0; i < materiasCursadas.size(); i++) {
            sumaCreditos += materiasCursadas.get(i).getCantidadCreditos();
        }

        if (sumaCreditos == 0)
            return 0;

        return calcularSumaPuntos()/sumaCreditos;

    }

    public void mostrarPerfilResumido() {
        System.out.println("\n[ INFORMACION DEL ESTUDIANTE: " + getNombre() + " " + getApellido() + "]");
        System.out.println("*------------------------------------------*");
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Promedio *base 4*: " + calcPromedio());

        if (calcPromedio() >= 3){
            System.out.println("\n[Estudiante aprovado!]");
        }
        else
            System.out.println("\n[Estudiante Reprobado.]");


    }
}
