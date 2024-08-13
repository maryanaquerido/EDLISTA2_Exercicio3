package controller;

public class ControllerParesVetor {
	public ControllerParesVetor() {
		super();
		
	}
	
	public int ParesVetor (int[]vet, int tamanho, int quant) {
		if (tamanho == 0) {
			return quant;
		}
		else {
			if (vet[tamanho-1] % 2 == 0) {
				quant = quant + 1;
		}
			return ParesVetor(vet, tamanho-1, quant);
	}
	}
}

