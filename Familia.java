public class Familia
 {
     private String  rol;
     private Persona person;

     public Familia(String rol, Persona person){
         this.rol=rol;
         this.person=person;
     }

    public String toString(){
        return String.format("%s%n-%s", person, rol);
    }
 }