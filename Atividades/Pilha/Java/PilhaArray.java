public class PilhaArray implements IPilha{
	// Armazena elementos da pilha
	private Object Elementos[];
	// Indice do elemento no topo
	private int index = -1;

	public PilhaArray(int tamanho) {
		Elementos = new Object[tamanho];
	}

	public int size() {
		return (index+1);
	}

	public boolean isEmpty() {
		return (index == -1);
	}

	public Object top() {
		if (isEmpty()) {
			return index;
		} else {
			return Elementos[index];
		}
	}

	public void push(Object obj) {
		if(index == Elementos.length-1) {
			System.out.println("Pilha cheia!\nDobrando o tamanho...");
			
			Object ElementosAux[] = Elementos;
			Elementos = new Object[index*2];
			
			for (int i = 0; i <= index; i++) {
				Elementos[i] = ElementosAux[i];
			}
		}

		Elementos[++index] = obj;
	}

	public Object pop() {
		if (isEmpty()) {
			return index;
		} else {
			Object temp = Elementos[index];
			Elementos[index] = null;
			index -= 1;
			return temp;				
		}
	}

	public void show() {
		for (int i = 0; i <= index; i++) {
			System.out.println(Elementos[i]);
		}
	}
}