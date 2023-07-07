package cofrinho;

import java.util.Scanner;

public class Main extends Cofrinho{
	public static double moeda;
	public static int opcao;
	public static int opMoeda;
	//Função principal
	public static void main(String[] args) {
		System.out.println("Seja bem vindo ao cofrinho");
		menu();
		return;
	}
	
	public static void menu() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Selecione umas das opção abaixo");
		//Menu inicial
		System.out.println("1 - Adicionar moeda \n2 - Listar moeda(s) \n3 - Remover moedas \n4 - Converter para real \n5 - Sair");
		
		opcao = teclado.nextInt();
		//Qual moeda vai ser adicionada
		if(opcao == 1) {
			System.out.println("Selecione a apção numérica da moeda que deseja inserir");
			System.out.println("1 - Real \n2 - Dolar \n3 - Euro \n4 - Voltar");
			opMoeda = teclado.nextInt();
			
			System.out.println("Digite o valor:");
			moeda = teclado.nextDouble();
			if(opMoeda == 1) {
				adicionar(moeda,"real");
				menu();
			}
			if(opMoeda == 2) {
				adicionar(moeda,"dolar");
				menu();
			}
			if(opMoeda == 3) {
				adicionar(moeda,"euro");
				menu();
			}
		}
		//Lista as moedas
		if(opcao == 2) {
			System.out.println("Moedas adicionadas ao cofrinho");
			listar();
			menu();
		}
		//Remover uma moeda
		if(opcao == 3) {
			System.out.println("Selecione qual moeda deseja remover");
			listar();
			opcao = teclado.nextInt();
			remover(opcao);
			menu();
		}
		//Converter valor total
		if(opcao == 4) {
			conveter();
			menu();
		}
		//Sair
		if(opcao == 5) {
			System.out.println("Até mais!");
			System.exit(0);
			
		}
		//Caso usuario insira um numero invalido
		else {
			System.out.println("Opção invalida! tente novamente\n");
			menu();
		}
	}
}
