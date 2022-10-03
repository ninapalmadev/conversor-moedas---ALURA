package br.com.alura.conversorMedida;

import javax.swing.JOptionPane;

public class ConversorDeMetro {
	
public void converterMetroParaMilimetro(double valorRecebido) {
		double milimetro = valorRecebido * 1000;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Metro(m) são " + milimetro  + " Milimetros(mm)");        
	}
	public void converterMetroParaCentimetro(double valorRecebido) {
		double centimetro = valorRecebido * 100;
		centimetro = (double) Math.round(centimetro * 1000d) / 1000;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Metro(m) são " + centimetro  + " Centrímetro(cm)");     
	}
	public void converterMetroParaQuilometro(double valorRecebido) {
		double quilometro = valorRecebido / 1000;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Metro(m) são " + quilometro  + " Quilômetro(km)");    
	}
	public void converterMetroParaPe(double valorRecebido) {
		double pes = valorRecebido * 3.281;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Metro(m) são " + pes  + " Pé(ft)");  
	}
}
