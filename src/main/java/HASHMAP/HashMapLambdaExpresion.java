package HASHMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapLambdaExpresion {

    public static void main(String args[]) {
        HashMap<Integer,String> nipKaryawan = new HashMap<Integer, String>();
        List<String> listNamaKaryawan = new ArrayList<String>();

        listNamaKaryawan.add("Dian Setiyadi");
        listNamaKaryawan.add("Dadang Suparman");
        listNamaKaryawan.add("Ilham");
        listNamaKaryawan.add("Mark Zurberg");


        int aIncrement = 1000;
        for (int i = 0;i<listNamaKaryawan.size();i++) {

            aIncrement++;
            nipKaryawan.put(aIncrement,listNamaKaryawan.get(i));
        }
        nipKaryawan.forEach((nip, karyawan)->{
            System.out.println("NIP : "+nip+" ,Karyawan : "+karyawan);
        });
        System.out.println(nipKaryawan);
    }
}
