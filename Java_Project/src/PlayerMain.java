
public class PlayerMain {

	public static void main(String[] args) {
		CricketPlayer crPlayer = new CricketPlayer();
		crPlayer.setName("Rohit");
		crPlayer.setAge(38);
		crPlayer.setRuns(12345);
		crPlayer.setBattingAvg(41.34f);
		
		System.out.println(crPlayer.getName() + ", " + crPlayer.getAge()+ ", " + crPlayer.getBattingAvg()+ ", " +crPlayer.getRuns());
		System.out.println("======================================");
		
		CricketPlayer crPlayer2 = new CricketPlayer("Virat", 37, 15321, 46.32f);
		//Remaining  code to get and print values.
		crPlayer2.setName("Virat");
		crPlayer2.setAge(37);
		crPlayer2.setRuns(15321);
		crPlayer2.setBattingAvg(46.32f);
	}

}
