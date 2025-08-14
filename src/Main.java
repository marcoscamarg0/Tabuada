import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("digite um número inteiro entre 1 e 10: ");
            numero = sc.nextInt();

            if (numero >= 1 && numero <= 10) {
                break;
            } else {
                System.out.println("número inválido! Tente novamente.");
            }
        }
        System.out.println("tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
