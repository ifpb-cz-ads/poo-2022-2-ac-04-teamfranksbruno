package teclado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeTeclado {
public static void main(String[] args) throws IOException {
	
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	String palavra1 ="";
	String palavra2 ="";
	String palavra3 ="";
	String palavra4 ="";
	String palavra5 ="";
	
	System.out.println("Digite cinco palavras para completar uma frase");
	
	int i = 0;
	while(i==0) {
		palavra1= bfr.readLine();
		palavra2= bfr.readLine();
		palavra3=bfr.readLine();
		palavra4=bfr.readLine();
		palavra5=bfr.readLine();
		i++;
	}
	

	System.out.println("As palavras digitadas foram: " + palavra1+ " " + palavra2 + " " + palavra3+ " " + palavra4 +" " + palavra5);
	bfr.close();
}
}
