/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
public interface DigitModel {
    void increment();
    void decrement();
    int getCurrentDigit();
    boolean canIncrement();
    boolean canDecrement();
    boolean[][] getCurrentDigitPattern();
}

