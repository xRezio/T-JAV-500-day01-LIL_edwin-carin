import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        for (String arg : args) {
            carList.add(arg);
            System.out.println(arg);
        }
    }
}
