/**
 * @author Z
 * @since January 10 2018
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class CubeTosser
{
    public static void main(String[] args)
    {
        NumberCube cube = new NumberCube();

        int iValues[] = NumberCube.getCubeTosses(cube, 100);

        System.out.println(Arrays.stream(iValues).mapToObj(String::valueOf).collect(Collectors.joining(", ")));

        System.out.println(String.format("First longest run index: %d", NumberCube.getLongestRun(iValues)));
    }
}
