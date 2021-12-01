package br.com.dominio;

public class Fila {
	
	
	
	private Integer[] elementos; //Essa é uma variável de instância chamada elementos.
	// Essa variável representa um vetor de inteiros para armazenar os valores a serem adicionados e removidos
	
	public void tamanho(int valor) {
		elementos = new Integer[valor]; // Instanciação para definição do tamanho
		
	}
	
	public void enfileirar(int valor) {
		
		int ultimoElemento = 0;
		for(Integer elemento: elementos) {
			if(elemento != null) {
				ultimoElemento++;
			}
		}
		
		elementos[ultimoElemento] = valor;
		
	}
	
	public void desenfilheirar() {
		
		int cont = 0;
		elementos[0] = null;
		Integer[] aux = new Integer[elementos.length];
		for(Integer elemento: elementos) {
			if (elemento != null) {
				aux[cont] = elemento;
				cont++;
			}
		}
		
		elementos = aux;
		
	}
	
	public void imprimir() {
		
		String fila = "[ ";
		//Laço para percorrer o vetor elementos. O atributo length recupera o tamanho do vetor
		for (int i = 0; i < elementos.length; i++) {
			Integer elemento = elementos[i];
			if(elemento != null) {
				fila += elemento;
				fila += " , ";
			}
		}
		
		if (fila.length() > 2) 
			fila = fila.substring(0, fila.lastIndexOf(" , "));
			fila += " ] ";
			System.out.println(fila);
		
	}

}
