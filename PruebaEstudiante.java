import java.util.Scanner;

 public class PruebaEstudiante
{
    public static void main(String[] args){

    String cuenta, nombre, clase1, clase2, clase3, cod1, cod2, cod3;
    Double  nota1, nota2, nota3;

    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese la cuenta del estudiante: "); 
    cuenta = input.next();

    System.out.print("Ingrese el nombre del estudiante: "); 
    nombre = input.next();

    System.out.print("Ingrese el codigo de la clase 1: "); 
    cod1 = input.next();

    System.out.print("Ingrese el nombre de la clase 1: "); 
    clase1 = input.next();

    System.out.print("Ingrese la nota de la clase 1: "); 
    nota1 = input.nextDouble();

    System.out.print("Ingrese el codigo de la clase 2: "); 
    cod2 = input.next();

    System.out.print("Ingrese el nombre de la clase 2: "); 
    clase2 = input.next();

    System.out.print("Ingrese la nota de la clase 2: "); 
    nota2 = input.nextDouble();

    System.out.print("Ingrese el codigo de la clase 3: "); 
    cod3 = input.next();

    System.out.print("Ingrese el nombre de la clase 3: "); 
    clase3 = input.next();

    System.out.print("Ingrese la nota de la clase 3: "); 
    nota3 = input.nextDouble();

    Clase c= new Clase(cod1, clase1, nota1, cod2, clase2, nota2, cod3, clase3, nota3 );
    Estudiante e1 = new Estudiante (cuenta, nombre, c);

    System.out.print(e1);



    }
}
