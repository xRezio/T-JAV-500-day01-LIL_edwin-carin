import java.util.ArrayList;

public class Ex03 {
    public static void printArray(ArrayList<String> myArray) {
        for (String element : myArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        for (String arg : args) {
            carList.add(arg);
        }

        Ex03.printArray(carList);
    }
}
