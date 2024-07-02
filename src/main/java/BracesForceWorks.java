public class BracesForceWorks {

    public static void main(String[] args) {

        int n = 8;

        if (n < 2) return;
        char[] chrs = new char[n];

        for (int i = 0; i < n / 2; i++) {
            chrs[i] = '(';
        }
        for (int i = n / 2; i < n; i++) {
            chrs[i] = ')';
        }
        System.out.println(chrs);

        do {
            int i = n - 1;
            int c = 0;

            while (i >= 0) {
                c += chrs[i] == ')' ? -1 : 1;
                if ((c < 0) && (chrs[i] == '(')) break;
                --i;
            }

            if (i < 0) break;

            chrs[i++] = ')';
            int ind = i;

            for (; i < n; i++) {
                chrs[i] = (i <= (n - ind + c) / 2 + ind) ? '(' : ')';
            }

            System.out.println(chrs);
        } while (true);
    }
}
