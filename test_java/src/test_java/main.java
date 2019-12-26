package test_java;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		System.out.printf("Entrez le tag number : ");
		Scanner tag = new Scanner(System.in);
		int tagnumber= tag.nextInt();

		System.out.printf("Entrez la durée en seconde : ");
		Scanner sc = new Scanner(System.in);
		int nbsec= sc.nextInt();
		
		TimeDuration TimeDuration=new TimeDuration(nbsec);
		new TimeDuration(i).toString;
	}

}
