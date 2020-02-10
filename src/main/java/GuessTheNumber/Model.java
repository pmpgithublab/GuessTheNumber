package GuessTheNumber;

import java.util.*;

public class Model {
    private int lowBorder;
    private int highBorder;
    Random random = new Random(System.currentTimeMillis());

    private int generatedNumber;
    List<Integer> guessedNumbers = new LinkedList<>();

    public void generateNumber(int randMaxBorder) {
        highBorder = randMaxBorder;
        generatedNumber = random.nextInt(randMaxBorder - 1) + 1;
    }

    public void addTriedNumber(int triedNumber) {
        guessedNumbers.add(triedNumber);
    }

    public String getStatistics() {
        return View.STATISTIC_MESSAGE + guessedNumbers.toString();
    }

    public int getGeneratedNumber() {
        return generatedNumber;
    }

    public int getLowBorder() {
        return lowBorder;
    }

    public int getHighBorder() {
        return highBorder;
    }

    public void setBorderRange(int enteredNumber) {
        if (enteredNumber > generatedNumber){
            highBorder = enteredNumber;
        }
        else{
            lowBorder = enteredNumber;
        }
    }
}
