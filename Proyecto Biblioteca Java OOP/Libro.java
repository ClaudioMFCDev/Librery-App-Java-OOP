import java.util.*;
/**
 * Clase  Libro TP INTEGRADOR .
 * 
 * @author (Augusto Almiron) 
 * @version (1.0)
 * @date: 06/11/2020
 */
public class Libro
{
   /** DECLARACION DE ATRIBUTOS */
   private ArrayList <Prestamo> prestamos;
   private String titulo;
   private String editorial;
   private int edicion;
   private int anio;
   
  
   /**Definicion metodo Construtor */
  public Libro (String p_titulo,int p_edicion, String p_editorial, int p_anio){
       this.setAnio(p_anio);
       this.setTitulo(p_titulo);
       this.setEditorial(p_editorial);
       this.setEdicion(p_edicion);
       this.setPrestamos(new ArrayList<Prestamo>());
    }
  public Libro (String p_titulo,int p_edicion, String p_editorial, int p_anio,ArrayList<Prestamo> prestamos){
       this.setAnio(p_anio);
       this.setTitulo(p_titulo);
       this.setEditorial(p_editorial);
       this.setEdicion(p_edicion);
       this.setPrestamos(prestamos);
    }  
  public Libro (String p_titulo,int p_edicion, String p_editorial, int p_anio,Prestamo prestamo){
       this.setAnio(p_anio);
       this.setTitulo(p_titulo);
       this.setEditorial(p_editorial);
       this.setEdicion(p_edicion);
       this.setPrestamos(new ArrayList<Prestamo>());
       this.getPrestamos().add(prestamo);
    }    
    
    /**Setter*/ 
    private void setPrestamos (ArrayList<Prestamo> p_prestamos){
     this.prestamos = p_prestamos;   
    }
    /**Getter*/
    public ArrayList<Prestamo> getPrestamos (){                   //ARRAY LIST PRESTAMOS
     return this.prestamos;   
    }
    /**Setter*/
    private void setAnio (int p_anio){
     this.anio = p_anio;   
    }
    /**Getter*/
    public int getAnio (){                      //ANIO
     return this.anio;                  
    }
    
    /**Getter*/
    public Prestamo  getPrestamo (){
        Prestamo prestamo = null;
        
        
        if(this.getPrestamos().isEmpty()==true){
            return null;
        }else{
            int i = this.getPrestamos().size();
            prestamo = this.getPrestamos().get(i-1);
        }
        
        return prestamo;
    }
    /**Setter*/
    private void setEdicion (int p_edicion){
     this.edicion = p_edicion;   
    }     
    /**Getter*/     //EDICION
    public int getEdicion (){
     return this.edicion;   
    }
    
    /**Setter*/
    private void setTitulo (String p_titulo){
     this.titulo = p_titulo;   
    }
    /**Getter*/
    public String getTitulo(){                      //TITULO
     return this.titulo;   
    }
    
    /**Setter*/
    private void setEditorial (String p_editorial){
     this.editorial = p_editorial;              
    } 
    /**Getter*///EDITORIAL
    public String getEditorial(){
     return this.editorial;   
    }
    
    /***METODOS DEFINIDOS DEL ENUNCIADO*/
    /**AGREGA UN PRESTAMO */
    public boolean addPrestamo (Prestamo p_prestamo){
        return this.getPrestamos().add(p_prestamo); 
    }
    
    /**SI EL LIBRO ESTA PRESTADO RETORNA TRUE CASO CONTRARIO RETORNA FALSE*/
    public boolean prestado(){
       if(this.getPrestamos().isEmpty()==false && this.getPrestamo().getFechaDevolucion()==null){
  
           return true;
        }else{
            return false;
        }
   
    }   
       
    
   
   /**RETORNA EL TITULO DEL LIBRO */
   public String toString (){     
      return "Titulo: "+this.getTitulo();
    }  
    
    /**Borra el ultimo prestamo */
   public boolean removePrestamo (Prestamo p_prestamo){
        return this.getPrestamos().remove(p_prestamo);   
    }  
}
