/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
public class DigitModel {
    private int currentDigit = 0;

    public int getCurrentDigit() {
        return currentDigit;
    }

    public boolean[][] getCurrentPattern() {
        return DigitFactory.getDigit(currentDigit).getPattern();
    }

    public void increment() {
        if (currentDigit < 9) currentDigit++;
    }

    public void decrement() {
        if (currentDigit > 0) currentDigit--;
    }

    public boolean canIncrement() {
        return currentDigit < 9;
    }

    public boolean canDecrement() {
        return currentDigit > 0;
    }
}


