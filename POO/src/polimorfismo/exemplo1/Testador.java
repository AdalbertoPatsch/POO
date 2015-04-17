package polimorfismo.exemplo1;

public class Testador {

	public static void main(String[] args) {
		
		FuncionarioHorista fh = new FuncionarioHorista(1,"Juquinha",160,20);
		fh.calcularSalario();
		System.out.println(fh.toString());
		
		
		FuncionarioComissionado fc = new FuncionarioComissionado(2,"Anne", 2000,145);
		fc.calcularSalario();
		System.out.println(fc);
		
		
		FuncionarioNormal fn = new FuncionarioNormal(3,"Juliana",4500);
		fn.calcularSalario();
		System.out.println(fn);
		
	}

}
