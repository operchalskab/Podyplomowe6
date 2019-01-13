public class UnchekedExcepiontTester {
    public static void main(String[] args) {
        UnchekedExcepiontTester unchekedExcepiontTester = new UnchekedExcepiontTester();
        int i = unchekedExcepiontTester.getNumberFromString("9");
        if (i != -1) {
            System.out.println("oto nasz liczba pomnożona przez 99" + (i*99));
        }
    }
    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            System.out.println("coś poszło nie tak, upewniej się że przekazywany string jest liczbą");
        }
        return -1;

    }
}