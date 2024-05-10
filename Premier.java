                                  /*A JAVA PROGRAM */
                    
// Declaring a class named Premier
class Premier {
    String TeamName;
    int MatchesPlayed;
    int MatchesWon;
    int MatchesLost;
    int MatchesDrawn;
    double PointsPerGame;
    int points;
    int matchesLeft = 38 - MatchesPlayed;

    // Constructor to initialize the variables
    Premier(String name, int mp, int mw, int ml, int md, double ppg, int points)
    {
        this.TeamName = name;
        this.MatchesPlayed = mp;
        this.MatchesWon = mw;
        this.MatchesLost = ml;
        this.MatchesDrawn = md;
        this.PointsPerGame = ppg;
        this.points = points;
        this.matchesLeft = 38 - MatchesPlayed;
    }
    // Method to calculate the total points
    int calculateTotalPoints()
    {
        return (int) (matchesLeft * PointsPerGame + points);
    }
    // Method to find the team with most points
    static Premier findTeamWithMostPoints(Premier[] teams)
    {
        Premier teamWithMostPoints = teams[0];
        for (int i = 1; i < teams.length; i++)
        {
            if (teams[i].calculateTotalPoints() > teamWithMostPoints.calculateTotalPoints())
            {
                teamWithMostPoints = teams[i];
            }
        }
        return teamWithMostPoints;
    }
    // Main method
    public static void main(String[] args)
    {
        Premier team1 = new Premier("Arsenal", 35, 25, 5, 5, 2.29, 80);
        Premier team2 = new Premier("Manchester City", 34, 24, 3, 7, 2.32, 79);
        Premier team3 = new Premier("Liverpool ", 35, 22, 4, 9, 2.14, 75);
        Premier team4 = new Premier("Aston Villa", 35, 20, 8, 7, 1.91, 67);
        Premier team5 = new Premier("Tottenham Hotspurs", 33, 18, 9, 6, 1.82, 60);
        // Array of teams
        Premier[] teams = {team1, team2, team3, team4, team5};

        Premier teamWithMostPoints = Premier.findTeamWithMostPoints(teams);
        for (int i = 0; i < teams.length; i++)
        {
            System.out.println(teams[i].TeamName + " is predicted to have " +
                               teams[i].calculateTotalPoints() + " points");
        }
        System.out.println("************************************************");
        System.out.println("The Winner of the Premier League is " +
                           teamWithMostPoints.TeamName.toUpperCase());
    }
}
