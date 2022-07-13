public class Clase
 {
    private String cod1, clase1, cod2, clase2, cod3, clase3;
    private Double nota1, nota2, nota3, promedio;

    public Clase (String cod1, String clase1, Double nota1, String cod2, String clase2, Double nota2, String cod3, String clase3, Double nota3){
        this.cod1=cod1;
        this.clase1=clase1;
        this.nota1=nota1;
        this.cod2=cod2;
        this.clase2=clase2;
        this.nota2=nota2;
        this.cod3=cod3;
        this.clase3=clase3;
        this.nota3=nota3;
        promedio=(nota1+nota2+nota3)/3;


    }

     public String toString(){
        return String.format("Promedio: %f%n", promedio);

 }
 }