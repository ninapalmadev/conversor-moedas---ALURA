package br.com.alura.conversorMoedas;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {
	public static void main(String[] args) {
		
		FuncaoConverter converter = new FuncaoConverter();

		while (true) {
			String options = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE,
					null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, "Escolha").toString();
			switch (options) {
			
			case "Conversor de Moeda": {
				String input = JOptionPane.showInputDialog("Insira um valor em Reais(R$)");
				double valorRecebido = Double.parseDouble(input);
				converter.ConverterReaisParaDolar(valorRecebido);
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + options);
			}
		}

	}

}
