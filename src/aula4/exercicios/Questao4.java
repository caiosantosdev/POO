package aula4.exercicios;

public class Questao4 {
	public static void main(String[] args) {
		System.out.println(calcula(2,3));
	}
	public static double calcula(double a, double b) {
		return (a+b) * (a*0.1) + (b*0.9);
	}
}
