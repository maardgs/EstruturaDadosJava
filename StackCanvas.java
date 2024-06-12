package listasCanvas;

import java.util.Scanner;
import java.util.Stack;

public class StackCanvas {

	public static void main(String[] args) {
		// Exercício 2 - Collection stack
		
		
		Stack<String> livros = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != 0) { 
			System.out.println("Menu: "
					+"\n 1 - Adicionar livro na pilha"
					+"\n 2 - Listar todos os livros"
					+"\n 3 - Retirar livro da pilha"
					+"\n 0 - Sair"
					+"\n ________________________________");
			
			
			System.out.println("Entre com a opção desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite o nome do livro: ");
				sc.skip("\\R?");
				String listaLivrosA = sc.nextLine();
				livros.add(listaLivrosA);
				System.out.println("Livro adicionado a pilha! ");
				break;
				
			case 2:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("A pilha de livros está vazia!\n");
					for(String listaLivrosB : livros) {
						System.out.println(listaLivrosB + "\n");
					}
				}
			break;
				
			case 3: 	
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Pilha: ");
					livros.pop();
					for (String listaLivrosB : livros) {
						System.out.println(listaLivrosB + "\n");
					}
					System.out.println("Um livro foi retirado da pilha!");
					}
				break;
		
			
			case 0: 
				System.out.println("Programa finalizado com sucesso!"); 
				break;
			
			default: 
				System.out.println("Opção inválida, tente novamente!");
				
			}
		}
		
		sc.close();
		
	}
}