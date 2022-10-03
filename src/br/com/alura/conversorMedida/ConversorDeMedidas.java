package br.com.alura.conversorMedida;

import javax.swing.JOptionPane;

public class ConversorDeMedidas {

	ConversorDeMetro metro = new ConversorDeMetro();
	ConverterOutrasMedidas medidas = new ConverterOutrasMedidas();

	public void converterMedidas(double valorRecebido) {

		String option = JOptionPane.showInputDialog(null, "Escolha a opção que deseja converter", "Medidas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Metro(m) para Milímetro(mm)", "De Metro(m) para Centímetro(cm)",
						"De Metro(m) para Quilômetro(km)", "De Metro(m) para Pé(ft)", "De Milímetro(mm) para Metro(m)",
						"De Centímetro(mm) para Metro(m)", "De Quilômetro(km) para Metro(m)",
						"De Pé(ft) para Metro(m)" },
				"Escolha").toString();
		switch (option) {
		case "De Metro(m) para Milímetro(mm)":
			metro.converterMetroParaMilimetro(valorRecebido);
			break;
		case "De Metro(m) para Centímetro(cm)":
			metro.converterMetroParaCentimetro(valorRecebido);
			break;
		case "De Metro(m) para Quilômetro(km)":
			metro.converterMetroParaQuilometro(valorRecebido);
			break;
		case "De Metro(m) para Pé(ft)":
			metro.converterMetroParaPe(valorRecebido);
			break;
		case "De Milímetro(mm) para Metro(m)":
			medidas.converterMilimetroParaMetro(valorRecebido);
			break;
		case "De Centímetro(mm) para Metro(m)":
			medidas.converterCentimetroParaMetro(valorRecebido);
			break;
		case "De Quilômetro(km) para Metro(m)":
			medidas.converterQuilometroParaMetro(valorRecebido);
			break;
		case "De Pé(ft) para Metro(m)":
			medidas.converterPeParaMetro(valorRecebido);
			break;
		}
	}

}
