package enumeracao;

public class Testador {

	public static void main(String[] args) {
		TorcedorDoSaoPaulo tdsp = new TorcedorDoSaoPaulo();
		tdsp.setNome("Marcos");
		tdsp.setSexo(Sexo.FEMININO);
		
		System.out.println(tdsp.getSexo());

	}

}
