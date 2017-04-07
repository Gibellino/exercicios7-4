package exercises;

import java.util.Random;
import java.util.Scanner;

public class Exe8 {

	public int rand(){
		Random r = new Random();
		int n = r.nextInt(10-0) + 0;
		return n;
	}
	
	public void exe8(){
		
		Scanner read = new Scanner(System.in);
		
		int jog=0;
		int n = rand();
		
		do{
			
			int n2=0;
			char c;
				
			System.out.printf("O numero é " + n + ". O numero seguinte é maior(c) ou menor(b): ");
			c = read.next().charAt(0);

			
			if(c == 'c' || c == 'C'){
				if((n2=rand()) > n){
					System.out.println("\nParabens acertou!\n");
					n = n2;
					jog++;
				}
				else{
					System.out.println("\nErrou, o numero era " + n + ". Acertou " + jog + " vezes.");
					break;
				}
			}
			else{
				if((n2=rand()) < n){
					System.out.println("\nParabens acertou!\n");
					n = n2;
					jog++;
				}
				else{
					System.out.println("\nErrou, o numero era " + n + ". Acertou " + jog + " vezes.");
					break;
				}
			}
			
			
		}while(true);
		
	}
}
