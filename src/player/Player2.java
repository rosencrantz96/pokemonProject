package player;

import java.util.Scanner;

public class Player2 {
	private static Player2 playerName;
	private static Scanner scanner = new Scanner(System.in);

	private Player2() {
	}

	// 싱글톤 구현
	public static synchronized Player2 getInstance() {
		if (playerName == null) {
			playerName = new Player2();
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

	public static Player2 getPlayerName() {
		return playerName;
	}

	public static void setPlayerName(Player2 playerName) {
		Player2.playerName = playerName;
	}

}
