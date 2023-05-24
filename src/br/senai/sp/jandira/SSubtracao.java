package br.senai.sp.jandira;

import java.util.Scanner;

public class SSubtracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		int i = 0;
		int matrizA[] = new int[6];
		int matrizB[] = new int[6];
		int matrizC[] = new int[6];
		
		System.out.println("Olá, bem-vindo a subtração de matrizes!");
		
		i = 0;
		while (i < matrizA.length) {
			System.out.print("Insira os números da matrizA: ");
			matrizA[i] = teclado.nextInt();
			i++;
		}
		
		i = 0;
		while (i < matrizB.length) {
			System.out.print("Agora, insira os números da matrizB: ");
			matrizB[i] = teclado.nextInt();
			i++;
		}
		
		i = 0;
		while (i < matrizC.length) {
			matrizC[i] = matrizA[i] - matrizB[i];
			System.out.println("Esse são os seguintes resultados da subtração entre a matrizA e a matrizB: ");
			System.out.println(matrizA[i] + "-" + matrizB[i] + "=" + matrizC[i]);
			i++;
		}
		

	}

}
