package encapsulamento;

public class Data {

	private int dia, mes, ano;

	public int getDia() {
		return dia;
	}

	
	
	public Data(int dia, int mes, int ano) {
		
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}



	public void setDia(int dia) {

		if (dia > 0 && dia <= 31)
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {

		if (mes > 0 && mes < 13)
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano >= 1900 && ano <= 2100)
			this.ano = ano;
	}



	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	

}
