package exercises;

import java.util.Random;

public class Exe3 {

	Random r = new Random();
	
	public int rand(){
		
		int n = r.nextInt(9-1) + 1;
		return n;
	}
	
	public void exe3(){
		
		int numero=0;
		int[] n = new int[9];
		
		for(int i=0; i<20; i++){
			
			switch(numero=rand()){
			
			case 1: n[0]++; break;
			case 2: n[1]++; break; 
			case 3: n[2]++; break; 
			case 4: n[3]++; break;  
			case 5: n[4]++; break;  
			case 6: n[5]++; break; 
			case 7: n[6]++; break;  
			case 8: n[7]++; break;  
			case 9: n[8]++; break; 
			
			}
			
		}
		
		for(int i=0; i<9; i++){
			System.out.printf(" " + (i+1) + " - " + n[i]+ ";\n");
		}
	}
}
