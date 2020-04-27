package Input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements InterfaceInput {
    List<String> fileContent = new ArrayList<>();

    public void readFile() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        int i = 0;
        int j = 0;
        System.out.println("Try a sample file");
        FileReader samplefile = null;
        samplefile = new FileReader("/Users/sree.vidhya/SecondPart/PaySlip/InputFile");
        Scanner filescanner = new Scanner(samplefile);

        String myFileLines = null;
        while (filescanner.hasNext()) {
            myFileLines = filescanner.nextLine();
            fileContent.add(myFileLines);
        }
    }

    @Override
    public String firstName() {
        return fileContent.get(0);
    }

    @Override
    public String lastName() {
        return fileContent.get(1);
    }

    @Override
    public String salary() {
        return fileContent.get(2);
    }

    @Override
    public String superRate() {
        return fileContent.get(3);
    }

    @Override
    public String startDate() {
        return fileContent.get(4);
    }

    @Override
    public String endDate() {
        return fileContent.get(5);
    }
}

