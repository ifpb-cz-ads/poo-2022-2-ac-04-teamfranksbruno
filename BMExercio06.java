import java.util.Scanner;

public class BMExercio06 {
    public static void main (String[] args) {
        int numero = 1;

        while(numero != 0) {

            System.out.print("Digite um numero: ");
            Scanner input = new Scanner(System.in); 
            numero = input.nextInt();

            String[] Dias = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
            if (numero > 0 && numero < 8) {
                System.out.println(Dias[numero - 1]);
            }
        }
    }
}