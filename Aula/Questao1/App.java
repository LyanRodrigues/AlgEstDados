package Aula.Questao1;

public class App {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        // Use System.out.println to print the result of the toString method
        System.out.println(lista.toString());
    }
}
