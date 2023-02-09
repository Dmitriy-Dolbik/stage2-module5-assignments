package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import assignments.annotations.FullNameProcessorGeneratorAnnotation;
import assignments.annotations.ListIteratorAnnotation;
import assignments.annotations.ReadFullProcessorNameAnnotation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalProcessor
{
    private String processorName;
    private Long period = 10_000_000_000_000L;
    protected String processorVersion;
    private Integer valueOfCheap;
    Scanner informationScanner;
    static List<String> stringArrayList = new LinkedList<>();

    public LocalProcessor(String processorName, Long period, String processorVersion, Integer valueOfCheap,
                          Scanner informationScanner, LinkedList<String> stringArrayList)
    {
        this.processorName = processorName;
        this.period = period;
        this.processorVersion = processorVersion;
        this.valueOfCheap = valueOfCheap;
        this.informationScanner = informationScanner;
        this.stringArrayList = stringArrayList;
    }

    public LocalProcessor()
    {
    }

    @ListIteratorAnnotation
    public void listIterator(List<String> stringList)
    {
        stringArrayList = new LinkedList<>(stringList);
        for (String element : stringList)
        {
            System.out.println(element.hashCode());
        }
    }

    @FullNameProcessorGeneratorAnnotation
    public String fullNameProcessorGenerator(List<String> stringList)
    {
        for (String element : stringList)
        {
            processorName += element + ' ';
        }
        return processorName;
    }

    @ReadFullProcessorNameAnnotation
    public void readFullProcessorName(File file) throws FileNotFoundException
    {
        try(Scanner scanner=new Scanner(file)){
            informationScanner = scanner;
            while(informationScanner.hasNext()){
                processorVersion += informationScanner.nextLine();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
