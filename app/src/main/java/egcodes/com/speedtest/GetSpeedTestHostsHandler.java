package egcodes.com.speedtest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class GetSpeedTestHostsHandler extends Thread {

    HashMap<Integer, String> mapKey = new HashMap<>();
    HashMap<Integer, List<String>> mapValue = new HashMap<>();
    double selfLat = 0.0;
    double selfLon = 0.0;
    boolean finished = false;


    public HashMap<Integer, String> getMapKey() {
        return mapKey;
    }

    public HashMap<Integer, List<String>> getMapValue() {
        return mapValue;
    }

    public double getSelfLat() {
        return selfLat;
    }

    public double getSelfLon() {
        return selfLon;
    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public void run() {
        //Get latitude, longitude
        selfLat = 23.108303;
        selfLon = -82.440648;

        String uploadAddress = "https://www.etecsa.cu//images/micubacel.mp4";
        String name = "ETECSA";
        String country = "Cuba";
        String cc = "CU";
        String sponsor = "ETECSA";
        String lat = "23.108303";
        String lon = "-82.440648";
        String host = "www.etecsa.cu";


        //Best server
        int count = 0;
        List<String> ls = Arrays.asList(lat, lon, name, country, cc, sponsor, host);
        mapKey.put(count, uploadAddress);
        mapValue.put(count, ls);

        finished = true;
    }
}
