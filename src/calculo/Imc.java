package calculo;

import java.util.Scanner;

public class Imc {
	
	public int peso, altura, resultado;
	public String status;
	Scanner leitor = new Scanner(System.in);
	
	public void multiplicar() {
		resultado = altura * altura;
	}
	
	public void dividir() {
		resultado = peso / altura;
		
	}

}
