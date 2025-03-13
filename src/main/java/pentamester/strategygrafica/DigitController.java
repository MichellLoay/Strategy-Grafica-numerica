/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitController {
    private final DigitModel model;
    private final DigitView view;

    public DigitController(DigitModel model, DigitView view) {
        this.model = model;
        this.view = view;

        // Set up listeners
        view.addIncrementListener(new IncrementListener());
        view.addDecrementListener(new DecrementListener());

        // Mostra la cifra iniziale
        updateView();
    }

    private void updateView() {
        view.updateGrid(model.getCurrentDigitPattern());
        view.setIncrementButtonEnabled(model.canIncrement());
        view.setDecrementButtonEnabled(model.canDecrement());
    }

    private class IncrementListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.increment();
            updateView();
        }
    }

    private class DecrementListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.decrement();
            updateView();
        }
    }
}

