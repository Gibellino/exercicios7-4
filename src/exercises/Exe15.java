package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe15 {

	Map<String, Integer> hm = new HashMap<String, Integer>();
	
	public void exe15(){
		
		Scanner read = new Scanner(System.in);
		
		String[] dias = {"Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira"};
		
		for(int i=0; i<5; i++){
			System.out.printf("Insira o numero de pasteis de nata vendidos na " + dias[i] + ": ");
			int n = read.nextInt();
			hm.put(dias[i], n);
		}
		
		System.out.println("\nDias da semana por ordem do menos vendido para o mais:\n" + hm.toString());
	}
}
