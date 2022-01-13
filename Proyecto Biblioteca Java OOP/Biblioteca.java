
import java.util.*;
/**
 * TP INTEGRADOR CLASE BIBLIOTECA
 * 
 * @(Jesus Ayala, Claudio Castillo, Giovanni Centurion)
 * @date: 06/11/2020
 * @version 2.0
 */
public class Biblioteca
{
    //Atributos
   private String nombre;
   private ArrayList<Libro> libros;
   private ArrayList<Socio> socios;
   
   /**
    * Constructor N°1 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    */
   public Biblioteca(String p_nombre){
    this.setNombre(p_nombre);
    this.setArrayLibros(new ArrayList<Libro>());
    this.setArraySocios(new ArrayList<Socio>());
   }
   
   /**
    * Constructor N°2 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un objeto libro de tipo Libro.
    */
   public Biblioteca(String p_nombre,Libro p_libro){
    this.setNombre(p_nombre);
    this.setArrayLibros(new ArrayList<Libro>());
    this.addLibro(p_libro);
    this.setArraySocios(new ArrayList<Socio>());
   }
   /**
    * Constructor N°3 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un ArrayList de  libros de tipo Libro.
    */
   public Biblioteca(String p_nombre,ArrayList<Libro> p_libro){
    this.setNombre(p_nombre);
    this.setArrayLibros(p_libro);
    this.setArraySocios(new ArrayList());
   }
   /**
    * Constructor N°4 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un ArrayList de  socios de tipo Socio.
    */
   public Biblioteca(ArrayList<Socio> p_socio,String p_nombre){
    this.setNombre(p_nombre);
    this.setArrayLibros(new ArrayList<Libro>());
    this.setArraySocios(p_socio);
   }
   /**
    * Constructor N°5 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un objeto socio de tipo Socio.
    */
   public Biblioteca(Socio p_socio,String p_nombre){
    this.setNombre(p_nombre);
    this.setArrayLibros(new ArrayList<Libro>());
    this.setArraySocios(new ArrayList<Socio>());
    this.addSocio(p_socio);
   }
   /**
    * Constructor N°6 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un ArrayList de libros de tipo Libro.
    * @param Recibe como parametro un ArrayList de socios de tipo Socio.
    */
   public Biblioteca(String p_nombre,ArrayList<Libro> p_libro,ArrayList<Socio> p_socio){
    this.setNombre(p_nombre);
    this.setArrayLibros(p_libro);
    this.setArraySocios(p_socio);
   }
   /**
    * Constructor N°7 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un ArrayList de socios de tipo Socio.
    * @param Recibe como parametro un objeto libro de tipo Libro.
    */
   public Biblioteca(String p_nombre, ArrayList<Socio> p_socio,Libro p_libro){
    this.setNombre(p_nombre);
    this.setArrayLibros(new ArrayList<Libro>());
    this.addLibro(p_libro);
    this.setArraySocios(p_socio);
   }
   /**
    * Constructor N°8 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un ArrayList de libros de tipo Libro.
    * @param Recibe como parametro un objeto socio de tipo Socio.
    */
   public Biblioteca(String p_nombre, Socio p_socio,ArrayList<Libro> p_libro){
    this.setNombre(p_nombre);
    this.setArrayLibros(p_libro);
    this.setArraySocios(new ArrayList());
    this.addSocio(p_socio);
   }
   /**
    * Constructor N°9 Biblioteca
    * @param Recibe como parametro un nombre de tipo String.
    * @param Recibe como parametro un objeto libro de tipo Libro.
    * @param Recibe como parametro un objeto socio de tipo Socio.
    */
   public Biblioteca(String p_nombre, Socio p_socio,Libro p_libro){
    this.setNombre(p_nombre);
    this.setArrayLibros(new ArrayList<Libro>());
    this.addLibro(p_libro);
    this.setArraySocios(new ArrayList<Socio>());
    this.addSocio(p_socio);
   }
   /**Setter**/
   private void setNombre(String p_nombre){this.nombre = p_nombre;}
   /**Setter**/
   private void setArrayLibros(ArrayList<Libro> p_libros){this.libros = p_libros;}
   /**Setter**/
   private void setArraySocios(ArrayList<Socio> p_socios){this.socios = p_socios;}
   
   /**Getter**/
   public String getNombre(){return this.nombre;}
   /**Getter**/
   public ArrayList<Libro> getArrayLibros(){return this.libros;}
   /**Getter**/
   public ArrayList<Socio> getArraySocios(){return this.socios;}
   
