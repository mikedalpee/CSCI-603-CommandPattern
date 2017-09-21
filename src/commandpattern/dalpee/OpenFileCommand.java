package commandpattern.dalpee;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import java.io.FileReader;

public class OpenFileCommand implements Command
{

    @Override
    public boolean execute(Context context) throws Exception
    {
        String fileName = (String)context.get("fileName");
        System.out.println("*Opening file "+fileName);

        try {
            FileReader fileReader = new FileReader(fileName);
            context.put("fileReader",fileReader);
        }
        catch (Exception e)
        {
            System.out.println("*FileReader error: "+e.getMessage());
            return true;
        }

        return false;
    }
}
