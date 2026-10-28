
public class CricketPlayer extends Player{
	private int runs;
	private float  battingAvg;
	
	public CricketPlayer() {
		//super();  //This call is implicit
		System.out.println("Inside CricketPlayer()");
	}
public CricketPlayer(String name, int age, int runs, float battingAvg) {  //eclipse source select super to invoked 
		super(name, age);
		this.runs = runs;
		this.battingAvg = battingAvg;
	}
//   Manual typing
//	public CricketPlayer(String nm, int ag, int rn, float ba) {
//		super(ag, nm);    //Invokes Parameterized Constructors of Base Class
//		runs = rn;
//		battingAvg = ba;
//	}
	
	
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public float getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}

}
