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
    private JLabel[][] gridLabels;
    private JButton incrementButton, decrementButton;

    public DigitView() {
        setTitle("Digit Display");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(7, 7));
        gridLabels = new JLabel[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                gridLabels[i][j] = new JLabel();
                gridLabels[i][j].setOpaque(true);
                gridLabels[i][j].setBackground(Color.LIGHT_GRAY);
                gridLabels[i][j].setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                gridPanel.add(gridLabels[i][j]);
            }
        }

        JPanel buttonPanel = new JPanel();
        incrementButton = new JButton("Incrementa");
        decrementButton = new JButton("Decrementa");
        buttonPanel.add(decrementButton);
        buttonPanel.add(incrementButton);

        add(gridPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void updateGrid(boolean[][] pattern) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (pattern[i][j]) {
                    gridLabels[i][j].setBackground(Color.BLACK);
                } else {
                    gridLabels[i][j].setBackground(Color.WHITE);
                }
            }
        }
    }

    public void addIncrementListener(ActionListener listener) {
        incrementButton.addActionListener(listener);
    }

    public void addDecrementListener(ActionListener listener) {
        decrementButton.addActionListener(listener);
    }

    public void setIncrementButtonEnabled(boolean enabled) {
        incrementButton.setEnabled(enabled);
    }

    public void setDecrementButtonEnabled(boolean enabled) {
        decrementButton.setEnabled(enabled);
    }
}

