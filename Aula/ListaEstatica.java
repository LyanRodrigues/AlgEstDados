package Aula;

public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        this.info = new int[10];
        this.tamanho = 0;
    }

    private void redimensionar(){
        int[] novoVetor = new int[info.length + 10];
        for(int i = 0; i < info.length; i++){
            novoVetor[i] = info[i];
        }
        info = novoVetor;
    }

    public void inserir(int valor){
        if(tamanho == info.length){
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(){
        for (int i = 0; i < tamanho; i++){
            System.out.println(info[i]);
        }
    }

    public int buscar(int valor){
        for (int i = 0; i < tamanho; i++){
            if (info[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor){
        for (int i = 0; i < tamanho; i++) {
            if (valor == info[i]) {
                for (int x = i; x < tamanho - 1; x++) {
                    info[x] = info[x + 1];
                }
                tamanho--;
                break; // Exit after removing the element
            }
        }
    }

    public void liberar(){
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao){
        if(posicao >= 0 && posicao < tamanho){
            return info[posicao];
        }
        throw new IndexOutOfBoundsException("Posição inválida!");
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
