package guess_the_number;

import java.lang.reflect.Array;
import java.util.Arrays;

public class View {
    public static final String START_MESSAGE = "Try to guess a number between 0 and 100.";
    public static final String WRONG_TRY = "Wrong! Try one more time in range ]";
    public static final String YOU_WIN_MESSAGE = "CONGRATULATIONS! YOU WIN!";
    public static final String STATISTIC_MESSAGE = "You entered: ";
    public static final String SPACE_SIGN = " ";
    public static final String CLOSING_BRACKET = "[";

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String concatenationStrings(String ...s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : s)
            stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
