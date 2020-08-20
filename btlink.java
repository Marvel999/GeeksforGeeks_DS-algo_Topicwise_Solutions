import sun.misc.IOUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URL;


public class btlink {
    public static void main(String[] args) throws IOException {
        URL address=new URL("https://trib.al/Jxo8QPM");


        //Connect & check for the location field
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) address.openConnection(Proxy.NO_PROXY);
            connection.setInstanceFollowRedirects(false);
            connection.connect();
            String expandedURL = connection.getHeaderField("Location");
            if(expandedURL != null) {
                URL expanded = new URL(expandedURL);
                address= expanded;
            }
        } catch (Throwable e) {
            System.out.println("Problem while expanding {}"+ address+ e);
        } finally {
            if(connection != null) {
                System.out.println(connection.getInputStream());
            }
        }

        System.out.println("Original URL:- "+address);
    }



}







