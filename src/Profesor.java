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
}
