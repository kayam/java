package learning;

import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		int randomNumber;
		for(int i =0; i< 100; i++) {
			randomNumber = (int)(Math.random()*10);
			System.out.println(randomNumber);
		}
		
		System.out.println("und so");
		Random r = new Random();
		for(int i =0; i< 100; i++) {
			randomNumber = r.nextInt(11);
			System.out.println(randomNumber);
		}
		
		


	}

}
