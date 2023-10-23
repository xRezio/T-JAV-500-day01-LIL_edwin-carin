public class Ex06 {
    public static void sequence(int nbr) {
        if (nbr < 0) {
            return;
        }

        String term = "1";
        System.out.println(term);

        for (int i = 0; i < nbr; i++) {
            term = getNextTerm(term);
            System.out.println(term);
        }
    }

    private static String getNextTerm(String term) {
        StringBuilder nextTerm = new StringBuilder();
        char[] chars = term.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                i++;
                count++;
            }
            nextTerm.append(count).append(chars[i]);
        }

        return nextTerm.toString();
    }

    public static void main(String[] args) {
        if (args.length > 0) {
                int nbr = Integer.parseInt(args[0]);
                sequence(nbr);
    }
}
}