package com.inteship.task.generic;

public class Main {
    public static void main(String[] args) {
        Sport Football = new Sport("Football");
        Football RM= new Football("RealMadrid");
        Football Monaco= new Football("Monaco");
        Football Barca= new Football("Barca");
        Football Liverpool= new Football("Liverpool");

        League<Football> footballLeague = new League<>("Football");
        footballLeague.addTeamToLeague(RM);
        footballLeague.addTeamToLeague(Monaco);
        footballLeague.addTeamToLeague(Barca);
        footballLeague.addTeamToLeague(Liverpool);
        footballLeague.displayLeague();
