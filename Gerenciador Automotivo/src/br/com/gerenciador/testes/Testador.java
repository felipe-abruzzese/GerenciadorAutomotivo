package br.com.gerenciador.testes;

import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.gerenciador.Data;
import br.com.gerenciador.Gasolina;

public class Testador {

	public static void main(String[] args) throws ParseException {

		//Data data1 = new Data(3, 3, 2003);
		//Data data2 = new Data(29, 2, 2999);
		//Data data3 = new Data(1, 13, 1);

		Gasolina gasolina = new Gasolina(441, 164, 48, 30, 3, 2017);

		System.out.println(gasolina.imprimeECalcula() + " " + gasolina.formata());
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		Date d1 = df.parse("07/09/1822");
		System.out.println(d1);
		Date d2 = df.parse("05/06/2006");
		System.out.println(d2);
		long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
		System.out.println(dt / 86400000L); // passaram-se 67111 dias
	}
}
