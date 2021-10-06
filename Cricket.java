/*
Mahfuzul Islam Chowdhury
ID:2012020111
Section:C
E-mail:cse_2012020111@lus.ac.bd
Date of submission: 11 September 2021
 */
package mahfuz;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;

    Cricket( String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;

    }

    void display()
    {
        System.out.println("Match type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of the Player: "+player.playerName);
        System.out.println("Jersey number of the player: "+player.jerseyNumber);
    }


}
