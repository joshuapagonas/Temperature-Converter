package termperature;
import java.util.*;
import java.io.*;

public class CelFarKel {
	public static int lowNum;
	public static int highNum;
	
	public static void main(String args[]) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer at lowest ranging from -50 to 0");
		
		lowNum = input.nextInt();
		if(lowNum < -50 || lowNum > 0) {
			throw new IllegalArgumentException("Entered input is invalid."); 
		}
		
		System.out.println("Enter an integer at highest ranging from 1 to 50");
		
		highNum = input.nextInt();
		if(highNum > 50 || highNum < 1) {
			throw new IllegalArgumentException("Entered input is invalid.");
		}
		
		System.out.println("1. Farhenheit. \n2. Celcius \n3. Kelvin.");
		int a = input.nextInt();
		if(a > 3 || a <= 0) {
			throw new IllegalArgumentException("Entered input is invalid.");
		}
		
		else {
			if(a == 1) {
				farenheit();
			}
			else if(a == 2) {
				celsius();
			}
			else {
				kelvin();
			}
		}
	
	}

	public static void farenheit() {
		
		for(int i = lowNum; lowNum <= highNum; lowNum++) {
			double celsius = (lowNum - 32) * ((double)5/(double)9);
			double kelvin = lowNum + 255.372222;
			System.out.println("Farhenheit:" + lowNum + " F " + "Celsius: " + (double)celsius + " C " +" Kelvin: " + kelvin + " K");
			
			}
	}
	
	public static void celsius() {
		for(int i = lowNum; lowNum <= highNum; lowNum++) {
			double farenheit = (lowNum * ((double)9 / (double)5) + 32);
			double kelvin = lowNum + 273.15;
			System.out.println("Celsius:" + lowNum + " C " + "Farenheit: " + (double)farenheit + " F " +" Kelvin: " + kelvin + " K");
			
		}
	}
	
	public static void kelvin() {
		for(int i = lowNum; lowNum <= highNum; lowNum++) {
			double farenheit = lowNum - 459.67;
			double celsius = lowNum - 273.15;
			System.out.println("Kelvin:" + lowNum + " K " + "Farenheit: " + (double)farenheit + " F " +" Celsius: " + celsius + " C");
		}
		
	}
		
}