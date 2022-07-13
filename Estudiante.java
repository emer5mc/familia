public class Estudiante
 {
    private String cuenta, nombre;
    private Clase clas;

    public Estudiante(String cuenta, String nombre, Clase clas){
        this.cuenta=cuenta;
        this.nombre=nombre;
        this.clas=clas;
    }

    public String toString(){
        return String.format("Cuenta: %s    Nombre: %s%n %s", cuenta, nombre, clas);
    }


 }