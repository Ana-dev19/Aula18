import java.util.Scanner;

public class ExercicioQuatro {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            int numero1 = input.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = input.nextInt();

            if (numero1 > numero2) {
                System.out.println(numero1 + " " + numero2);
            } else {
                System.out.println(numero2 + " " + numero1);
            }
        }
    }
