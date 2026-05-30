public class Profesor extends Persona {
    
    private String codigo;
    private String especialidad;

    public Profesor(String nombre, String apellido, String codigo, String especialidad){
        super(nombre, apellido);
        setCodigo(codigo);
        setEspecialidad(especialidad);
    }

    public String getCodigo(){
        return codigo;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("[INFORMACION DEL PROFESOR: " + getNombre() + " " + getApellido()+ "]");
        System.out.println("*------------------------------------------*");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Especialidad: " + getEspecialidad());
    }
}