   /**
    * Metodo para agregar un Socio a la coleccion Socios
    * @param Recibe como parametro un objeto de tipo Socio
   **/
   public void addSocio(Socio p_socio){this.getArraySocios().add(p_socio);}
   /**
    * Metodo para remover un Socio a la coleccion Socios
    * @param Recibe como parametro un objeto de tipo Socio
   **/
   public void removeSocio(Socio p_socio){this.getArraySocios().remove(p_socio);}
   /**
    * Metodo para agregar un libro a la coleccion Libros
    * @param Recibe como parametro un objeto de tipo Libro
   **/
   private  void addLibro(Libro p_libro){this.getArrayLibros().add(p_libro);}
   /**
    * Metodo para remover un libro a la coleccion Libros
    * @param Recibe como parametro un objeto de tipo Libro
   **/
   public void removeLibro(Libro p_libro){this.getArrayLibros().remove(p_libro);}
   
   /**
    * Metodo que crea un nuevo libro de acuerdo a los parametros que recibe, y lo agrega a la coleccion de libros.
    * @param Recibe como parametro un titulo.
    * @param Recibe como parametro el numero de edicion.
    * @param Recibe como parametro la editorial.
    * @param Recibe como parametro el año.
    */
   public void nuevoLibro(String p_titulo,int p_edicion, String p_editorial, int p_anio){
       Libro libro = new Libro(p_titulo,p_edicion,p_editorial,p_anio);   
       this.addLibro(libro);
   }
   /**
    * Metodo que crea un nuevo socio Estudiante de acuerdo a los parametros que recibe, y lo agrega a la coleccion de Socios.
    * @param Recibe como parametro un dni.
    * @param Recibe como parametro el nombre del socio.
    * @param Recibe como parametro la carrera.
    */
   public void nuevoSocioEstudiante(int p_dniSocio,String  p_nombre, String p_carrera){
          Estudiante estudiante = new Estudiante (p_dniSocio,p_nombre,p_carrera);     
          this.addSocio(estudiante);
   }
   /**
    * Metodo que crea un nuevo socio Docente de acuerdo a los parametros que recibe, y lo agrega a la coleccion de Socios.
    * @param Recibe como parametro un dni.
    * @param Recibe como parametro el nombre del socio.
    * @param Recibe como parametro la area.
    */
   public void nuevoSocioDocente(int p_dniSocio,String  p_nombre, String p_area){
            Docente docente = new Docente(p_dniSocio,p_nombre,p_area);
            this.addSocio(docente);
   }
   
   /**
    * Metodo que devuelve la cantidad de socios por cada tipo, dependiendo del string que reciba como parametro.
    * @param Recibe un string con el tipo de socio.
    * @return Retorna la cantidad de socios por tipo.
    */
   public int cantidadSociosPorTipo(String p_objeto){
      int  cantidad=0;
      for(Socio s: this.getArraySocios()){
        if(s.soyDeLaClase() == p_objeto){
           cantidad++;
           }
    }
      return cantidad;
   }
   
   /**
    * Metodo devuelve true o false ,dependiendo de si se cumple las condiciones para prestar un libro.
    * @param Recibe como parametro un Calendar con la fecha actual.
    * @param Recibe como parametro un socio.
    * @param Recibe como parametro un libro.
    * @return Devuelve true o false.
    */
   public boolean prestarLibro(Calendar p_fechaRetiro,Socio p_socio,Libro p_libro){
         boolean valor=false;
         if( p_socio.puedePedir()==true && this.getArraySocios().contains(p_socio)==true && 
                            this.getArrayLibros().contains(p_libro)==true){
                    Prestamo p = new Prestamo(p_fechaRetiro,p_socio,p_libro);
                    p_socio.addPrestamo(p);
                    p_libro.addPrestamo(p);
                    return true;
            }else{
               return false;
            }
   }
   
