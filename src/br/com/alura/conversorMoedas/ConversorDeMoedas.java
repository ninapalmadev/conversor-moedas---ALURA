package br.com.alura.conversorMoedas;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {

	ConverterMoedasParaReal real = new ConverterMoedasParaReal();
	ConverterParaMoedas moeda = new ConverterParaMoedas();

	public void converterMoedas(double valorRecebido) {

		String option = JOptionPane.showInputDialog(null, "Escolha a opção que deseja converter ", "Moedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Reais para Dólares", "De Reais para Euros", "De Reais para Libras",
						"De Reais para Peso Argentino", "De Reais pra Peso Chileno", "De Dólares para Reais",
						"De Euros para Reais", "De Libras pra Reais", "De Peso Argentino pra Reais",
						"De Peso Chileno pra Reais" },
				"Escolha").toString();

		switch (option) {
		case "De Reais para Dólares":
			moeda.converterReaisParaDolar(valorRecebido);
			break;
		case "De Reais para Euros":
			moeda.converterReaisParaEuro(valorRecebido);
			break;
		case "De Reais para Libras":
			moeda.converterReaisParaLibraEsterlina(valorRecebido);
			break;
		case "De Reais para Peso Argentino":
			moeda.converterReaisParaPesoArgentino(valorRecebido);
			break;
		case "De Reais para Peso Chileno":
			moeda.converterReaisParaPesoChileno(valorRecebido);
			break;
		case "De Dólares para Reais":
			real.converterDolaresParaReais(valorRecebido);
			break;
		case "De Euros para Reais":
			real.converterEurosParaReais(valorRecebido);
			break;
		case "De Libras para Reais":
			real.converterLibrasParaReais(valorRecebido);
			break;
		case "De Peso Argentino para Reais":
			real.converterPesosArgentinosParaReais(valorRecebido);
			break;
		case "De Peso Chileno para Reais":
			real.converterPesosChilenosParaReais(valorRecebido);
			break;
		}
	}
}
