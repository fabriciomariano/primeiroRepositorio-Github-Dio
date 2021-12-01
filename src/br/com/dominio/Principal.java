package br.com.dominio;

public class Principal {
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.tamanho(10);
		fila.enfileirar(5);
		fila.enfileirar(3);
		fila.desenfilheirar();
		fila.enfileirar(7);
		fila.desenfilheirar();
		fila.desenfilheirar();
		fila.enfileirar(9);
		fila.enfileirar(7);
		fila.enfileirar(3);
		fila.enfileirar(5);
		fila.desenfilheirar();
		
		fila.imprimir();
	}

}
