package Aula.Questao1;

public class ListaEstatica {
    private Object[] info;
    private int tamanho;

    public ListaEstatica() {
        this.info = new Object[10];
        this.tamanho = 0;
    }

    private void redimensionar(){
        Object[] novoVetor = new Object[info.length + 10];
        for(int i = 0; i < info.length; i++){
            novoVetor[i] = info[i];
        }
        info = novoVetor;
    }

    public void inserir(Object valor){
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

    public int buscar(Object valor){
        for (int i = 0; i < tamanho; i++){
            if (info[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public void retirar(Object valor){
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
        info = new Object[10];
        tamanho = 0;
    }

    public Object obterElemento(int posicao){
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
        String res = " ";
        for (int i = 0; i<tamanho;i++){
            if(i>0){
                res += ",";
            }
            res = res + info[i].toString();
        }
        return res;
    }
}
