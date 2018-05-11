package ObjectOrientedProgram;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){
        //langkah pertama kita panggil class PojoKaryawan
        //karena kita menggunakan constructor dengan paramater lengkap dari attribute maka diharuskan
        //mengisi paramater tersebut sesuai urutan yang tertera
        PojoKaryawan pojoKaryawan = new PojoKaryawan("Dian Setiyadi",new BigDecimal(900000),22,"S1 Teknik Informatika");

        //Kita ingin menampilkan nama dari objectPojo (pojoKaryawan)
        System.out.println(pojoKaryawan.getNama());
        //Kita ingin menampilkan umur dari objectPojo (pojoKaryawan)
        System.out.println(pojoKaryawan.getUmur());
        //Kita ingin menampilkan  gaji dari objectPojo (pojoKaryawan)
        System.out.println(pojoKaryawan.getSalary());
        //Kita ingin menampilkan pendidikan dari objectPojo (pojoKaryawan)
        System.out.println(pojoKaryawan.getPendidikan());
        //Kita ingin menampilkan semua attribute dari objectPojo (pojoKaryawan)
        System.out.println(pojoKaryawan.getNama()+" "+pojoKaryawan.getSalary()+" "+pojoKaryawan.getUmur()+" "+pojoKaryawan.getPendidikan());
    }
}
