package assignments;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        LocalProcessor localProcessor = new LocalProcessor();
        localProcessor.listIterator(new ArrayList<>(List.of("1", "2", "3", "4", "5")));

    }
}
