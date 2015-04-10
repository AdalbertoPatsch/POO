package encapsulamento;

public class NotaFiscal {

	private int numero;
	private Data data;

	private Vendedor vendedor;
	private Produto[] produtos; // 3 no maximo

	public NotaFiscal(int numero, Data data, Vendedor vendedor) {
		produtos = new Produto[3];
		this.numero = numero;
		this.data = data;
		this.vendedor = vendedor;
	}
	
	

	public boolean adicionarProdutos(Produto produto) {

		int posicao = existeEspacoNoVetor();

		if (posicao != -1) {

			if (produtoJaExiste(produto) == false) {

				produtos[posicao] = produto;
				return true;
			}
		}
		return false;

	}
	private int existeEspacoNoVetor() {

		for (int i = 0; i < 3; i++) {
			if (produtos[i] == null)
				return i;
		}
		// caso não exista espaço livre
		return -1;
	}

	
	
	
	
	private boolean produtoJaExiste(Produto produto) {
		Produto temporario = null;
		for (int i = 0; i < 3; i++) {
			temporario = produtos[i];
			if (temporario != null)
				if (temporario.getCodigo() == produto.getCodigo())
					return true;
		}
		return false;
	}

	public double calculaTotalNotaFiscal() {
		double soma = 0;
		for (int i = 0; i < 3; i++)
			soma = soma + produtos[i].getPreco();
		return soma;
	}



	public Data getData() {
		return data;
	}



	public void setData(Data data) {
		this.data = data;
	}



	public Vendedor getVendedor() {
		return vendedor;
	}



	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}



	public int getNumero() {
		return numero;
	}



	public Produto[] getProdutos() {
		return produtos;
	}

	
	
}
