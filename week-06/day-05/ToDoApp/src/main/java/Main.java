import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

    public static void main(String[] args) {
        PrintUsage help = new PrintUsage();
        ListTasks list = new ListTasks();
        NewTask addNew = new NewTask();
        RemoveTask remove = new RemoveTask();

        OptionParser parser = new OptionParser("la:r:u:");
        parser.accepts("l").isRequired();
        parser.accepts("a").isRequired();
        parser.accepts("r").isRequired();
        parser.accepts("u").isRequired();
        OptionSet options = parser.parse(args);

        if (!options.hasOptions()) {
            help.printHelp();
        } else if (!options.has("l") && !options.has("a") && !options.has("r")) {
            System.out.println("\nUnsupported argument\n");
            help.printHelp();
        } else if (options.has("l")) {
            list.taskPrint();
        } else if (options.has("a")) {
            addNew.taskAdd(args);
        } else if (options.has("r")) {
            remove.taskRemove(args);
        }
    }
}

//(!args[0].equals("-l")) && (!args[0].equals("-a")) && (!args[0].equals("-r")) && (!args[0].equals("-u"))