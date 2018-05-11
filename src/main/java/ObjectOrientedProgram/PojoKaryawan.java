package ObjectOrientedProgram;

import java.math.BigDecimal;

public class PojoKaryawan {

    //Class ini untuk mendeklarasikan attribute yang terdapat pada Class PojoKaryawan
    //Seperti Nama, Salary, Umur, Pendidikan, dll

    private String nama;
    private BigDecimal salary;
    private int umur;
    private  String pendidikan;

    //Kalian Bisa menggunakan Constructor karena dapat mempermudah bila mendeklarasikan
    public PojoKaryawan(String nama, BigDecimal salary, int umur, String pendidikan) {
        this.nama = nama;
        this.salary = salary;
        this.umur = umur;
        this.pendidikan = pendidikan;
    }

    //Jangan lupa membuat Setter/Getter
    //Bila ingin menggunakan method constructor saja cukup bikin getter saja
    //tapi saya sarankan gunakan juga setter karena constructor itu flexibel bisa dibuat banyak paramater sesuai kebutuhan

    //Contoh ini constructor tanpa ada paramater sama saja seperti membuat object baru tanpa harus masukan paramter secara langsung
    //Dengan ini bisa menggunakan setter untuk pengisian attribute pada class object PojoKaryawan
    public PojoKaryawan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
}
