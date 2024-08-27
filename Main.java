// Menu de Lista Encadeada
public class Main {
    public static void main(String[] args) {
        Lista_Encadeada lista_Encadeada = new Lista_Encadeada();

        lista_Encadeada.append(10);
        lista_Encadeada.append(20);
        lista_Encadeada.append(30);
        lista_Encadeada.printalista_encadeada();

        lista_Encadeada.remove(20);
        lista_Encadeada.printalista_encadeada();
    }
}
