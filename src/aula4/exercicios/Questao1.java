package aula4.exercicios;

public class Questao1 {
	public static void main(String [] args) {
		int [] array = 
			{ 1 , 2 , 3, 4, 5, 6, 7, 8, 9, 10, 11,
			12, 13, 14, 15, 16, 17, 18, 19, 20};
		arrayInverter(array);
		arrayPrint(array);
		
	}
	private static void arrayInverter(int [] vetor) {
             boolean troca = true;
             int aux;
             while (troca) {
                 troca = false;
                 for (int i = 0; i < vetor.length - 1; i++) {
                     if (vetor[i] < vetor[i + 1]) {
                         aux = vetor[i];
                         vetor[i] = vetor[i + 1];
                         vetor[i + 1] = aux;
                         troca = true;
                     }
                 }
             }
    }
	public static void arrayPrint(int [] array) {
		for(int i = 0; i < 20 ; i++) {
			System.out.println( i + " -> " + array[i]);
		}
	}
}
