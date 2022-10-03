package br.com.alura.conversorMoedas;

import javax.swing.JOptionPane;

public class ConverterParaMoedas {

	public void converterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.26;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $: " + moedaDolar + " Dólares");
		
	}

	public void converterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.16;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $: " + moedaEuro + " Euros");
		
	}

	public void converterReaisParaLibraEsterlina(double valorRecebido) {
		double moedaLibraEsterlina = valorRecebido / 5.83;
		moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibraEsterlina + " Libra Esterlina");
	}

	public void converterReaisParaPesoArgentino(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido / 0.035;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " Pesos Argentinos");
	}

	public void converterReaisParaPesoChileno(double valorRecebido) {
		double moedaPesoChileno = valorRecebido /0.0055;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
	}

}
