import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

public class GameSlot extends JPanel
{
    private int xCoord;
    private int yCoord;
    private int currentNum;

    public GameSlot(int startNum, int x, int y)
    {
        super();
        setXCoord(x);
        setYCoord(y);
        setCurrentNum(startNum);
    }

    public int getXCoord()
    {
        return xCoord;
    }

    private void setXCoord(int x)
    {
        if(x >= 0)
        {
            xCoord = x;
        }
        else
        {
            xCoord = 0;
        }
    }

    public int getYCoord()
    {
        return yCoord;
    }

    private void setYCoord(int y)
    {
        if(y >= 0)
        {
            yCoord = y;
        }
        else
        {
            yCoord = 0;
        }
    }

    public int getCurrentNum()
    {
        return currentNum;
    }

    public boolean setCurrentNum(int newNum)
    {
        ArrayList<Integer> allPossibleValues = new ArrayList<Integer>();
        allPossibleValues.add(0);
        allPossibleValues.add(2);
        allPossibleValues.add(4);
        allPossibleValues.add(8);
        allPossibleValues.add(16);
        allPossibleValues.add(32);
        allPossibleValues.add(64);
        allPossibleValues.add(128);
        allPossibleValues.add(256);
        allPossibleValues.add(512);
        allPossibleValues.add(1024);
        allPossibleValues.add(2048);
        allPossibleValues.add(4096);
        allPossibleValues.add(8192);
        allPossibleValues.add(16384);
        allPossibleValues.add(32768);
        allPossibleValues.add(65536);
        allPossibleValues.add(131072);

        for (int possibleNum : allPossibleValues) {
            if (newNum == possibleNum)
            {
                currentNum = newNum;
                updateColor();
                return true;
            }
            else if (possibleNum > newNum)
            {
                return false;
            }
        }

        return false;
    }

    private void updateColor()
    {
        HashMap<Integer, Color> colorMap = new HashMap<Integer, Color>();
        colorMap.put(0, new Color(0, 0, 0));
        colorMap.put(2, new Color(20, 0, 0));
        colorMap.put(4, new Color(20, 20, 0));
        colorMap.put(16, new Color(20, 20, 20));
        colorMap.put(32, new Color(40, 20, 20));
        colorMap.put(64, new Color(40, 40, 20));
        colorMap.put(128, new Color(40, 40, 40));
        colorMap.put(256, new Color(60, 40, 40));
        colorMap.put(512, new Color(60, 60, 40));
        //finish this later

        setBackground(colorMap.get(currentNum));
    }
}