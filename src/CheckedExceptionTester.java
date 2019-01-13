import java.net.URL;
import java.net.MalformedURLException;

public class CheckedExceptionTester {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionTester checkedExceptionTester = new CheckedExceptionTester();
      //  checkedExceptionTester.urlTesterByTryCatch("aaaahttp://wszib.edu.pl");
        checkedExceptionTester.urlTesterByThrows("aaaahttp://wszib.edu.pl");



    }
    public void urlTesterByTryCatch(String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host:" +url.getHost());
        } catch (MalformedURLException murle){
            murle.printStackTrace();
        }
    }

public void urlTesterByThrows(String urlStr) throws MalformedURLException{
    URL url = new URL(urlStr);
    System.out.println("Protocol: " + url.getProtocol());
    System.out.println("Host:" +url.getHost());
}

}
