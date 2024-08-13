package view;
import controller.ControllerParesVetor;
public class PrincipalParesVetor {
	public static void main (String [] args) {
		
		ControllerParesVetor m = new ControllerParesVetor();
		int [] vet = {1, 2, 3, 4, 5, 6};
		int tamanho = vet.length;
		int resp = m.ParesVetor(vet, tamanho, 0);
		System.out.println ("Esse vetor possui " + resp + " números pares.");
	}

}
