public class Main {

    public static void main(String[] args) {
        PrintUsage help = new PrintUsage();
        ListTasks list = new ListTasks();
        NewTask addNew = new NewTask();

        if (args.length == 0) {                                                                        //print usage
            help.printHelp();
        } else if ((!args[0].equals("-l")) && (!args[0].equals("-a")) && (!args[0].equals("-r"))) {    //argument error handling
            System.out.println("\nUnsupported argument\n");
            help.printHelp();
        } else if ((args[0].equals("-l"))) {                                                           //print to list and empty list error handling
            list.taskPrint();
        } else if ((args[0].equals("-a"))) {                                                           //add new task and new task error handling
            addNew.taskAdd(args);
        }

    }it a
}
