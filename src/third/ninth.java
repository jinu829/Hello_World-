package third;

public class ninth {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = gameScore++;
        System.out.println(lastScore1);

        int lastScore2 = gameScore--;
        System.out.println(lastScore2);
    }
}