package br.com.gerenciador;
public class Data {

	private int dia;
	private int mes;
	private int ano;
	

	public Data(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	
		if (!isDataViavel(dia, mes, ano)) {
			System.out.println("A data " + formata() + " não existe");
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
		}
		
	}

//	public float nDias() {
		
//	}
	
	public String formata() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	private boolean isDataViavel(int dia, int mes, int ano) {
		if (dia <= 0 || mes <= 0 || mes > 12) {
			return false;
		}

		int ultimoDiaDoMes = 31;

		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			ultimoDiaDoMes = 30;
		} else if (mes == 2) {
			ultimoDiaDoMes = 28;
			if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
				ultimoDiaDoMes = 29;
			}

		}

		if (dia > ultimoDiaDoMes) {
			return false;
		}
		return true;
	}
}