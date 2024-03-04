public class ListaEstatica {
	private int[] info;
	private int tamanho;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public ListaEstatica() { //criarLista
		info = new int[10];
		tamanho = 0;
	}
	
	private void redimensionar() { 
		int novoTamanho = tamanho + 10;
		int[] novo = new int[novoTamanho];
		
		for (int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
		
	}
	
	
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		
		info[tamanho] = valor; 
		tamanho++;
	}
	
	public void exibir() {
		for(int i=0;i<info.length;i++){
            System.out.print(info[i]+", ");
        }
	}
	public int buscar(int valor) {
        for (int i=0; i < info.length; i++){
            if(valor == info[i]){
                return i;
            } 
        } 
        return -1;
	}
	public void retirar(int valor) {
		for (int i=0; i < info.length; i++){ //para cada elemento dentro de info
            if(valor == info[i]){ //se o elemento for igual ao valor pesquisado
                for (int x=i; x < info.length-1; x++){ //entao para cada valor posterior se
                    info[i] = info[i+1];           //movera uma casa para a esquerda
                    i++;
                    
                } tamanho--;
            } 
        } 
	}
	public void liberar() {
		for(int i =0; i<info.length;i++){
			info[i]=0;
		}
	}
	public int obterElemento(int posicao) {
		for(int i=0;i<info.length;i++){
			if(info[posicao] == info[i]){
				return info[posicao];
			}
		} throw new ArrayIndexOutOfBoundsException();
	}
	public boolean estaVazia() {
		for(int i =0; i<info.length;i++){
			if(info[i] != 0){
				return false;
			}
		} return true;
	}
	public String toString() {
		String mensagem = "" + info[0];
		for (int i=1; i < info.length; i++){
			if(tamanho != info.length){
				mensagem = mensagem + ",";
			} 
			mensagem = mensagem + info[i];
		} return mensagem;
	}
	public int[] getInfo() {
		return info;
	}
	public void setInfo(int[] info) {
		this.info = info;
	}
}