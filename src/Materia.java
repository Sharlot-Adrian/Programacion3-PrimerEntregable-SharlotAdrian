public class Materia {
    
    private String codigo;
    private String nombreMateria;
    private int cantidadCreditos;
    private double calificacion;

    public Materia(String codigo, String nombreMateria, int cantidadCreditos, double calificacion){
        setCodigo(codigo);
        setNombreMateria(nombreMateria);
        setCantidadCreditos(cantidadCreditos); 
        this.calificacion = 0.00; 
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombreMateria(){
        return nombreMateria;
    }

    public int getCantidadCreditos(){
        return cantidadCreditos;
    }

    public double getCalificacion(){
        return calificacion;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNombreMateria(String nombreMateria){
        this.nombreMateria = nombreMateria;
    }

    public void setCantidadCreditos(int cantidadCreditos){
        this.cantidadCreditos = cantidadCreditos;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
}
