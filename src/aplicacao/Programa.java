package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Insira os lados do triagulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira os lados do triagulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX= x.area();
		
		
		double areaY= y.area();
		
		System.out.printf("Triagulo X area: %.4f%n", areaX);
		System.out.printf("Triagulo Y area: %.4f%n", areaY);
		
		if ( areaX > areaY) {
			System.out.println("A maior area é: X");
		}else {
			System.out.println("A maior area é: y");
		}

		
		sc.close();
	}

}
