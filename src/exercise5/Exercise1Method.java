package exercise5;

import java.util.*;
import java.lang.Math; 
public class Exercise1Method {

	ArrayList<Integer> numbers;
	
	Exercise1Method(int n){
		
		numbers = new ArrayList();
		
		//found(n);
	}
	void found(int n) {
		int counter=1;
		int found =0;
		while(found<10&&counter<=n/2) {			
			if(n%counter==0) {
				numbers.add(counter);
				found++;
			}
			counter++;	
		}
	}
	void display() {
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			int str = it.next();
			System.out.println(str);
			
		}
	}
	
	int randomWithRange(int min, int max){
		   int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
		}
	void loadsRandom() {
		
		
		
		for(int i =0; i<20;i++) {
			int random =randomWithRange(-100,100);
			numbers.add(random);
		}
		
		
		
		
	}
	void clear() {
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
	}
	
}
