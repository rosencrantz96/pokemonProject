package pokemon.choose;

import java.util.Scanner;

import player.Player;
import pokemon.Pokemon;
import pokemon.character.Bulbasaur;
import pokemon.character.Cyndaquil;
import pokemon.character.Piplup;

public class chooseCharacter {
	public Pokemon choosePokemon() {
		Player playerName = Player.getInstance();
		String trainer = playerName.toString();
		
		Scanner scanner = new Scanner(System.in);
		Pokemon returnPokemon = null;
		
		System.out.println("함께할 포켓몬을 골라주세요!");
		System.out.println("1. 브케인 | 2. 이상해씨 | 3. 팽도리 | 4. 어떤 포켓몬인가요?");
		int selectPo = scanner.nextInt();
		
		switch (selectPo) {
		case 1: 
			returnPokemon = new Cyndaquil();
			break;
		case 2: 
			returnPokemon = new Bulbasaur();
			break;
		case 3: 
			returnPokemon = new Piplup();
			break;
		case 4: 
			returnPokemon = showInfo();
		}
		
		return returnPokemon;
	}

	private Pokemon showInfo() {
		return null;
	}
}
