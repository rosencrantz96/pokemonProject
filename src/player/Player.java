package player;

public class Player {
	private static Player plaayerName;
	
	private Player() {}
	
	public static synchronized Player getInstance() {
		if (plaayerName == null) {
			plaayerName = new Player();
		}
		return plaayerName;
	} 
	
}
