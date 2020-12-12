
import java.awt.Color;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elena
 */
public class Main {

    public static void main(String[] args) {
        FechaHoraPanel vista = new FechaHoraPanel();
        vista.setSize(450, 300);
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.setBackground(Color.white);
        vista.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
