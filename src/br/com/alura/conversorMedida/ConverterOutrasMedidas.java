package br.com.alura.conversorMedida;

import javax.swing.JOptionPane;

public class ConverterOutrasMedidas {
	
	public void converterMilimetroParaMetro(double valorRecebido) {
		double milimetro = valorRecebido / 1000;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Milimetros(mm) são " + milimetro  + " Metro(m)");        
	}
	public void converterCentimetroParaMetro(double valorRecebido) {
		double centimetro = valorRecebido / 100;
		centimetro = (double) Math.round(centimetro * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Centrímetro(cm) são " + centimetro  + " Metro(m)");     
	}
	public void converterQuilometroParaMetro(double valorRecebido) {
		double quilometro = valorRecebido * 1000;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Quilômetro(km) são " + quilometro  + " Metro(m) ");    
	}
	public void converterPeParaMetro(double valorRecebido) {
		double pes = valorRecebido / 3.281;
		pes = (double) Math.round(pes * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorRecebido + " em Pé(ft) são " + pes  + " Metro(m)");  
	}
}


