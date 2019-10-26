import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;

public class GameFrame extends JFrame
{
    private ArrayList<ArrayList<GameSlot>> myBoard; 

    public GameFrame()
    {
        super("2048");

        //a 4x4 array of slots
        myBoard = new ArrayList<ArrayList<GameSlot>>();
        getContentPane().setLayout(new GridLayout(4, 4));
        for (int row = 0; row < 4; row++)
        {
            ArrayList<GameSlot> thisRow = new ArrayList<GameSlot>();
            for (int col = 0; col < 4; col++)
            {
                GameSlot thisSlot = new GameSlot(0, row, col);
                thisRow.add(thisSlot);
                getContentPane().add(thisSlot);
            }
            myBoard.add(thisRow);
        }

        //last things for the frame to make it visible
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 200);
        setVisible(true);
    }
}