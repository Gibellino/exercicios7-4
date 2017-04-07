package exercises;

import java.util.Scanner;

public class Exe10 {

	public void exe10(){
		
		Scanner read = new Scanner(System.in);

		System.out.printf("Digite um numero: ");
		int n = read.nextInt();
		
		do{
			System.out.print("\nDigite um numero, Zero(0) para sair: ");
			int n2 = read.nextInt();
			
			if(n2 == 0){
				break;
			}
			
			System.out.printf("\nDigite uma operação (+, -, *, /) ou Zero(0) para sair: ");
			char op = read.next().charAt(0);
			
			if(op == '0'){
				break;
			}
			
			System.out.printf("\n " + n + " " + op + " " + n2 + " = ");
			
			switch(op){
			
			case '+': n+=n2; break;
			case '-': n-=n2; break;
			case '*': n*=n2; break;
			case '/': n/=n2; break;
			
			default: System.out.println("\nOpção Inválida!");
			
			}
			
			System.out.print(n + "\n");
			
		}while(true);
	}
	
}
