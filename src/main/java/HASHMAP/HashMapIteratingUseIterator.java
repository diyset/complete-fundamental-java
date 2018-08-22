package HASHMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapIteratingUseIterator {
    public static void main(String args[]) {
        HashMap<Integer, String> nipKaryawan = new HashMap<Integer, String>();
        List<String> listNamaKaryawan = new ArrayList<String>();

        listNamaKaryawan.add("Dian Setiyadi");
        listNamaKaryawan.add("Dadang Suparman");
        listNamaKaryawan.add("Ilham");
        listNamaKaryawan.add("Mark Zurberg");


        int aIncrement = 1000;
        for (int i = 0; i < listNamaKaryawan.size(); i++) {

            aIncrement++;
            nipKaryawan.put(aIncrement, listNamaKaryawan.get(i));
        }

        for (Map.Entry<Integer, String> entry : nipKaryawan.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}

