import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

    public static void main(String[] args) {
        PrintUsage help = new PrintUsage();
        ListTasks list = new ListTasks();
        NewTask addNew = new NewTask();
        RemoveTask remove = new RemoveTask();

        OptionParser parser = new OptionParser();
        parser.accepts("l");
        parser.accepts("a");
        parser.accepts("r");
        parser.accepts("u");
        //parser.accepts("a").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("a")) {
            addNew.taskAdd(args);
            //System.out.println("`-a` was given with the argument " + options.valueOf("a"));
        }

        if (options.has("l")) {
            list.taskPrint();
            //System.out.println("`-l` was given with the no additional information.");
        }


        if (args.length == 0) {
            help.printHelp();
        } else if ((!args[0].equals("-l")) && (!args[0].equals("-a")) && (!args[0].equals("-r")) && (!args[0].equals("-u"))) {
            System.out.println("\nUnsupported argument\n");
            help.printHelp();
        } /*else if ((args[0].equals("-l"))) {
            list.taskPrint();
        } else if ((args[0].equals("-a"))) {
            addNew.taskAdd(args);
        }*/ else if ((args[0].equals("-r"))) {
            remove.taskRemove(args);
        }

    }
}