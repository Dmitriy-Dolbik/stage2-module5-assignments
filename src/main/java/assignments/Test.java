package assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        LocalProcessor localProcessor = new LocalProcessor();
        localProcessor.fullNameProcessorGenerator(new LinkedList<>(List.of("1", "", "3", "4", "5")));

    }
}
