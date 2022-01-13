
/**
 * TP INTEGRADOR CLASE DOCENTE
 * 
 * @author (your name) 
 * @date 06/11/2020
 */
public class Docente extends Socio{ 
   /**Variables de Instancia**/ 
   private String area;
   
   /**Constructor de La Clase Docente**/
   public Docente(int p_dniSocio, String p_nombre, String p_area){
       super(p_dniSocio, p_nombre, 5);
       this.setArea(p_area);
   }
   
   /**Setter**/
   private void setArea(String p_area){
       this.area = p_area;
   }
   /**Getter**/
   public String getArea(){
       return this.area;
   }
   /**@return True o False dependiendo si el docente puede pedir o no Libros**/
   public boolean esResponsable(){
       return super.puedePedir();
   }
   /**
      *@param p_dias Contiene la cantidad de dias que se le sumaran a los anteriormente poseia el Docente
      *Agrega de prestamo al docente
       **/
   public void agregarDiasDePrestamo(int p_dias){
       super.setDiasPrestamo(p_dias + super.getDiasPrestamo());//Para que esto funcione en la clase Socio, en el setDiasPrestamo coloquen que sume lo que tiene previamente mas lo que se le mande por parametro 
   }
   /**@return Devuelve un string indicando que el socio es un Docente**/
   public String soyDeLaClase(){
       return "Docente";
   }
}