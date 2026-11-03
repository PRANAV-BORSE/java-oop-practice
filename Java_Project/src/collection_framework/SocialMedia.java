package collection_framework;


public class SocialMedia implements Comparable<SocialMedia>{
	private String name;
	private int popularity;
	
	
	public SocialMedia() {
		name = "Instagram";
		popularity = 10;
	}


	public SocialMedia(String name, int popularity) {
		this.name = name;
		this.popularity = popularity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPopularity() {
		return popularity;
	}


	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}


	@Override
	public String toString() {
		return "SocialMedia [name=" + name + ", popularity=" + popularity + "]";
	}


	@Override
	public int compareTo(SocialMedia media2) {
		
		// DEFAULT SORTING ALGORITHM => Name wise Descending
		String firstName = name;     //String firstName = this.name
		String SecondName = media2.name;
		int comparison = SecondName.compareTo(firstName);
		return comparison;
	}
	
	
}
