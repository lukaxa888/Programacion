package exercise5;

public class AgendaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agenda a1 = new Agenda(2);
		int[] p1 = {12654894, 4154655};
		a1.addEntry("Xabier", p1);	
		a1.display();
	}

}
