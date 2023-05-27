import java.util.Scanner;

public class Classe1 {
	// sem recursividade.
public static void contador (int inicio, int fim) {
	while (inicio <= fim) {
		System.out.print("Contando... " + inicio + "\n");
		inicio++;
	}
}

//com recursividade.
public static void recursivo (int inicio, int fim) {
	if (inicio<=fim) {
		System.out.print("\nContando... " + inicio);
		recursivo(inicio+1, fim);
	}
}
	public static void main(String[] args) {
		
		contador(0, 5);
		recursivo(1, 5);

	}

}
