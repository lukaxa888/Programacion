package exercise5;
import java.util.ArrayList;
import java.util.Iterator;
public class Cinema {

	
	private String name;
	
	private ArrayList<Movie> movies;
	private Movie[] occupiedRooms;
	
	public Cinema(int quantity, String name){
		occupiedRooms=new Movie[quantity];
		movies = new ArrayList<Movie>();
		this.name=name;
	}

	
	public int  roomOfMovie(String name,int duration,int year) {
		Movie auxMovie = new Movie(name,duration,year);
	for(int i = 0; i< occupiedRooms.length;i++) {
		
				
			Movie m = occupiedRooms[i];
					
			if(auxMovie.isEqual(m)) {
				return i;
			}
		}
	return -1;
	}
			
	
	void addMovie(Movie film) {
		
		
		int i =0;
		
		while(i<occupiedRooms.length) {
			boolean added = false;
			if(!movies.contains(film)) {
			if(	occupiedRooms[i]==null&&!added) {
				occupiedRooms[i]= film;
				movies.add(film);
				added=true;
			}
			i++;
			}
		}
		
	}
	
	void addMovie(Movie film, int room) {
		if(!movies.contains(film)) {
		if(room>=0 && room <= occupiedRooms.length - 1) {
			occupiedRooms[room] = film;
			movies.add(film);
		}
		}
		/*if(sameMovie&&movies.get(room).) {
			movies.set(room, film);
			}
		*/
		
		
		
	}
			
	public void display() {
		System.out.println(name + "Cinema: ");
		for(int i =0; i<occupiedRooms.length;i++) {
			Movie movie = occupiedRooms[i];
			if(movie!=null) {
				System.out.println(movie.getName() + " " + i);
			}
		}
	}
	
	public void removeMovie(String movieName) {
		
	}
	
	

	}
	
	
	
	
	
	
	

