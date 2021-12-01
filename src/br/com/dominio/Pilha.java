package br.com.dominio;

import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		
		//Ser� criado uma representa��o da Pilha utilizando a classe stack
		Stack<String> pilha = new Stack<>();//Objeto do tipo stack que armazena string
		System.out.println("Inicio do passeio............ " + pilha);
		pilha.push("Casa");
		pilha.push("Cinema");
		pilha.push("Oficina Mec�nica");
		System.out.println("Local onde deixou a carteira: " + pilha);
		pilha.push("Zool�gico");
		pilha.push("Museu");
		pilha.push("Parque");
		pilha.push("Sorveteria");
		System.out.println("Fim do passeio........... " + pilha);
		System.out.println("..........................................");
		System.out.println("Inicio do caminho inverso........: " + pilha);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Local onde deixou a carteira: " + pilha);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Fim do caminho inverso.....: " + pilha);
	}

}
