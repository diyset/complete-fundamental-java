package STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToUppercase {

    public static void main(String args[]) {
        List<String> alpha = Arrays.asList("a","b","c","d");

        //Sebelum JAVA 8
        List<String> alphaBefore = new ArrayList<>();
        for (String listAlphas : alpha) {
            alphaBefore.add(listAlphas);
        }
        System.out.println(alpha);
        System.out.println(alphaBefore);
        //Java 8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("stream map to uppercase : "+collect);
        //Extra, streams apply to any data type
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        List<Integer> dikaliDua = number.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(dikaliDua);
    }

}
