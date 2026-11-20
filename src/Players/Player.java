package Players;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int age;
	private String position;
	private List<String> sponsers;

	public Player(String name, int age, String position) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.sponsers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}

	public List<String> getSponsers() {
		return sponsers;
	}

	public void addSponsers(String sponser) {
		sponsers.add(sponser);
	}

}
