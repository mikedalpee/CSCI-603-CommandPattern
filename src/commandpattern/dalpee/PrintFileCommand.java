package commandpattern.dalpee;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintFileCommand implements Command
{
    public boolean execute(Context context) throws Exception
    {
        System.out.println("*Printing file "+context.get("fileName"));

        BufferedReader br = new BufferedReader((FileReader)context.get("fileReader"));

        String currentLine;

        while ((currentLine = br.readLine()) != null) {
            System.out.println(currentLine);
        }

        return false;
    }
}
