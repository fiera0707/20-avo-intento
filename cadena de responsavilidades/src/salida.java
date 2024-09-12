import java.util.Scanner;

public class salida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cagero cagero = new Cagero();
        int monto = 0;

        while (true) {
            System.out.println("ingrese la cantidad a retirar");
            monto = sc.nextInt();
            if (monto % 10000 != 0) {
                System.out.println("Error: ingrese otra cantidad");
            } else {
                break;
            }
        }

        cagero.dispense(monto);
        sc.close();

    }
}
