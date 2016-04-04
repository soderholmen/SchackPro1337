/**
 * Created by gurra on 4/4/16.
 */

import javax.swing.*;


public class Board {
    private JFrame frame;

    public Board() {
        this.frame = new JFrame("Board");
        frame.setSize(700,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
            new Board();
        }

    }
}
