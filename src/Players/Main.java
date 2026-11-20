package Players;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Player p1 = new Player("Saurabh", 30, "First");
		Player p2 = new Player("Shiv", 28, "Second");
		Player p3 = new Player("Brinda", 12, "Last");
		
		p1.addSponsers("Adidas");
		p1.addSponsers("Nike");
		p2.addSponsers("Nike");
		p3.addSponsers("Puma");

		List<Player> playerList = new ArrayList<>();
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);

		Map<String, List<Player>> playerMap = new HashMap<>();

		for (Player player : playerList) {
			playerMap.putIfAbsent(player.getPosition(), new ArrayList<>());
			playerMap.get(player.getPosition()).add(player);
		}

		for (Map.Entry<String, List<Player>> entry : playerMap.entrySet()) {
			for (Player player : entry.getValue()) {

				if (player.getAge() > 18 && player.getAge() < 35) {
					System.out.println("Position: " + entry.getKey());
					System.out.println("Name: " + player.getName());
					System.out.println("Age: " + player.getAge());
					System.out.println("Sponsers: " + player.getSponsers());
					System.out.println("-----------------------------------");
				}
			}

		}
	}

}
