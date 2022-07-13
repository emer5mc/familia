public class Direccion
 {
     private String  casa, calle, barrio, ciudad, d;
     private Familia family;

     public Direccion(String casa, String calle, String barrio, String ciudad, Familia family){
        this.casa=casa;
        this.calle=calle;
        this.barrio=barrio;
        this.ciudad=ciudad;
        this.family=family; 
        d="Casa "+casa+" calle "+calle+" "+barrio+" "+ciudad;
     }

     public String toString(){
        return String.format("%s%nDireccion %s", family, d);
    }
 }