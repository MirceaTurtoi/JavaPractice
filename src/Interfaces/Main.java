package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Mircea", 100, 10);
        player1.setName("Ady");
        Player player2 = new Player("Lex", 90, 9);
        player2.setName("Lupu");
        player1.setName("Ady");
        Monster monster1 = new Monster("Godzilla", 1000, 100);
        List<String> player = new ArrayList<>();
        player.add("Alex");
        player.add("68");
        player.add("6");
        player.add("Katana");
        player1.read(player);
        System.out.println("Player configuration: " + player);
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
