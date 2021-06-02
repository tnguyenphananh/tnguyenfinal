package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Record pr = new Record();
        Game game1 = new Game(2,3,5,"1");
        Game game2 = new Game(5,6,7,"2");
        pr.addNewGame(game1);
        System.out.println("Kills:" + pr.getTotalKills()+", Dead:" + pr.getTotalDeaths()+ ", Assist:" + pr.getTotalAssists());
        pr.addNewGame(game2);
        //specific KDA of game 2
        System.out.println("Kills:" + pr.getGameKills("2")+", Dead:" + pr.getGameDeaths("2")+ ", Assist:" + pr.getGameAssists("2"));
        pr.updateGameKills("1", 4);
        //game 1 Kills number updated
        System.out.println("Kills:" + pr.getGameKills("1"));
        //total kill after update
        System.out.println("Total kill after update: " + pr.getTotalKills());
    }
}
