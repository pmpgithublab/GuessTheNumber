package guess_the_number;

import java.util.Scanner;

public class Controller {

    private static final int RAND_MAX_BORDER = 100;

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startTheGame() {
        int enteredNumber;
        Scanner scanner = new Scanner(System.in);

        model.generateNumber(RAND_MAX_BORDER);

        view.showMessage(View.START_MESSAGE);

        while ((enteredNumber = getInputNumber(scanner)) != model.getGeneratedNumber()) {
            model.setBorderRange(enteredNumber);
            model.addTriedNumber(enteredNumber);
            view.showMessage(view.concatenationStrings(View.WRONG_TRY,
                    String.valueOf(model.getLowBorder()),
                    View.SPACE_SIGN,
                    String.valueOf(model.getHighBorder()),
                    View.CLOSING_BRACKET));
        }
        model.addTriedNumber(enteredNumber);
        view.showMessage(View.YOU_WIN_MESSAGE);
        view.showMessage(model.getStatistics());

        scanner.close();
    }

    public int getInputNumber(Scanner scanner) {
        int lowBorder = model.getLowBorder();
        int highBorder = model.getHighBorder();
        String errorMessage = view.concatenationStrings(View.WRONG_TRY,
                String.valueOf(lowBorder),
                View.SPACE_SIGN,
                String.valueOf(highBorder),
                View.CLOSING_BRACKET);
        int result;
        while (true) {
            while (!scanner.hasNextInt()) {
                view.showMessage(errorMessage);
                scanner.next();
            }
            if ((result = scanner.nextInt()) <= lowBorder || result >= highBorder) {
                view.showMessage(errorMessage);
            } else {
                break;
            }
        }
        return result;
    }
}
