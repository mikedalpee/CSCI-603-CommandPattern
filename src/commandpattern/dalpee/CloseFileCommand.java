package commandpattern.dalpee;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import java.io.FileReader;

public class CloseFileCommand implements Command
{
    public boolean execute(Context context) throws Exception
    {
        System.out.println("*Closing file "+context.get("fileName"));

       ((FileReader)context.get("fileReader")).close();

        return false;
    }
}
