package teclado;

public class Num_pares {
public static void main(String[] args) {
	int numpar=2;
	for(int i=0; i<=100; i++) {
		if(i%numpar==0) {
			System.out.println(i);
		}
	}
}
}
