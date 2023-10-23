public class Ex02 {
    public static String getAngryDog(int nbr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nbr; i++) {
            result.append("woof");
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        String result = Ex02.getAngryDog(3);
        System.out.print(result);
    }
}
