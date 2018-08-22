package MAP;

public class MainMap {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("900002","Rizlah","Teknik Informatika");

        System.out.println("Nama Mahasiswa = "+mahasiswa1.getNama());
        System.out.println("Nim Mahasiswa = "+mahasiswa1.getNim());
        System.out.println("Jurusan Mahasiswa = "+mahasiswa1.getJurusan());

    }
}
