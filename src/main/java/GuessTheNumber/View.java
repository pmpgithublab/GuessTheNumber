package GuessTheNumber;

public class View {
    public static final String START_MESSAGE = "Try to guess a number between 0 and 100.";
    public static final String WRONG_TRY = "Wrong! Try one more time in range ]";
    public static final String YOU_WIN_MESSAGE = "CONGRATULATIONS! YOU WIN!";
    public static final String STATISTIC_MESSAGE = "You entered: ";

    public void showMessage(String message) {
        System.out.println(message);
    }

}
