package exercise5;

public class Movie {

	
	private String name;
	private int minutes;
	private int years;
	
	Movie(String name,int minutes,int years){
		this.name=name;
		this.minutes=minutes;
		this.years=years;
		
	}
	
	@Override
	public String toString() {
		
		return name + "" + minutes + "" + years;
	}
	
	

	

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + minutes;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + years;
		return result;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	
	public boolean isEqual(Movie movie) {
		if(movie !=null) {
			if(movie.name.equalsIgnoreCase(name) &&
			(movie.years==years) && 
			(movie.minutes >= minutes - 5 &&movie.minutes <= minutes+5)){
		return true;
			}
		}
	return false;
	}
}
