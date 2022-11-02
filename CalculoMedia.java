package teclado;
import java.io.*;


public class CalculoMedia {
	public static void main(String[] args) throws IOException {
		NotaAluno aluno = new NotaAluno();
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite suas três notas: ");
		
		int nota1;
		int nota2;
		int nota3;
		
		nota1=Integer.parseInt(bfr.readLine());
		nota2=Integer.parseInt(bfr.readLine());
		nota3=Integer.parseInt(bfr.readLine());
		
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		aluno.setNota3(nota3);
		aluno.setMedia(nota1, nota2, nota3);
		System.out.println("Sua media eh: " + aluno.getMedia());
		if(aluno.getMedia() <=5 ) {
			System.out.println("Reprovado!");
			
		}else {
			System.out.println("Aprovado!");
		}
		bfr.close();
	}
}
