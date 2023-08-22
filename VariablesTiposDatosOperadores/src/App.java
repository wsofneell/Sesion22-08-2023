import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        float altura, anchura, largo;

        System.out.println( "Altura");
        altura = lector.nextFloat();
        
        System.out.println( "anchura");
        anchura = lector.nextFloat();

        System.out.println( "largo");
        largo = lector.nextFloat();

        float volumen = altura * anchura * largo;
        System.out.println("El volumen es: " + volumen + "metros ");
        
        lector.close();


        
    }
}
