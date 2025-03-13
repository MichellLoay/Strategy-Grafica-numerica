/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DigitView extends JFrame {
    private final JLabel[][] grid;
    private final JButton incrementButton;
    private final JButton decrementButton;

    public DigitView() {
        super("Digit Display MVC");

        grid = new JLabel[7][7];
        incrementButton = new JButton("Incrementa");
        decrementButton = new JButton("Decrementa");

        setLayout(new BorderLayout());

        //griglia
        JPanel gridPanel = new JPanel(new GridLayout(7, 7));
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                grid[i][j] = new JLabel();
                grid[i][j].setOpaque(true);
                grid[i][j].setBackground(Color.WHITE);
                grid[i][j].setBorder(BorderFactory.createLineBorder(Color.GRAY));
                gridPanel.add(grid[i][j]);
            }
        }

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(decrementButton);
        buttonPanel.add(incrementButton);

        add(gridPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //metodo per aggiornare la griglia secondo il pattern
    public void updateGrid(boolean[][] pattern) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (pattern[i][j]) {
                    grid[i][j].setBackground(Color.BLACK);
                } else {
                    grid[i][j].setBackground(Color.WHITE);
                }
            }
        }
    }

    public void setIncrementButtonEnabled(boolean enabled) {
        incrementButton.setEnabled(enabled);
    }

    public void setDecrementButtonEnabled(boolean enabled) {
        decrementButton.setEnabled(enabled);
    }

    public void addIncrementListener(ActionListener listener) {
        incrementButton.addActionListener(listener);
    }

    public void addDecrementListener(ActionListener listener) {
        decrementButton.addActionListener(listener);
    }
}

