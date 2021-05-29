package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Record pr = new Record();
        Game g1 = new Game(2,3,5,"game1");
        Game g2 = new Game(5,6,7,"game2");
        pr.addNewGame(g1);
        System.out.println("Kills:" + pr.getTotalKills()+", Dead:" + pr.getTotalDeaths()+ ", Assist:" + pr.getTotalAssists());
        pr.addNewGame(g2);
        System.out.println("Kills:" + pr.getGameKills("game2")+", Dead:" + pr.getGameDeaths("game2")+ ", Assist:" + pr.getGameAssists("game2"));
        pr.updateGameKills("game1", 4);
        System.out.println("Kills:" + pr.getGameKills("game1"));
        //total kill after update
        System.out.println("Total kill after update: " + pr.getTotalKills());
    }
}
