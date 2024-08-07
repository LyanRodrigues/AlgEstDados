package Aula;

public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica(int[] info, int tamanho) {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar(){
        int[] novoVetor = new int[tamanho+10];
        for(int i = 0; i <= tamanho; i++){
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
        
    }

    public int buscar(int valor){
        return valor;
    }

    public void retirar(int valor){

    }

    public void liberar(){

    }

    public int obterElemento(int posicao){
        return posicao;
    }

    public boolean estaVazia(){
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString(){
        return null;
    }
    
}
