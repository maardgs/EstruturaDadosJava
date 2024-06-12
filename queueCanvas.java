package listasCanvas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueCanvas {

	public static void main(String[] args) {

		// Exercício Collection Queue

		Queue<String> clf = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Menu:" + "\n 1. Adicionar Cliente na Fila" + "\n 2. Listar todos os clientes"
					+ "\n 3. Retirar Cliente da Fila" + "\n 0. Sair" + "\n___________________________________");

			System.out.println("Entre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Adicione o nome do cliente: ");
				sc.skip("\\R?");
				String listaCliente = sc.nextLine();
				clf.add(listaCliente);
				System.out.println("Cliente adicionado a fila!");
				break;

			case 2:
				if (clf.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de clientes na fila: \n");
					for (String listaClienteB : clf) {
						System.out.println(listaClienteB + "\n");
					}
				}
				break;

			case 3:
				if (clf.isEmpty()) {
					System.out.println(" fila está vazia!");
				} else {
					System.out.println("Fila: ");
					clf.poll();
					for (String listaClienteB : clf) {
						System.out.println(listaClienteB + "\n");
					}
					System.out.println("O cliente foi chamado!");

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