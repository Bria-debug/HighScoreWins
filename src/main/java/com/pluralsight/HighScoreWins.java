package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        String input = "Home:Visitor|21:9";
        String[] splitInput = input.split(Pattern.quote("|"));

        String [] teams = splitInput[0].split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        String [] scores = splitInput[1].split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        String winner;
        if (homeScore<visitorScore) {
            winner = visitorTeam;

        }else if (homeScore>visitorScore) {
            winner = homeTeam;
        }else {
            winner= "Tie";
        }
        System.out.println("Winner:" + winner);



    }
}
