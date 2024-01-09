package soccer;

public class League
{
    public static void main(String[] args)
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Team t1 = new Team();
        Game g1 = new Game();

        p1.playerName = "George Eliot";
        p2.playerName = "Graham Greene";
        p3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = { p1,p2,p3 };
        t1.teamName = "The Greens";
        t1.playerArray = thePlayers;
        //p1.playerName = "Robert Service";
        for(Player thePlayer : t1.playerArray)
        {
            System.out.println(thePlayer.playerName);
        }

        Team t2 = new Team();
        t2.teamName = "The Reds";
        t2.playerArray = new Player[3];
        t2.playerArray[0] = new Player();
        t2.playerArray[0].playerName = "Robert Service";
        t2.playerArray[1] = new Player();
        t2.playerArray[1].playerName = "Robbie Burns";
        t2.playerArray[2] = new Player();
        t2.playerArray[2].playerName = "Rafael Sabatini";

        Game currGame = new Game();
        Goal goal1 = new Goal();
        currGame.homeTeam = t1;
        currGame.awayTeam = t2;

        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after " + currGame.goals[0].theTime + "mins by "
                + currGame.goals[0].thePlayer.playerName + "of " + currGame.goals[0].theTeam.teamName);

        for(Player thePlayer : t2.playerArray)
        {
            if(thePlayer.playerName.matches(".*Sab.*"))
            {
                System.out.println("Found " + thePlayer.playerName);
                System.out.println( "Last Name is " + thePlayer.playerName.split(" ")[1]);
            }

        }
        StringBuilder familyNameFirst = new StringBuilder();

        for(Player thePlayer : t1.playerArray)
        {
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
        }

    }
}
