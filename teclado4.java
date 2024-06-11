import java.util.Scanner;
public class teclado4 {
    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);

        int num1, num2, total;
        System.out.println("Ingresa tu edad: ");
        num1 = cd.nextInt();
        System.out.println("Ingrese el anio actual");
        num2 = cd.nextInt();
        
        total = (int)(num2 - num1);

        System.out.println("En anio en que naciste es: "+ total);
    }
    
}
