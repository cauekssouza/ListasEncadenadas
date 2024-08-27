public class Lista_Encadeada {
    private Node cabeca;

    // Construtor
    public Lista_Encadeada() {
        this.cabeca = null;
    }

    // Método append para acresecntar o dado
    public void append(int dado) {
        if (cabeca == null) {
            cabeca = new Node(dado);
            return;
        }
        Node anterior = cabeca;
        while (anterior.proximo != null) {
            anterior = anterior.proximo;
        }
        anterior.proximo = new Node(dado);
    }

    // Método para imprimir a lista
    public void printalista_encadeada() {
        Node anterior = cabeca;
        while (anterior != null) {
            System.out.print(anterior.dado + " -> ");
            anterior = anterior.proximo;
        }
        System.out.println("Null");
    }

    // Método remover
    public void remove(int dado) {
        if (cabeca == null) return;

        if (cabeca.dado == dado) {
            cabeca = cabeca.proximo;
            return;
        }
        Node anterior = cabeca;
        while (cabeca.proximo != null && cabeca.proximo.dado != dado) {
            anterior = anterior.proximo;
        }
        if (anterior.proximo != null) {
            anterior.proximo = anterior.proximo.proximo;
        }
    }
}
