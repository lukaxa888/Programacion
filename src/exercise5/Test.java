package exercise5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Movie m1 = new Movie("Parasite",136, 2019);
		
		Cinema trueba = new Cinema(5,"Trueba");
		
		trueba.addMovie(m1);
		
	
		
		System.out.println(trueba.roomOfMovie("Parasite",136, 2019));
		
		
	}

}
