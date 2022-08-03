public class PlayerRating{
    int playerPosition;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char category;

    public PlayerRating(int playerPosition, String playerName){
        this.playerName = playerName;
        this.playerPosition = playerPosition;
    }

    public void calculateAverageRating(float criticOneRating, float critictwoRating){
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = critictwoRating;

        this.averageRating = (criticOneRating + critictwoRating)/2;
    }
    
    public void calculateAverageRating(float criticOneRating, float critictwoRating, float criticThreeRating){
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = critictwoRating;
        this.criticThreeRating = criticThreeRating;
        this.averageRating = (criticOneRating + critictwoRating + criticThreeRating)/3;
    }

    public String CalculateCategory(){
        if(this.averageRating > 8){
            // System.out.println('A');
            return "A";
        }
        else if(this.averageRating > 5 && this.averageRating <= 8){
            // System.out.println('B');
            return "B";
        }
        else{
            // System.out.println('B');
            return "C";
        }
    }

    public void Display(){
        System.out.println("the player name is "+this.playerName);
        System.out.println("the player position is "+this.playerPosition);
        System.out.println("the player rating is "+this.averageRating);

        System.out.println("the category is "+ CalculateCategory());
    }

    public static void main(String[] args) {
        PlayerRating playerRating1 = new PlayerRating(1, "Beckham");
        playerRating1.calculateAverageRating(9, 9.9f);
        playerRating1.Display();
        System.out.println();
        System.out.println();
        PlayerRating playerRating2 = new PlayerRating(1, "Oscar");
        playerRating2.calculateAverageRating(1, 1, 1);
        playerRating2.Display();
    }
}
   