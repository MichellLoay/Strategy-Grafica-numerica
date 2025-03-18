/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
public class DigitFactory {
    public static DigitStrategy getDigit(int number) {
        switch (number) {
            case 0: return new DigitZero();
            case 1: return new DigitOne();
            case 2: return new DigitTwo();
            case 3: return new DigitThree();
            case 4: return new DigitFour();
            case 5: return new DigitFive();
            case 6: return new DigitSix();
            case 7: return new DigitSeven();
            case 8: return new DigitEight();
            case 9: return new DigitNine();
            default: throw new IllegalArgumentException("num non supportato: " + number);
        }
    }
}
