package br.com.alura.conversorMoedas;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {
	public static void main(String[] args) {

		while (true) {
			String options = JOptionPane.showInputDialog(null, "Escolha a opção que deseja converter ", "Moedas",
					JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "De Reais para Dólares", "De Reais para Euros", "De Reais para Libras",
							"De Reais para Peso Argentino", "De Reais pra Peso Chileno", "De Dólares para Reais",
							"De Euros para Reais", "De Libras pra Reais", "De Peso Argentino pra Reais",
							"De Peso Chileno pra Reais" },
					"Escolha").toString();
			switch (options) {
			case "De Reais para Dólares":
				converter.ConverterReaisParaDolar(valorRecebido);
				break;
			}

		}

	}
}
