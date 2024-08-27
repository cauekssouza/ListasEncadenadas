public class Lista_DuplaEncadeada {
    // Atributos
    private Node2 cabecaNode2;
    private int tamanho;

    // Construtor
    public Lista_DuplaEncadeada() {
        this.cabecaNode2 = null;
        this.tamanho = 0;
    }

    // Método append para adicionar
    public void append(int dado) {
        if (cabecaNode2 == null) {
            cabecaNode2 = new Node2(dado);
        } else {
            Node2 atual = cabecaNode2;
            while (atual.proximo2 != null) {
                atual = atual.proximo2;
            }
            Node2 novoNode = new Node2(dado);
            atual.proximo2 = novoNode;
            novoNode.previsao = atual;
        }
        tamanho++;
    }

    // Imprime na ordem normal
    public void imprime() {
        Node2 atual = cabecaNode2;
        while (atual != null) {
            System.out.print(atual.dado + " <-> ");
            atual = atual.proximo2;
        }
        System.out.println("Null");
    }

    // Imprime na ordem reversa
    public void imprimeReverso() {
        if (cabecaNode2 == null) {
            return;
        }
        Node2 atual = cabecaNode2;
        while (atual.proximo2 != null) {
            atual = atual.proximo2;
        }
        while (atual != null) {
            System.out.print(atual.dado + " <-> ");
            atual = atual.previsao;
        }
        System.out.println("Null");
    }

    // Método de remover
    public void remover(int dado) {
        if (cabecaNode2 == null) {
            return; 
        }

        // Remover a cabeça da lista, se for o caso
        if (cabecaNode2.dado == dado) {
            cabecaNode2 = cabecaNode2.proximo2;
            if (cabecaNode2 != null) {
                cabecaNode2.previsao = null;
            }
            tamanho--;
            return;
        }

        // Percorre a lista procurando o nó com o dado a ser removido
        Node2 atual = cabecaNode2;
        while (atual != null && atual.dado != dado) {
            atual = atual.proximo2;
        }

        // Se o nó foi encontrado, atualiza os ponteiros
        if (atual != null) {
            if (atual.proximo2 != null) {
                atual.proximo2.previsao = atual.previsao;
            }
            if (atual.previsao != null) {
                atual.previsao.proximo2 = atual.proximo2;
            }
            tamanho--;
        }
    }

    // Método para obter o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
}
