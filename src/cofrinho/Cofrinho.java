package cofrinho;

import java.util.ArrayList;
//Principais funções da aplicação
public abstract class Cofrinho extends Conversao{
	public static double totalMoedas;
	public static ArrayList<Double> arrayMoedas = new ArrayList<>();
	public static ArrayList<String> arrayOpMoeda = new ArrayList<>();
	//Add 
	public static void adicionar(double moeda, String tipo) {
		arrayMoedas.add(moeda);
		arrayOpMoeda.add(tipo);
		System.out.println("Moeda adicionada");
		return;
    }
	//Listar
	public static void listar() {
		for (int i = 0; i < arrayMoedas.size(); i++) {
			String result = (i + 1 ) + " - " + arrayOpMoeda.get(i) + " - " +Double.toString(arrayMoedas.get(i));
			System.out.println(result);
        }
		return;
	}
	//Remover
	public static void remover(int opção) {
		System.out.println(opção);
		arrayMoedas.remove(opção - 1);
		arrayOpMoeda.remove(opção - 1);
		return;
	}
	//Conversão total
	public static double conveter() { 

		System.out.println("\nValor Total em real:");
		for (int i = 0; i < arrayMoedas.size(); i++) {
			totalMoedas += conveterMoeda(arrayMoedas.get(i), arrayOpMoeda.get(i));

        }
		System.out.println("\n");
		System.out.println(totalMoedas);
		System.out.println("\n");
		//tive que fazer uma correção pois quando fazia mais de uma conversão o 
		//valor se somava com o da conversão anterior dando um valor mais alto do que deveria
		double correcao = totalMoedas;
		totalMoedas -= correcao;
		return 0;
	}

}