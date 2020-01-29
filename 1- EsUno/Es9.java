import java.util.ArrayList;

class Es9_1 {
    public static boolean scan(String s) {
        int state = 0;
        int i = 0;
        while (state >= 0 && i < s.length()) {
            final char ch = s.charAt(i++);
            switch (state) {
                case 0:
                    if (ch == 'f' || ch == 'F')
                        state = 1;
                    else if (ch != 'F' && ch != 'f')
                        state = 7;
                    else
                        state = -1;
                    break;

                case 1:
                    if (ch == 'l' || ch == 'L')
                        state = 2;
                    else if (ch != 'l' && ch != 'L')
                        state = 8;
                    else
                        state = -1;
                    break;

                case 2:
                    if (ch == 'O' || ch == 'o')
                        state = 3;
                    else if (ch != 'o' && ch != 'O')
                        state = 9;
                    else
                        state = -1;
                    break;

                case 3:
                    if (ch == 'R' || ch == 'r')
                        state = 4;
                    else if (ch != 'r' && ch != 'R')
                        state = 10;
                    else
                        state = -1;
                    break;

                case 4:
                    if (ch == 'i' || ch == 'I')
                        state = 5;
                    else if (ch != 'i' && ch != 'I')
                        state = 11;
                    else
                        state = -1;
                    break;

                case 5:
                    if (ch == 'a' || ch == 'A')
                        state = 6;
                    else if (ch != 'A' && ch != 'a')
                        state = 12;
                    else
                        state = -1;
                    break;

                case 6:
                    boolean accettoqualsiasicarattere = true;
                    if (accettoqualsiasicarattere)
                        state = 13;
                    else
                        state = -1;
                    break;



                case 7:
                    if (ch == 'l' || ch == 'L')
                        state = 8;
                    else
                        state = -1;
                    break;

                case 8:
                    if (ch == 'o' || ch == 'O')
                        state = 9;
                    else
                        state = -1;
                    break;

                case 9:
                    if (ch == 'r' || ch == 'R')
                        state = 10;
                    else
                        state = -1;
                    break;

                case 10:
                    if (ch == 'i' || ch == 'I')
                        state = 11;
                    else
                        state = -1;
                    break;

                case 11:
                    if (ch == 'a' || ch == 'A')
                        state = 12;
                    else
                        state = -1;
                    break;

                case 12:
                    if (ch == 'n' || ch == 'N')
                        state = 13;
                    else
                        state = -1;
                    break;

            }

        }
        return state == 13;
    }
    public static void main(String[] args) {
        ArrayList < String > tests = new ArrayList < String > ();
        tests.add("florian");
        tests.add("floriun");
        tests.add("floriai");
        tests.add("flori-n");
        tests.add("foorian");
        tests.add("flopian");
        tests.add("florion");



        for (String s: tests)
            System.out.println("Test su " + s + ": " + (scan(s) ? "accettato" : "rifiutato"));
    }
}