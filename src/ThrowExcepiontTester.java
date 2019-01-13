public class ThrowExcepiontTester {
    public static void main(String[] args) {
        ThrowExcepiontTester throwExcepiontTester = new ThrowExcepiontTester();

        int hours = -3;
        int numberofSeconds = 0;

        try {
            numberofSeconds = throwExcepiontTester.getNumberofSeconds(hours);
        } catch (IllegalArgumentException iae){
            numberofSeconds = throwExcepiontTester.getNumberofSeconds(hours * -1);
        }

        System.out.println("Liczba sekund to: " + numberofSeconds);
    }

    public int getNumberofSeconds(int hours){
        if (hours < 0){
            throw new IllegalArgumentException("Liczba godzin musi być >=0" + hours);
        }
        return hours * 60 * 60;
    }
}
