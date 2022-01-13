/**
 * Abstract class Socio, cuenta con las caracteristicas que lo componen a un socio, ademas de permitirnos realizar distintas operaciones
 * en cuanto a prestamos, entre otros.
 * 
 * @author: Aguado, Axel Tomas.
 * Date: 02/11/2020
 */
import java.util.Calendar;
import java.util.ArrayList;
public abstract class Socio{
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList <Prestamo> prestamos;
    
    /**
     * Constructor de la clase, al ser invocado nos permite inicializar los atributos(caracteristicas) del objeto.
     */
    Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo){
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList <Prestamo> ());
    }
    
    /**
     * Constructor sobrecargado de la clase, al ser invocado nos permite inicializar los atributos(caracteristicas) del objeto.
     */
        Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo,ArrayList prestamos){
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(prestamos);
    }
    
    /**
     * Constructor sobrecargado de la clase, al ser invocado nos permite inicializar los atributos(caracteristicas) del objeto.
     */
    Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo,Prestamo prestamo){
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList <Prestamo> ());
        this.getPrestamos().add(prestamo);
    }
    
    
    private void setDniSocio(int p_dniSocio){
        this.dniSocio=p_dniSocio;
    }
    
     
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    /**
     * Permite asignar los dias de prestamo que se tiene de un libro.
     */
    protected void setDiasPrestamo(int p_diasPrestamo){
        this.diasPrestamo=p_diasPrestamo;
    }
    
    
    private void setPrestamos(ArrayList <Prestamo> p_prestamos){
        this.prestamos=p_prestamos;
    }
    
    /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo dniSocio.
     * @return el numero de dni del socio.
     */
    public int getDniSocio(){
        return this.dniSocio;
    }
    
    /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo nombre.
     * @return el nombre del socio.
     */ 
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo diasPrestamo.
     * @return los dias de prestamo dellibro pedido.
     */  
    public int getDiasPrestamo(){
        return this.diasPrestamo;
    }
    
    /**
     * Nos permite obtener el estado(valor que toma el atributo) del atributo prestamos.
     * @return una lista con los prestamos.
     */  
    public ArrayList getPrestamos(){
        return this.prestamos;
    }
    
    /**
     * Agrega un prestamo a la lista de prestamos.
     * @return un valor booleano.
     */  
    public boolean addPrestamo(Prestamo p_prestamo){
        return this.getPrestamos().add(p_prestamo);
    }
    
    /**
     * Elimina un prestamo de la lista de prestamos.
     * @return un valor booleano.
     */  
    public boolean removePrestamo(Prestamo p_prestamo){
        return this.getPrestamos().remove(p_prestamo);
    }
    
    /**
     * Contabiliza los prestamos que se han realizado para el socio.
     * @return el numero de prestamos.
     */
     public int cantLibrosPrestados(){
        return this.getPrestamos().size();
    }
    
    /**
     * Genera una linea con las caracteristicas que componen al Socio.
     * @return una cadena de caracteres con dichas caracteristicas.
     */
    public String toString(){
        return "DNI: "+this.getDniSocio() +"|| "+ this.getNombre()+ "("+this.soyDeLaClase()+") || Libros Prestados:"+ this.cantLibrosPrestados(); 
    }
    
    /**
     * Metodo a implementar en las sublclases que se extiendan de Socio.
     */
    public abstract String soyDeLaClase();
    
    /**
     * Define si un socio puede pedir prestado un libro.
     * @return un valor booleano dependiendo si puede hacerlo o no.
     */
    public boolean puedePedir(){
        int prestamoVencido=0;
        Calendar fechaHoy= Calendar.getInstance();
        
        //Se contabiliza la cantidad de prestamos vencidos de la lista.
        for (Object p: this.getPrestamos()){
           if(((Prestamo)p).vencido(fechaHoy)==true){
               prestamoVencido++;
            }
        }
        
        //Si se contabilizo un prestamo vencido o no devuelve el valor booleano.
        if(prestamoVencido == 0){
            return true;
        }else {
            return false;
        }
    }
}

