/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
public class DigitModelImpl implements DigitModel {
    private int currentDigit = 0;
    private final int MAX_DIGIT = 9;
    private final int MIN_DIGIT = 0;

    //pattern 7x7 per ogni cifra (semplificata per brevità)
    private final boolean[][][] digits = {
        {   // 0
            {true,true,true,true,true,true,true},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {true,true,true,true,true,true,true}
        },
        {   // 1
            {false,false,false,true,false,false,false},
            {false,false,true,true,false,false,false},
            {false,true,false,true,false,false,false},
            {false,false,false,true,false,false,false},
            {false,false,false,true,false,false,false},
            {false,false,false,true,false,false,false},
            {false,true,true,true,true,false,false}
        },
        {   // 2
            {true,true,true,true,true,true,true},
            {false,false,false,false,false,false,true},
            {false,false,false,false,false,true,true},
            {false,false,false,false,true,true,false},
            {false,false,false,true,true,false,false},
            {false,false,true,true,false,false,false},
            {true,true,true,true,true,true,true}
        },
        {   // 3
            {true,true,true,true,true,true,true},
            {false,false,false,false,false,false,true},
            {false,false,false,false,true,true,true},
            {false,false,false,true,true,true,false},
            {false,false,false,false,false,false,true},
            {false,false,false,false,false,false,true},
            {true,true,true,true,true,true,true}
        },
        {   // 4
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {false,true,true,true,true,true,true},
            {false,false,false,false,false,false,true},
            {false,false,false,false,false,false,true},
            {false,false,false,false,false,false,true},

        },
        {   // 5
            {true,true,true,true,true,true,true},
            {true,false,false,false,false,false,false},
            {true,false,false,false,false,false,false},
            {false,true,true,true,true,true,false},
            {false,false,false,false,false,false,true},
            {false,false,false,false,false,false,true},
            {true,true,true,true,true,true,false},
        },
        {   // 6
            {false,false,false,true,true,true,true},
            {false,false,true,false,false,false,false},
            {false,true,false,false,false,false,false},
            {true,true,true,true,true,true,false},
            {true,false,false,false,false,false,true},
            {false,true,false,false,false,false,true},
            {false,false,true,true,true,true,false},
        },
        {   // 7
            {true,true,true,true,true,true,true},
            {false,false,false,false,false,true,false},
            {false,false,false,false,true,false,false},
            {false,false,false,true,false,false,false},
            {false,false,true,false,false,false,false},
            {false,true,false,false,false,false,false},
            {true,false,false,false,false,false,false},

        },
        {   // 8
            {false,true,true,true,true,true,false},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {false,true,true,true,true,true,false},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {false,true,true,true,true,true,true},
        },
        {   // 9
            {false,true,true,true,true,true,false},
            {true,false,false,false,false,false,true},
            {true,false,false,false,false,false,true},
            {false,true,true,true,true,true,false},
            {false,false,false,false,false,false,true},
            {false,false,false,false,false,false,true},
            {true,true,true,true,true,true,true},
        },
        
    };

    @Override
    public void increment() {
        if (currentDigit < MAX_DIGIT) currentDigit++;
    }

    @Override
    public void decrement() {
        if (currentDigit > MIN_DIGIT) currentDigit--;
    }

    @Override
    public int getCurrentDigit() {
        return currentDigit;
    }

    @Override
    public boolean canIncrement() {
        return currentDigit < MAX_DIGIT;
    }

    @Override
    public boolean canDecrement() {
        return currentDigit > MIN_DIGIT;
    }

    @Override
    public boolean[][] getCurrentDigitPattern() {
        return digits[currentDigit];
    }
}

