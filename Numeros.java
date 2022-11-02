package teclado;
import java.io.*;

public class Numeros {
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	
	System.out.println("Digite um numero de 0 a 10");
	int num;
	num=Integer.parseInt(bfr.readLine());
	
	switch(num) {
	case 0:
		System.out.println("Zero");
		break;
	
	case 1:
		System.out.println("Um");
		break;
	case 2:
		System.out.println("Dois");
		break;
	case 3:
		System.out.println("Três");
		break;
	case 4:
		System.out.println("Quatro");
		break;
	case 5:
		System.out.println("Cinco");
		break;
	case 6:
		System.out.println("Seis");
		break;
	case 7:
		System.out.println("Sete");
		break;
	case 8:
		System.out.println("Oito");
		break;
	case 9:
		System.out.println("Nove");
		break;
	case 10:
		System.out.println("Dez");
		break;
	
	default :
		System.out.println("Numero invalido!");
	}
bfr.close();
}

}
