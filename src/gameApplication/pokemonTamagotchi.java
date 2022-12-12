package gameApplication;

import java.util.Scanner;

import player.Player;

public class pokemonTamagotchi {
	private static Scanner scanner = new Scanner(System.in);
	static Player plaayerName;
	
	public static void startGame() {
		System.out.println("당신만의 귀여운 포켓몬을 키워보세요! \n 포켓몬 다마고치를 시작합니다.");
	}
	public static void player() {
		System.out.println("플레이어의 이름을 입력하세요."); 
		String name = scanner.next();
		
	}
	
	public static void main(String[] args) {

	}

}
