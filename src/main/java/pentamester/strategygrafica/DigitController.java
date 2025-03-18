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
    private DigitModel model;
    private DigitView view;

    public DigitController(DigitModel model, DigitView view) {
        this.model = model;
        this.view = view;

        updateView();

        view.addIncrementListener(e -> {
            model.increment();
            updateView();
        });

        view.addDecrementListener(e -> {
            model.decrement();
            updateView();
        });
    }

    private void updateView() {
        view.updateGrid(model.getCurrentPattern());
        view.setIncrementButtonEnabled(model.canIncrement());
        view.setDecrementButtonEnabled(model.canDecrement());
    }
}
