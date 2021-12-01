package br.com.dominio;

import java.util.LinkedList;
import java.util.Queue;
// Essa classe executa a Interface Collection Queue
public class Fila2 {
	
	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
		
		for (int i = 0; i < 10; i++)
			fila.add(i);
		System.out.println("Elementos na fila " + fila);
		
		fila.remove();
		System.out.println("Elementos na fila " + fila);
		
	}

}
