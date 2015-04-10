package encapsulamento;

public class Testador {

	public static void main(String[] args) {
		
		Vendedor v = new Vendedor("Ximbinha","8373636");
		
		Produto p1 = new Produto(1, "xicara",4);
		Produto p2 = new Produto(2, "pires",4);
		
		Produto p3 = new Produto(3, "Extintor",90);
		Data d = new Data(27,3,2015);
		
		NotaFiscal nf = new NotaFiscal(1,d,v);
		
		
		
		nf.adicionarProdutos(p1);
		nf.adicionarProdutos(p2);
		nf.adicionarProdutos(p3);
		
		
		
		
		System.out.println(nf.calculaTotalNotaFiscal());
		

	}

}
