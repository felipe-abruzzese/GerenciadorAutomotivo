package br.com.gerenciador;

public class Gasolina {

	private float k; // Valor da Kilometragem do veículo
	private float valor; // Valor do preço da gasolina por litro
	private float l; // Quantidade de Litros abastecida

	private int dia;
	private int mes;
	private int ano;
	

	public Gasolina(float k, float valor, float l, int dia, int mes, int ano) {
		
		
		this.k = k;
		this.valor = valor;
		this.l = l;
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

	public String imprimeECalcula() {
		return this.k + " km " + (this.k/this.l) + " km/L " + (this.valor/this.l) + " R$/L " + (this.valor/this.k) + " R$/km ";
	}
	
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
	
	
	public float getK() {
		return k;
	}

	public void setK(float k) {
		this.k = k;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getL() {
		return l;
	}

	public void setL(float l) {
		this.l = l;
	}

}
