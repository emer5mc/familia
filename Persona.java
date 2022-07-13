public class Persona
 {
     private String  nom, genero, nacimiento, id;

     public Persona(String nom, String genero, String nacimiento, String id){
         this.nom=nom;
         this.genero=genero;
         this.nacimiento=nacimiento;
         this.id=id;
     }

    public String toString(){
        return String.format("%s (%s) %s  %s", nom, id, genero, nacimiento);
    }

 }