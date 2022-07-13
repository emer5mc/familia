import java.util.Scanner;

 public class PruebaFamilia
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Persona person;
        Familia family;
        Direccion direction;

        String nom, genero, nacimiento, id, rol, casa, calle, barrio, ciudad;
        for( int x=0; x<2; x++){
            System.out.println(" ");
            System.out.print("Ingrese el nombre de la persona: "); 
            nom = input.next();

            System.out.print("Ingrese la identidad: "); 
            id = input.next();

            System.out.print("La fecha del nacimiento: "); 
            nacimiento = input.next();

            System.out.print("Ingrese el genero: "); 
            genero = input.next();

            System.out.print("Ingrese el rol de la persona en la familia: "); 
            rol = input1.next();

            System.out.print("Ingrese el # de casa:  "); 
            casa = input.next();

            System.out.print("Ingrese la calle: "); 
            calle = input.next();

            System.out.print("Ingrese el barrio de la persona: "); 
            barrio = input1.next();

            System.out.print("Ingrese la ciudad de la persona: "); 
            ciudad = input2.next();

            person= new Persona (nom, genero, nacimiento, id);
            family =new Familia(rol, person);
            direction= new Direccion( casa, calle, barrio, ciudad, family);

            System.out.println(" ");
            System.out.println(" ******************************* Impresion de Datos *******************************");
            System.out.print(direction);
            System.out.println(" ");
        }
    }
}
