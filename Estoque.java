import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		int operacao = 0;
		int posicao = 0;
		String escolha;

		Scanner entrada = new Scanner(System.in);

		ArrayList<Produtos> produtos = new ArrayList<>();

		do {

			System.out.println("INFORME UMA OPÇÃO: (1)-ADICIONAR UM PRODUTO (2)-LISTAR PRODUTOS (3)-REMOVER PRODUTO");
			operacao = entrada.nextInt();

			if (operacao == 1) {

				do {
					for (int i = 0; i <= produtos.size(); i++) {
						System.out.println("Informe o nome do produto: ");
						String nomeProduto = entrada.nextLine();
						nomeProduto = entrada.nextLine();

						System.out.println("Informe a categoria do seu produto: ");
						String categoriaProduto = entrada.next();

						System.out.println("Informe a quantidade em estoque: ");
						int qtdProdutos = entrada.nextInt();

						produtos.add(new Produtos(nomeProduto, categoriaProduto, qtdProdutos));

						System.out.println(
								"INFORME UMA OPÇÃO: (1)-ADICIONAR UM PRODUTO (2)-LISTAR PRODUTOS (3)-REMOVER PRODUTO");
						operacao = entrada.nextInt();
						if (operacao == 2 || operacao == 3) {
							break;
						}
					}
				} while (operacao == 1);
			}

			if (operacao == 2) {
				for (Produtos i : produtos) {
					posicao += produtos.indexOf(produtos) + 1;
					System.out.println(i);
					System.out.println(produtos.indexOf(i));
					posicao++;
				}
			}

			if (operacao == 3) {

				for (Produtos i : produtos) {
					posicao += produtos.indexOf(produtos) + 1;
					System.out.println(
							"---------------------------------------------------------------------------------------------");
					System.out.println(
							"|*|       PRODUTOS       |*|  |*|       CATEGORIA       |*|  |*|       QUANTIDADE EM ESTOQUE |*| ");
					System.out.println(
							"---------------------------------------------------------------------------------------------");

					System.out.print(posicao + " º" + "       " + i.getNomeProduto() + "         | |");
					System.out.print("  | | " + "       " + i.getCategoriaProduto() + "    " + "      | |");
					System.out.print("                " + i.getQtdProdutos() + "            ");
					System.out.print("| |");
					System.out.println("\n----------------------------------------------------------------------");
					posicao ++;
				}
				System.out.println("Informe o número do produto que deseja remover!\n");
				posicao = entrada.nextInt();
				System.out.println("DIGITE A POSICAO");
				System.out.println("TEM CERTEZA QUE DESEJA EXCLUIR O PRODUTO:" + produtos.get(posicao));
				int excluir = entrada.nextInt();
				produtos.remove(excluir);

				
				for (Produtos i : produtos) {
					posicao += produtos.indexOf(produtos) + 1;
					System.out.println(produtos.indexOf(posicao));
					posicao++;
				}
			}

			

			System.out.println("Digite 0 para iniciar novamente");
		} while (operacao != 0);
		entrada.close();
	}

}
