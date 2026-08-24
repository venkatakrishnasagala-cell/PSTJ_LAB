import java.util.*;

class BoyerMooreAlgorithm {

    static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] badChar = new int[256];

        for (int i = 0; i < 256; i++)
            badChar[i] = -1;

        for (int i = 0; i < m; i++)
            badChar[pattern.charAt(i)] = i;

        int shift = 0;

        while (shift <= n - m) {
            int j = m - 1;

            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j))
                j--;

            if (j < 0)
                return shift;

            shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter DNA sequence: ");
        String dna = sc.nextLine();

        System.out.print("Enter DNA pattern: ");
        String pattern = sc.nextLine();

        int result = search(dna, pattern);

        if (result != -1)
            System.out.println("Pattern found at position: " + result);
        else
            System.out.println("Pattern not found");

        sc.close();
    }
}
