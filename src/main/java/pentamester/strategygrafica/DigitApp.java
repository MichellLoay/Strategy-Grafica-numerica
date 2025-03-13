/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.strategygrafica;

/**
 *
 * @author shwak
 */
public class DigitApp {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            DigitModel model = new DigitModelImpl();
            DigitView view = new DigitView();
            new DigitController(model, view);
        });
    }
}
