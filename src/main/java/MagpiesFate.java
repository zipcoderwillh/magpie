
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by will on 1/24/16.
 */

public class MagpiesFate {

    private int getNumberOfPlayers() {

        int players = 0;
        Scanner sc = new Scanner(System.in);

        while(players == 0) {
            System.out.println("Please enter a number of players between 2 and 4: ");
            String input = sc.nextLine();
            if (input.matches("[2-4]")) {
                players = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Invalid input. Please try again\n");
            }
        }

        return players;

    }

    private void play() {

        ArrayList<Player> players = new ArrayList<>();
        Deck deck = new Deck();
        int numberOfPlayers = getNumberOfPlayers();
        int winningScore = 0;
        int winningPlayer = -1;

        // Loop over number of players, create new player and add to players ArrayList, draw cards until an ace is found,
        // print out player's cards with their values, and print player's total score.
        for(int i = 1; i <= numberOfPlayers; i++) {

            Player currentPlayer = new Player();
            players.add(currentPlayer);
            boolean hasAce = false;

            while(!hasAce) {
                Card randomCard = deck.getRandomCard();
                currentPlayer.addNewCard(randomCard);
                if(randomCard.getValue().equals(Value.ACE)) {
                    hasAce = true;
                }
            }

            ArrayList<Card> playersCards = currentPlayer.getAllCards();
            int playersTotalPoints = 0;

            System.out.printf("Player %d's cards:\n", i);

            for(Card card : playersCards) {
                System.out.printf("%-5s of %-8s ---> %2d points\n", card.getValue(), card.getSuit(), card.getPoints());
                playersTotalPoints += card.getPoints();
            }

            System.out.printf("Player %d's total points: %d\n", i, playersTotalPoints);
            System.out.println("---------------------------------");

            currentPlayer.setTotalPoints(playersTotalPoints);
        }

        // Loop over all players, find winning player and winning score.
        for(Player player : players) {
            if(player.getTotalPoints() > winningScore) {
                winningScore = player.getTotalPoints();
                winningPlayer = players.indexOf(player) + 1;
            }
        }

        System.out.println("\n********************************");
        System.out.printf(" Player %d wins with %d points! \n", winningPlayer, winningScore);
        System.out.println("********************************");

    }

    public static void main(String[] args) {
        MagpiesFate game = new MagpiesFate();
        game.play();
    }

}