import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        return new ArrayList<>(Arrays.asList(var));
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            ArrayList<String> result = myGetArgs(args);
            for (String s : result) {
                System.out.println(s);
            }
        }
    }
}
