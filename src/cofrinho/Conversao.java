package cofrinho;

//Funções para conversão
public class Conversao {
	
	public static double conveterMoeda(double moedas, String tipo) {

		if(tipo == "dolar") {
			Dolar dolar = new Dolar();
			return dolar.conveterReal(moedas);
		}
		if(tipo == "euro") {
			Euro euro = new Euro();
			return euro.conveterReal(moedas);
		}
		return moedas;
	}
}