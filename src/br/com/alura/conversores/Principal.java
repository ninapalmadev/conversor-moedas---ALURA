package br.com.alura.conversores;

import javax.swing.JOptionPane;

import br.com.alura.conversorMedida.ConversorDeMedidas;
import br.com.alura.conversorMoedas.ConversorDeMoedas;
import br.com.alura.conversorTemperatura.TemperaturaPrincipal;

public class Principal {
	public static void main(String[] args) {
		ConversorDeMoedas moedas = new ConversorDeMoedas();
		TemperaturaPrincipal temperatura = new TemperaturaPrincipal();
		ConversorDeMedidas medidas = new ConversorDeMedidas();

		while (true) {

			String options = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE,
					null, new Object[] { "Conversor de Moedas", "Conversor de Temperatura", "Conversor de Medidas" },
					"Escolha").toString();

			switch (options) {
			case "Conversor de Moedas":
				String input = JOptionPane.showInputDialog("Insira um valor: ");

				if (checkout(input)) {
					double valorRecebido = Double.parseDouble(input);
					moedas.converterMoedas(valorRecebido);

					int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

					if (JOptionPane.OK_OPTION == resposta) {
						moedas.converterMoedas(valorRecebido);
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Insira um valor de temperatura para converter");
				if (checkout(input)) {
					double valorRecebido = Double.parseDouble(input);
					temperatura.converterTemperatura(valorRecebido);

					int resposta = 0;

					resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if ((resposta == 0) && (checkout(input))) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			case "Conversor de Medidas":
				input = JOptionPane.showInputDialog("Insira um valor: ");
				if (checkout(input)) {
					double valorRecebido = Double.parseDouble(input);
					medidas.converterMedidas(valorRecebido);
					
					int resposta = 0;

					resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if ((resposta == 0) && (checkout(input))) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
			}
		}
	}


	public static boolean checkout(String input) {
		try {
			double value = Double.parseDouble(input);
			if (value >= 0 || value < 0)
				;
			return true;
		} catch (NumberFormatException exc) {
			return false;
		}
	}
}
