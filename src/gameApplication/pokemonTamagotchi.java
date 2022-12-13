package gameApplication;

import player.Player;

public class pokemonTamagotchi {
	public static void startGame() {
		System.out.println("당신만의 귀여운 포켓몬을 키워보세요! \n포켓몬 다마고치를 시작합니다. \n");
	}
	
	
	public static void main(String[] args) {
		startGame();
		Player name = Player.getInstance();
		name.toString();
		Player.player();
		Player.setPlayerName(name);
		System.out.println(name.toString() + "님이 게임을 시작합니다!");
	}


}
