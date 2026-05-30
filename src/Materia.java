public class Materia {
    
    private String codigo;
    private String nombreMateria;
    private double cantidadCreditos;
    private double calificacion;

    public Materia(String codigo, String nombreMateria, double cantidadCreditos){
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

    public double getCantidadCreditos(){
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

    public void setCantidadCreditos(double cantidadCreditos){
        this.cantidadCreditos = cantidadCreditos;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }

    public void mostrarInformacion(){
        System.out.println("\n[ INFORMACION DE LA MATERIA: " + getNombreMateria() + "]");
        System.out.println("*------------------------------------------*");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre de la materia: " + getNombreMateria());
        System.out.println("Cantidad de creditos: " + getCantidadCreditos());
      
    }
}
