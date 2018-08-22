package STREAM;

import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileLineToLineWithStream {

    public static void main(String args[]) {
        String pathFile = "G:/Testter/test.csv";
        List<String> list = new ArrayList<>();
        List<String> listAfterSplit = new ArrayList<>();

        try(Stream<String> stream = Files.lines(Paths.get(pathFile))) {
            list = stream.filter(line-> !line.startsWith("AccountNo"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());


                String temptSplit[] = StringUtils.splitString(list.get(0).toString(),"|");
                System.out.println("WHAT : "+temptSplit[0]);
                String accountNo = temptSplit[0];


            System.out.println(accountNo);
            for (String tests: temptSplit) {
                System.out.print(tests.trim());

            }
            System.out.println("");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        list.forEach(System.out::println);
    }
}
