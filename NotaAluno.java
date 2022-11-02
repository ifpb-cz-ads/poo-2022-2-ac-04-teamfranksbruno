package teclado;

public class NotaAluno {
	private int nota1 =0;
	private int nota2=0;
	private int nota3=0;
	private double media;
	
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	
	public int getNota2() {
		return nota2;
	}
	
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	
	public double getMedia() {
		return media;
	}
	public void setMedia(int nota1, int nota2, int nota3) {
		
		this.media = (nota1+nota2+nota3)/3;
		
	}

}
