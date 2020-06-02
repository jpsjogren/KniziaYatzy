package program;


public class Player {
	
	private String playerName;	
	private int[] score;
	private boolean[] usedRule;
 
	
	public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }    
    

//    public int getPlayerScore() {
//        return score;
//    }

    public void setPlayerScore(int[] score) {
        this.score = score;
    }      

    public Player(String name)
    {
        this.playerName=name;
    }

}
