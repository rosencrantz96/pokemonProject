package player;

import java.util.Scanner;

public class Player {
	private static Player playerName;
	private static Scanner scanner = new Scanner(System.in);

	private Player() {
	}

	// 싱글톤 구현
	public static synchronized Player getInstance() {
		if (playerName == null) {
			playerName = new Player();
		}
		return playerName;
	}

	// 플레이어(포켓몬 트레이너) 이름 입력
	public static void player() {
		System.out.println("트레이너의 이름을 입력하세요!");
		String name = scanner.next();
		System.out.println("반가워요, " + name.toString() + "님!");
	}
	
	public static void addPlayer() {
		playerName.equals(playerName);
	}

	public static Player getPlayerName() {
		return playerName;
	}

	public static void setPlayerName(Player playerName) {
		Player.playerName = playerName;
	}

}
