/**
 * @author Z
 * @since January 10 2018
 */

public class NumberCube
{
    public int toss()
    {
        return (int) (Math.random() * (6 - 1) + 1);
    }

    public static int[] getCubeTosses(NumberCube cube, int iTosses)
    {
        if (iTosses <= 0)
            return new int[]{};

        int iResults[] = new int[iTosses];

        for (int i = 0; i < iTosses; i++)
            iResults[i] = cube.toss();

        return iResults;
    }

    public int getLongestRun(int[] iList)
    {
        if (iList.length <= 0)
            return -1;

        int iMaxIndex = -1, iMaxRun = -1, iIteration = 0, iLen = 0;

        for (int i = 0; i < iList.length; i++)
        {
            if (iList[i] == iList[iIteration])
            {
                iLen++;

                if (iLen > iMaxRun)
                {
                    iMaxRun = iLen;
                    iMaxIndex = iIteration;
                }
            }
            else
            {
                iIteration = i;
                iLen = 0;
            }
        }

        return iMaxIndex;
    }
}
