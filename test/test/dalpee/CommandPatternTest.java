package test.dalpee;

import commandpattern.dalpee.*;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

public class CommandPatternTest
{
    public static void main(String[] args) throws Exception {
        ContextBase context = new ContextBase();
        ChainBase chain = new ChainBase();

        chain.addCommand(
                new OpenFileCommand());
        chain.addCommand(
                new PrintFileCommand());
        chain.addCommand(
                new CloseFileCommand());

        context.put("fileName","test.txt");

        chain.execute(context);
    }
}
