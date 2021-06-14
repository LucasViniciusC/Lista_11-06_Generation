
public class Produtos{
	
	private String nomeProduto;
	private String categoriaProduto;
	private int qtdProdutos;
	
	public Produtos(String nomeProduto, String categoriaProduto, int qtdProdutos) {
		super();
		this.nomeProduto = nomeProduto;
		this.categoriaProduto = categoriaProduto;
		this.qtdProdutos = qtdProdutos;
	}

	public String toString(){
		return " " + this.nomeProduto + " CATEGORIA: " + this.categoriaProduto + " QUANTIDADE EM ESTOQUE: " + this.qtdProdutos;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public int getQtdProdutos() {
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
}