   /**
    * Metodo que devuelve un libro, registrando la fecha de devolucion al ultimo prestamo del libro que se recibe como parametro.
    * Se borra el ultimo prestamo del socio ubicado en el ultimo prestamo del libro.
    * @param Recibe como parametro el libro a devolver.
    */
   public void devolverLibro(Libro p_libro){
          Calendar fechaHoy=new GregorianCalendar();
          p_libro.getPrestamo().registrarFechaDevolucion(fechaHoy);
          p_libro.getPrestamo().getSocio().getPrestamos().remove(p_libro.getPrestamo().getSocio().getPrestamos().get(p_libro.getPrestamo().getSocio().getPrestamos().size() - 1));
    }
    /**
     * Metodo que crea una coleccion de prestamos , que contiene los prestamos vencidos.
     * @return Retorna la coleccion de prestamos vencidos.
     */
   public ArrayList<Prestamo> prestamosVencidos(){
        Calendar fechaHoy = new GregorianCalendar();
        ArrayList<Prestamo> vencidos = new ArrayList<Prestamo>();
          for(Libro libro: this.getArrayLibros()){
             if(libro.getPrestamos().isEmpty()==false && libro.getPrestamo().vencido(fechaHoy)==true){
                vencidos.add(libro.getPrestamo());
             }
            }
        return vencidos;
   }
   /**
     * Metodo que crea una coleccion de docentes , que contiene a los docentes que se consideran responsables.
     * @return Retorna la coleccion de docentes responsables.
     */
   public ArrayList<Docente> docentesResponsables(){
           ArrayList<Docente> docentes = new ArrayList<Docente>();
           for(Socio d: this.getArraySocios()){
             if( d instanceof Docente){
                  Docente docente = (Docente)d;
                  if(docente.esResponsable()==true){
                    docentes.add(docente);
                    }
                  
                }
            }
            return docentes;
   }
   /**
    * Metodo que busca y devuelve los datos del socio que  tiene el libro que se recibe como parametro.
    * @return En caso de que no lo tenga nadie, se devuelve la leyenda correspondiente.
    * @return Devuelve los datos del socio correspondiente.
    * @param Recibe como parametro un libro.
    */
     public String quienTieneElLibro(Libro p_libro){
         
         if (p_libro.prestado()==true){
            return p_libro.getPrestamo().getSocio().toString();
             
            }else {
                return "El libro se encuentra en la biblioteca.";
           
        }
    }   
    /**
     * Metodo que devuelve una lista completa con los datos de los socios(nombre,tipo y cantidad de libros prestados).
     * @return Lista concatenada con los datos.
     */
   public String listaDeSocios(){
          int contador=0;
          String lista="";
          for(Socio socio: this.getArraySocios()){
            contador++;
            lista = lista.concat(contador+")D.N.I: "+socio.getDniSocio()+" || "+socio.getNombre()+"( "+socio.soyDeLaClase()+") || Libros Prestados: "+socio.cantLibrosPrestados()+"\n");
          }
          lista = lista.concat("*******************************\nCant. Socios tipo Estudiante: "+cantidadSociosPorTipo("Estudiante")+"\nCant. Socios tipo Docente: "+cantidadSociosPorTipo("Docente"));
          return lista;
    }
    /**
     * Metodo que devuelve una lista completa con los datos de los libros que se encuentran en la biblioteca(titulo, y si esta  prestado o no).
     * @return Lista concatenada con los datos.
     */
   public String listaDeLibros(){
           int contador=0;
           String lista="";
           for(Libro l: this.getArrayLibros()){
              if(l.prestado()==true){
                 contador++;
                 lista =lista.concat(contador+") "+l.toString()+" || Prestado:(SI)\n") ;
            }else{
                 contador++;
                 lista =lista.concat(contador+") "+l.toString()+" || Prestado:(NO)\n") ;
            }
           }
           return lista;
    }
    /**
     * Metodo que devuelve una lista con los datos de los docentes responsables, leyendo la coleccion que retorna el metodo docentesResponsables().
     * @return Retorna la lista de docentes responsables.
     */
   public String listaDeDocentesResponsables(){
         int contador=0;
         String lista="";
         for(Docente d: this.docentesResponsables()){
            contador++;
            lista = lista.concat(contador+")D.N.I: "+d.getDniSocio()+" || "+d.getNombre()+"( "+d.soyDeLaClase()+") || Libros Prestados: "+d.cantLibrosPrestados()+"\n");
         }
         return lista;
      }
      /**
       * Metodo que busca un socio en la coleccion, segun el numero de dni que se recibe como parametro.
       * Si encuentra el socio, lo devuelve, si no , retorna un objeto socio null.
       * @param Recibe como parametro un numero de Dni.
       * @return Retorna un objeto de tipo Socio.
       */
   public Socio buscarSocio(int dni){
       Socio socio=null;
       for(Socio s: this.getArraySocios()){
          if(s.getDniSocio()== dni){
              socio= s;
            }
        }
       return socio;
}  
}
