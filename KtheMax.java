package ushtrimi1;
import java.util.Scanner;
public class KtheMax {
	public static void main(String args[])  
	{  
		int num1, num2, num3;  
		System.out.println("Vendos tre numra: ");  
		Scanner in = new Scanner(System.in); 
		num1=in.nextInt();  
		num2=in.nextInt();  
		num3=in.nextInt();  
	
	if (num1 > num2 && num1 > num3)  
	System.out.println("NUmri me i madh eshte: "+num1);  
	else if (num2 > num1 && num2 > num3)  
	System.out.println("NUmri me i madh eshte: "+num2);  
	else if (num3 > num1 && num3 > num2)  
	System.out.println("NUmri me i madh eshte: "+num3);  
	else  
	System.out.println("numrat jane njesoj.");  
	}  
	

	public static void ktheMAx(String[]args) {
		
		
	}	
	
	}  

