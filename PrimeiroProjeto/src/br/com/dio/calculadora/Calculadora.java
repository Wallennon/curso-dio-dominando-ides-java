package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0;
		
		System.out.println("Insira o primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Insira o segundo valor: ");
		b = sc.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		Double divisao = divisao(a,b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtração: " + subtracao);
		System.out.println("multiplicação: " + multiplicacao);
		System.out.println("divisão: " + divisao);
	
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static Double divisao(double a, double b) {
		return (double) (a / b);
	}
	
}
