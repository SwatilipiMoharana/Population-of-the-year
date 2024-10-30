package swatitest;
import java.util.*;
public class Population {
 private float p;
 private float r;
 Population(float a,float b){
	 this.p=a;
	 this.r=b;
 }
 public void print() {
	
	 for(int year= 2010;year<=2020;year++)
	 {
		  p=p*(1+r/100);
	 }
	 System.out.println("population of each year is"+p);
 }
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the population of the year:");
		float p=Sc.nextFloat();
		System.out.println("the growth rate is :");
	    float r=Sc.nextFloat();
	    
	    Population P1=new Population(p,r);
	    P1.print();
	    
	}

}
