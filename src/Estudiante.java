public class Estudiante extends Persona{
    
    private String matricula;
    private int edad;
    private String carrera;
    private String fechaInscripcion;

    public Estudiante(String nombre, String apellido, String matricula, int edad, String carrera, String fechaInscripcion){
        super(nombre,apellido);
        setMatricula(matricula);
        setEdad(edad);
        setCarrera(carrera);
        setFechaInscripcion(fechaInscripcion);
    }

    public String getMatricula(){
        return matricula;
    }

    public int getEdad(){
        return edad;
    }
    
    public String getCarrera(){
        return carrera;
    }

    public String getFechaInscripcion(){
        return fechaInscripcion;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setFechaInscripcion(String fechaInscripcion){
        this.fechaInscripcion = fechaInscripcion;
    }


}
