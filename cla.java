public class cla {
    public static void main(String[] args) {
        System.out.println("\n\n\n for help , run \"java cla --help\" \n\n ");
        if (args.length == 0) {
            System.out.println("No arguments provided. To see help, run \"java cla --help\"");
            return;
        }
        for(String arg:args){
            if(arg.contains("--help")){
                System.out.println("\n\ncontent : this is a command line arugement example program  \n\nits all about string operations a single operand string will be calculated length \n\ndouble oprand will be concadinated\n\njust give us your input as like : java cla \"(arugment[s])\" \n\n ******** for more help, visit mrfaseed.github.io/java-cla/ ******** \n\n\n");
                System.exit(0);
            }
        }
        switch (args.length) {
            case 1 -> {
                System.out.println("Received single input: " + args[0]);
                System.out.println("Length: " + args[0].length());
            }
            case 2 -> {
                System.out.println("Received two inputs:");
                System.out.println("Input 1: " + args[0]);
                System.out.println("Input 2: " + args[1]);
                System.out.println("Concatenated result: " + args[0] + args[1]);
            }
            default -> System.out.println("Invalid number of arguments. To see help, run \"java cla --help\"");
        }
    }
}

