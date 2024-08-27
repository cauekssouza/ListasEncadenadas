// Menu para Lista Duplicada Encadeada
public class Main2 {
    public static void main(String[] args) {
        Lista_DuplaEncadeada lista_DuplaEncadeada = new Lista_DuplaEncadeada();

        lista_DuplaEncadeada.append(10);
        lista_DuplaEncadeada.append(20);
        lista_DuplaEncadeada.append(30);
        lista_DuplaEncadeada.append(40);
        lista_DuplaEncadeada.append(50);
        lista_DuplaEncadeada.imprime();

        lista_DuplaEncadeada.remover(20);
        lista_DuplaEncadeada.imprime();

        lista_DuplaEncadeada.imprimeReverso();
    }
}
