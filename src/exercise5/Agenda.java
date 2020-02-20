package exercise5;

import java.util.Iterator;



import java.util.HashMap;

public class Agenda {

	HashMap<String,int[]> phoneNumbers;
	
	
	int maximum;
	
	Agenda(int max){
		this.maximum=max;
		phoneNumbers=new HashMap<String, int[]>();
		
	
	}
	private void printArray(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			if(i!=array.length-1) {
				System.out.print(array[i] +  " - ");
			}
			else {
				System.out.print(array[i]);
			}
		}
	}
	
	public void addEntry(String name, int[] array) {
		
		if(phoneNumbers.containsKey(name)== false && (phoneNumbers.size() < maximum)) {
			
			
			phoneNumbers.put(name, array);
			System.out.println("Added to the agenda");
		}
		else if(phoneNumbers.containsKey(name)) {
			System.out.println("Your Agenda contains these phone number for" + name + " "  );
			printArray(array);
			System.out.println("Do you want to replace the numbers of that person? 1 yes else no");
			int decision=Console.readInt();
			if(decision==1) {
				phoneNumbers.put(name, array);
			}
			else {
				System.out.println("You dont want to replace");
			}
		}	else if(phoneNumbers.size()==maximum) {
			
			System.out.println("Full Agenda");
		}
		
		
		
	
}
	
public void display() {
	Iterator<String> it = phoneNumbers.keySet().iterator();
	System.out.print("[");
	while(it.hasNext()) {
		String keyValue = it.next();
		System.out.print(keyValue + " = ");
		printArray(phoneNumbers.get(keyValue));
	}
	
	System.out.println("] ");
	}
	
	
	
	String searchName(String name) {
		
		
		return "";
	}
	
	
	
}

