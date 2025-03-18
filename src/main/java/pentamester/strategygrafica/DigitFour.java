/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
public class DigitFour implements DigitStrategy {
    @Override
    public boolean[][] getPattern() {
        return new boolean[][] {
            {true, false, false, false, false, true, false},
            {true, false, false, false, false, true, false},
            {true, false, false, false, false, true, false},
            {true, true, true, true, true, true, true},
            {false, false, false, false, false, true, false},
            {false, false, false, false, false, true, false},
            {false, false, false, false, false, true, false}
        };
    }
}

