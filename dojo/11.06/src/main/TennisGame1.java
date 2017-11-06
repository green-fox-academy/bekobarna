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
        int tempScore=0;
        if (playerOneScore==playerTwoScore)
        {
            switch (playerOneScore)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (playerOneScore>=4 || playerTwoScore>=4)
        {
            int minusResult = playerOneScore-playerTwoScore;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = playerOneScore;
                else { score+="-"; tempScore = playerTwoScore;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
