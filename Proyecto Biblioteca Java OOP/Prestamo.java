/**
 * La clase Prestamos, cuenta con las caracterisiticas que lo componen, ademas del comportamiento que lo caracteriza como tal.
 * 
* @author (Aguado, Axel Tomas) 
 * @version (02/11/2020)
 */
import java.util.Calendar;
public class Prestamo{
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Libro libro;
    private Socio socio;
    
    /**
     * Constructor de la clase, al ser invocado nos permite inicializar los atributos(caracteristicas) del objeto.
     */
    Prestamo(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        this.setFechaRetiro(p_fechaRetiro);
        this.setSocio(p_socio);
        this.setLibro(p_libro);
        this.setFechaDevolucion(null);
    }
    
    private void setFechaRetiro(Calendar p_fechaRetiro){
        this.fechaRetiro=p_fechaRetiro;
    }
    
    private void setFechaDevolucion(Calendar p_fechaDevolucion){
        this.fechaDevolucion=p_fechaDevolucion;
    }
    
    private void setLibro(Libro p_libro){
        this.libro=p_libro;
    }
    
    private void setSocio(Socio p_socio){
        this.socio=p_socio;
    }
    
     /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo fechaRetiro.
     * @return la fecha en que se retiro el libro.
     */
    public Calendar getFechaRetiro(){
        return this.fechaRetiro;
    }
    
     /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo fechaDevolucion.
     * @return la fecha hasta qe se puede devolver el libro.
     */
    public Calendar getFechaDevolucion(){
        return this.fechaDevolucion;
    }
    
    /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo libro.
     * @return el libro prestado.
     */
    public Libro getLibro(){
        return this.libro;
    }
    
     /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo socio.
     * @return el socio al que se le presta el libro.
     */
    public Socio getSocio(){
        return this.socio;
    }
    
     /**
     * Nos permite registrar la fecha en la que se devuelve el libro.
     */
    public void registrarFechaDevolucion(Calendar p_fechaDevolucion){
        this.setFechaDevolucion(p_fechaDevolucion);
    }
    
     /**
     * Nos permite conocer si un prestamo esta vencido.
     * @param recibe una fecha, la cual se compara con la fecha en la que vence el prestamo, para conocer el estado del mismo.
     * @return un valor booleano dependiendo de si el prestamo esta vencido o no.
     */
    public boolean vencido(Calendar p_fecha){
        //Se inicializa una variable, que es la que se comparara con la recibida como parametro.
        Calendar fechaVencido= Calendar.getInstance();
        
        //Esta variable tomara como valor la fecha en la que se retiro el libro.
        fechaVencido.set(this.getFechaRetiro().get(Calendar.YEAR), this.getFechaRetiro().get(Calendar.MONTH), this.getFechaRetiro().get(Calendar.DATE));
        
        //A la fecha que tomo como valor se le agregaran los dias de prestamo.
        fechaVencido.add(Calendar.DAY_OF_YEAR, this.getSocio().getDiasPrestamo());
        
        //Compara ambas fechas, y si la fecha que recibe como parametro es despues de la fechaVencido el prestamo esta vencido.
        if(p_fecha.after(fechaVencido)){
            return true;
        }else{
            return false;
        }
     }
    
    /**
     * Genera una linea con las caracteristicas que componen al Prestamo.
     * @return una cadena de caracteres con dichas caracteristicas.
     */ 
    public String toString(){
        return "Retiro: "+this.getFechaRetiro() +"\t"+ "Devolucion:"+this.getFechaDevolucion()
        +"\n"+ "Libro: "+ this.getLibro().getTitulo() +"\n"+ "Socio: "+this.getSocio().getNombre();
    }
}

