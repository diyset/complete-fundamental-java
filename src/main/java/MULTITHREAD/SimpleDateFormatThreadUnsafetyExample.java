package MULTITHREAD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDateFormatThreadUnsafetyExample {

    public static void main(String args[]) {
        final String dateStr = "2018-06-22T10:00:00";

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable task = new Runnable() {
            public void run() {
                parseDate(dateStr);
            }
        };
        for(int i = 0; i < 10; i++) {
            executorService.submit(task);
        }


        executorService.shutdown();

    }

    private static void parseDate(String dateStr) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date date = simpleDateFormat.parse(dateStr);
            System.out.println("Successfully Parsed Date "+ date);

        } catch (ParseException ex) {
            System.out.println("Parse Error "+dateStr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
