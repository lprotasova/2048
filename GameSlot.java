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
        colorMap.put(0, new Color(212, 212, 212));
        colorMap.put(2, new Color(252, 77, 18));
        colorMap.put(4, new Color(231, 125, 10));
        colorMap.put(8, new Color(245, 242, 120));
        colorMap.put(16, new Color(153, 241, 20));
        colorMap.put(32, new Color(24, 177, 20));
        colorMap.put(64, new Color(32, 175, 223));
        colorMap.put(128, new Color(37, 16, 135));
        colorMap.put(256, new Color(183, 44, 243));
        colorMap.put(512, new Color(215, 9, 158));
        colorMap.put(1024, new Color(202, 0, 0));
        colorMap.put(2048, new Color(255, 187, 28));
        colorMap.put(4096, new Color(244, 244, 0));
        colorMap.put(8192, new Color(13, 255, 24));
        colorMap.put(16384, new Color(128, 255, 255));
        colorMap.put(32768, new Color(27, 109, 235));
        colorMap.put(65536, new Color(142, 14, 248));
        colorMap.put(131072, new Color(255, 6, 236));

        setBackground(colorMap.get(currentNum));
    }
}