import java.util.Scanner;
import java.util.Random;

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

        if(gameMode == 1) {
            singlePlayerQuestions();
        }
        if(gameMode == 2) {
            multiPlayerQuestions();
        }

    }

    public static void singlePlayerQuestions()
    {
        Random random = new Random();
        int randomizerOne = random.nextInt(4-1)+1;
        int randomizerTwo = random.nextInt(4-1)+1;
        int randomizerThree = random.nextInt(4-1)+1;

        String computerOne = "";
        if(randomizerOne == 1){
            computerOne = "r";
        }
        if(randomizerOne == 2){
            computerOne = "s";
        }
        if(randomizerOne == 3){
            computerOne = "p";
        }
        String computerTwo = "";
        if(randomizerTwo == 1){
            computerTwo = "r";
        }
        if(randomizerTwo == 2){
            computerTwo = "s";
        }
        if(randomizerTwo == 3){
            computerTwo = "p";
        }
        String computerThree = "";
        if(randomizerThree == 1){
            computerThree = "r";
        }
        if(randomizerThree == 2){
            computerThree = "s";
        }
        if(randomizerThree == 3){
            computerThree = "p";
        }
        Scanner sc = new Scanner(System.in);
        //Singleplayer
        System.out.println("Please enter your name");
        String namePlayerOne = sc.nextLine();

        System.out.println("Please pick your next three choices by type r for rock, s for scissor and p for paper.");
        String firstChoicePlayerOne = sc.nextLine();
        String secondChoicePlayerOne = sc.nextLine();
        String thirdChoicePlayerOne = sc.nextLine();

        int resultOne = (theGameEngineSingle(firstChoicePlayerOne,computerOne));
        int resultTwo = (theGameEngineSingle(secondChoicePlayerOne, computerTwo));
        int resultThree = (theGameEngineSingle(thirdChoicePlayerOne, computerThree));

        //Determining who wins round 3
        if (resultOne == 1) {
            System.out.println("Game 1: " + namePlayerOne + " wins");
        }
        if (resultOne == 2) {
            System.out.println("Game 1: Computer wins");
        }
        if (resultOne == 0) {
            System.out.println("Game 1: It's a draw");
        }
        //Determining who wins round 3
        if (resultTwo == 1) {
            System.out.println("Game 2: " + namePlayerOne + " wins");
        }
        if (resultTwo == 2) {
            System.out.println("Game 2: Computer wins");
        }
        if (resultTwo == 0) {
            System.out.println("Game 2: It's a draw");
        }
        //Determining who wins round 3
        if (resultThree == 1) {
            System.out.println("Game 3: " + namePlayerOne + " wins");
        }
        if (resultThree == 2) {
            System.out.println("Game 3: Computer wins");
        }
        if (resultThree == 0) {
            System.out.println("Game 3: It's a draw");
        }

    }
    public static int theGameEngineSingle(String playerOne, String computer) {

        //int winner needs to be initialized because
        int winner = 0;
        if(playerOne.equals("p") && computer.equals("p")){
            winner = 0;
        }
        if (playerOne.equals("r") && computer.equals("r")) {
            winner = 0;
        }
        if(playerOne.equals("s") && computer.equals("s")){
            winner = 0;
        }
        if(playerOne.equals("p") && computer.equals("r")) {
            winner = 1;
        }
        if(playerOne.equals("r") && computer.equals("s")) {
            winner = 1;
        }
        if(playerOne.equals("s") && computer.equals("p")){
            winner = 1;
        }
        if(playerOne.equals("p") && computer.equals("s")){
            winner = 2;
        }
        if(playerOne.equals("s") && computer.equals("r")) {
            winner = 2;
        }
        if(playerOne.equals("r") && computer.equals("p")){
            winner = 2;
        }
        return winner;
    }
    public static void multiPlayerQuestions(){
        Scanner sc = new Scanner(System.in);
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

        int resultOne = (theGameEngineMulti(firstChoicePlayerOne, firstChoicePlayerTwo));
        int resultTwo = (theGameEngineMulti(secondChoicePlayerOne, secondChoicePlayerTwo));
        int resultThree = (theGameEngineMulti(thirdChoicePlayerOne, thirdChoicePlayerTwo));
        //System.out.println("Results are: Game1 " + resultOne + ", Game2 " + resultTwo + ", Game3 " + resultThree);

        //Determining who wins round 3
        if(resultOne == 1) {
            System.out.println("Game 1: " + namePlayerOne + " wins");
        }
        if(resultOne == 2) {
            System.out.println("Game 1: " + namePlayerTwo + " wins");
        }
        if(resultOne == 0) {
            System.out.println("Game 1: It's a draw");
        }
        //Determining who wins round 3
        if(resultTwo == 1) {
            System.out.println("Game 2: " + namePlayerOne + " wins");
        }
        if(resultTwo == 2) {
            System.out.println("Game 2: " + namePlayerTwo + " wins");
        }
        if(resultTwo == 0) {
            System.out.println("Game 2: It's a draw");
        }
        //Determining who wins round 3
        if(resultThree == 1) {
            System.out.println("Game 3: " + namePlayerOne + " wins");
        }
        if(resultThree == 2) {
            System.out.println("Game 3: " + namePlayerTwo + " wins");
        }
        if(resultThree == 0) {
            System.out.println("Game 3: It's a draw");
        }
    }
        public static int theGameEngineMulti(String playerOne, String playerTwo) {

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
