package com.company;

public class Game {
    private int kills;
    private int deaths;
    private int assists;
    private String gameID;
    //A game have Kills, Deaths, Assists and a gameID
    public Game(int kills, int deaths, int assists, String gameID ){
        this.assists = assists;
        this.kills = kills;
        this.deaths = deaths;
        this.gameID = gameID;
    }
    //return number assists in a game
    public int getAssists() {
        return assists;
    }
    //return number of deaths in a game
    public int getDeaths() {
        return deaths;
    }
    //return number of kills in a game
    public int getKills() {
        return kills;
    }
    //get a specific game id
    public String getGameID() {
        return gameID;
    }
    //In a game Kills, Assists and Deaths can only increase
    //following functions increase each number of KDA accordingly
    public void updateKills(int numKills) {
        this.kills += numKills;
    }

    public void updateAssists(int numAssists) {
        this.assists += numAssists;
    }

    public void updateDeaths(int numDeaths) {
        this.deaths += numDeaths;
    }
}
