public class Main {
	public static void main(String[] args) throws EPilhaVazia {
		final int CONST = 1000;
		final int QTD = 1000;

		PilhaArray pilha = new PilhaArray(1, 0);

		
		for (int i = 0; i < QTD; i++) {
			pilha.push(i);
		}

		pilha.empty();
		pilha.show();					
	}
}