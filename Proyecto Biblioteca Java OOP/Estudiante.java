
/**
 * TP INTEGRADOR CLASE ESTUDIANTE
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Socio{
    /**Variables de Instancia**/
    private String carrera;
    
    /**Constructores de la Clase Estudiante**/
    public Estudiante(int p_dni, String p_nombre, String p_carrera){
        super(p_dni, p_nombre, 5);
        this.setCarrera(p_carrera);
    }
    /**Setter**/
    private void setCarrera(String p_carrera){
        this.carrera = p_carrera;
    }
    /**Getter**/
    public String getCarrera(){
        return this.carrera;
    }
    /**
       *@return True o False dependiendo si el Alumno puede solicitar o no un prestamo
       *Verifica que el alumno no tenga prestamos vencidos o que no tenga mas de 3 libros prestados al mismo tiempo 
       **/
    public boolean puedePedir(){
        if(super.puedePedir() == true && super.cantLibrosPrestados() < 3){
            return true;
        }else{
            return false;
        }
    }
    /**@return Devuelve un string indicando que el socio es un Estudiante**/
    public String soyDeLaClase(){
        return ("Estudiante");
    }
}
