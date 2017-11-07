package main;

import java.util.Objects;

public class TennisGame1  implements TennisGame {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;
    private String playerOne;
    private String playerTwo;

    public TennisGame1(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void scorePoint(String playerName) {
        if (Objects.equals(playerName, "player1")) {
            playerOneScore += 1;
        }
        else if (Objects.equals(playerName, "player2")) {
            playerTwoScore += 1;
        } else {
            System.out.println("The player only can be player1 or player2");
        }
    }

    public String getScore() {
        String score = "";
        if (playerOneScore == playerTwoScore) {
            score = equalPlayerScoreProvider(playerOneScore);
        } else if (playerOneScore>=4 || playerTwoScore>=4) {
            score = advantageScoreProvider(playerOneScore - playerTwoScore);
        } else {
            score = unevenScoreProvider(playerOneScore, playerTwoScore);
        }
        return score;
    }

    public String equalPlayerScoreProvider(int playerOneScore) {
        String score = "";
        if(playerOneScore == 0){
            score = "Love-All";
        }else if(playerOneScore == 1){
            score = "Fifteen-All";
        }else if (playerOneScore == 2){
            score = "Thirty-All";
        }else if (playerOneScore == 3){
            score = "Forty-All";
        }else {
            score = "Deuce";
        }
        return score;
    }

    public String advantageScoreProvider(int minusScoresResult){
        String score = "";

        if (minusScoresResult == 1) {
            score = "Advantage player1";
        } else if (minusScoresResult == -1){
            score = "Advantage player2";
        } else if (minusScoresResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    public String unevenScoreProvider(int playerOneScore, int playerTwoScore){
        String score = "";

        for (int i = 0; i < 3; i++) {
            int setCounter = i;
            if (playerOneScore > playerTwoScore) {

            } else {
                score = tempScoreContainer(setCounter);
            }
        }
        return score;
    }

    public String  tempScoreContainer(int setCounter) {
        String score = "";
        if (setCounter == 0) {
            score  = "Love";
        } else if (setCounter == 1) {
            score = "Fifteen";
        } else if (setCounter == 2) {
            score = "Thirty";
        } else if (setCounter == 3) {
            score = "Fourty";
        }
        return score;
    }

}
