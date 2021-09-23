import java.util.Scanner;

public class RockPaperScissor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play \n1.Singleplayer or 2. Multiplayer?" +
                "\nPlease select 1 or 2.");
        int gameMode = sc.nextInt();
        //scanner bug
        sc.nextLine();

        //Multiplayer
        System.out.println("Please enter the name of player one.");
        String namePlayerOne = sc.nextLine();
        System.out.println("Please enter the name of player two.");
        String namePlayerTwo = sc.nextLine();

        System.out.println("player one, please pick your next three choices by type r for rock, s for scissor and p for paper.");
        String firstChoicePlayerOne = sc.nextLine();
        String secondChoicePlayerOne = sc.nextLine();
        String thirdChoicePlayerOne = sc.nextLine();

        System.out.println("player two, please pick your next three choices by type r for rock, s for scissor and p for paper.");
        String firstChoicePlayerTwo = sc.nextLine();
        String secondChoicePlayerTwo = sc.nextLine();
        String thirdChoicePlayerTwo= sc.nextLine();

        //System.out.println("pl1 1." + firstChoicePlayerOne + secondChoicePlayerOne + thirdChoicePlayerOne);
        //System.out.println("pl2 2." + firstChoicePlayerTwo + secondChoicePlayerTwo + thirdChoicePlayerTwo);

        int resultOne = (theGame(firstChoicePlayerOne, firstChoicePlayerTwo));
        int resultTwo = (theGame(secondChoicePlayerOne, secondChoicePlayerTwo));
        int resultThree = (theGame(thirdChoicePlayerOne, thirdChoicePlayerTwo));
        //System.out.println("Results are: Game1 " + resultOne + ", Game2 " + resultTwo + ", Game3 " + resultThree);

        //Determining who wins round 3
        if(resultOne == 1) {
            System.out.println("Game 1: Player one wins");
        }
        if(resultOne == 2) {
            System.out.println("Game 1: Player two wins");
        }
        if(resultOne == 0) {
            System.out.println("Game 1: It's a draw");
        }
        //Determining who wins round 3
        if(resultTwo == 1) {
            System.out.println("Game 2: Player one wins");
        }
        if(resultTwo == 2) {
            System.out.println("Game 2: Player two wins");
        }
        if(resultTwo == 0) {
            System.out.println("Game 2: It's a draw");
        }
        //Determining who wins round 3
        if(resultThree == 1) {
            System.out.println("Game 3: Player one wins");
        }
        if(resultThree == 2) {
            System.out.println("Game 3: Player two wins");
        }
        if(resultThree == 0) {
            System.out.println("Game 3: It's a draw");
        }
    }
    public static int theGame(String playerOne, String playerTwo) {

        //int winner needs to be initialized because
        int winner = 0;
        if(playerOne.equals("p") && playerTwo.equals("p")){
            winner = 0;
        }
        if (playerOne.equals("r") && playerTwo.equals("r")) {
            winner = 0;
        }
        if(playerOne.equals("s") && playerTwo.equals("s")){
            winner = 0;
        }
        if(playerOne.equals("p") && playerTwo.equals("r")) {
            winner = 1;
        }
        if(playerOne.equals("r") && playerTwo.equals("s")) {
            winner = 1;
        }
        if(playerOne.equals("s") && playerTwo.equals("p")){
            winner = 1;
        }
        if(playerOne.equals("p") && playerTwo.equals("s")){
            winner = 2;
        }
        if(playerOne.equals("s") && playerTwo.equals("r")) {
            winner = 2;
        }
        if(playerOne.equals("r") && playerTwo.equals("p")){
            winner = 2;
        }
        return winner;
    }

}
