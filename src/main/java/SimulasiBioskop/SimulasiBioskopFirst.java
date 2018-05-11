package SimulasiBioskop;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SimulasiBioskopFirst {

    public static void main(String[] args) {

        int switchChoice = 0;
        System.out.println("");
        System.out.println("----Selamat Datang-----");
        System.out.println("List Bioskop Kesukaan Anda");
        System.out.println("1. Blok M Square");
        System.out.println("2. Gandaria");
        System.out.println("3. Pondok Indah Mall");
        System.out.println("4. Senayan");
        System.out.println("Pilih Bioskop Kesukaan Anda");
        try {
            Scanner scanner = new Scanner(System.in);
            switchChoice = scanner.nextInt();
            switch (switchChoice) {
                case 1:
                    BIOSKOP_BLOK_M();
                    break;
                case 2:
                    BIOSKOP_GANDARIA();
                    break;
                case 3:
                    BIOSKOP_PONDOK_INDAH_MALL();
                    break;
                case 4:
                    BIOSKOP_SENAYAN();
                    break;
                default:
                    System.out.println("Silahkan Pilih Sesuai Yang Tersedia");
                    main(null);
            }
        } catch (InputMismatchException e){
            System.out.println("Isi lah dengan yang ada list!!");
            main(null);
        }
    }

    public static void BIOSKOP_BLOK_M(){

        String choice;
        Double hargaTemp;
        final String  TAMBAH_TIKET_YES = "YES";
        final String  TAMBAH_TIKET_NO = "NO";

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("'IDR.'##,###.##");
        List<String> daftarTiket = new ArrayList<String>();
        List<Double> hargaTiket = new ArrayList<Double>();
        String tambahMenu = "";
        int konstMenu = 1;

        double totalHarga = 0.0;
        do {
            System.out.println("Selamat Datang Di Applikasi Informasi");
            System.out.println("---------Harga Bioskop Blok M Square----------");

            System.out.println("List Film Hari ini :");
            System.out.println("1.Avenger");
            System.out.println("2.Final Destination");
            System.out.println("3.Terminator");
            System.out.println("4.AADC2");
            System.out.println("5.Titanic");

            System.out.println("Pilih No Film :");
            choice = scanner.next();

            if (choice.equals("1")) {
                hargaTemp = 100000.00;
                System.out.println("Avenger Dengan Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Avenger");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("2")) {
                hargaTemp = 50000.00;
                System.out.println("Final Destination Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Final Destination");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("3")) {
                hargaTemp = 40000.000;
                System.out.println("Terminator Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Terminator");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("4")) {
                hargaTemp = 35000.00;
                System.out.println("AADC2 Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("ADDC2");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("5")) {
                hargaTemp = 20000.00;
                System.out.println("Titanic Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Titanic");
                hargaTiket.add(hargaTemp);
            } else {
                System.out.println("No Yang Anda Pilih Tidak Ada ....!");
                return;
            }
            boolean isTypo = false;
            do {
                System.out.println("Apakah anda ingin membeli tiket lagi (YES/NO)");
                tambahMenu = scanner.next();
                if(TAMBAH_TIKET_YES.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu =1;
                }else if(TAMBAH_TIKET_NO.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu = 0;
                }else {
                    System.out.println("Jangan Typo Periksa Kembali ...!");
                }
            } while (!isTypo);
        } while (1==konstMenu);
        System.out.println("Total Pembelian Pada Bioskop Blok M");
        int noIndex = 0;
        for (int i = 0; i <daftarTiket.size();i++){
            noIndex++;
            System.out.println(noIndex+". "+daftarTiket.get(i) +" "+ decimalFormat.format(hargaTiket.get(i)));
            totalHarga = totalHarga + hargaTiket.get(i).intValue();
        }
        System.out.println("Total Harga "+decimalFormat.format(totalHarga));
        System.out.println("Jumlah Tiket "+daftarTiket.size());
    }

    public static void BIOSKOP_PONDOK_INDAH_MALL(){
        String choice;
        Double hargaTemp;
        final String  TAMBAH_TIKET_YES = "YES";
        final String  TAMBAH_TIKET_NO = "NO";

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("'IDR.'##,###.##");
        List<String> daftarTiket = new ArrayList<String>();
        List<Double> hargaTiket = new ArrayList<Double>();
        String tambahMenu = "";
        int konstMenu = 1;

        double totalHarga = 0.0;
        do {
            System.out.println("Selamat Datang Di Applikasi Informasi");
            System.out.println("---------Harga Bioskop Pondok Indah Mall----------");

            System.out.println("List Film Hari ini :");
            System.out.println("1.Avenger");
            System.out.println("2.Final Destination");
            System.out.println("3.Terminator");
            System.out.println("4.AADC2");
            System.out.println("5.Titanic");

            System.out.println("Pilih No Film :");
            choice = scanner.next();

            if (choice.equals("1")) {
                hargaTemp = 100000.00;
                System.out.println("Avenger Dengan Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Avenger");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("2")) {
                hargaTemp = 50000.00;
                System.out.println("Final Destination Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Final Destination");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("3")) {
                hargaTemp = 40000.000;
                System.out.println("Terminator Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Terminator");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("4")) {
                hargaTemp = 35000.00;
                System.out.println("AADC2 Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("ADDC2");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("5")) {
                hargaTemp = 20000.00;
                System.out.println("Titanic Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Titanic");
                hargaTiket.add(hargaTemp);
            } else {
                System.out.println("No Yang Anda Pilih Tidak Ada ....!");
                return;
            }
            boolean isTypo = false;
            do {
                System.out.println("Apakah anda ingin membeli tiket lagi (YES/NO)");
                tambahMenu = scanner.next();
                if(TAMBAH_TIKET_YES.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu =1;
                }else if(TAMBAH_TIKET_NO.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu = 0;
                }else {
                    System.out.println("Jangan Typo Periksa Kembali ...!");
                }
            } while (!isTypo);
        } while (1==konstMenu);
        System.out.println("Total Pembelian Pada Bioskop Pondok Indah Mall");
        int noIndex = 0;
        for (int i = 0; i <daftarTiket.size();i++){
            noIndex++;
            System.out.println(noIndex+". "+daftarTiket.get(i) +" "+ decimalFormat.format(hargaTiket.get(i)));
            totalHarga = totalHarga + hargaTiket.get(i).intValue();
        }
        System.out.println("Total Harga "+decimalFormat.format(totalHarga));
        System.out.println("Jumlah Tiket "+daftarTiket.size());
    }

    public static void BIOSKOP_GANDARIA(){
        String choice;
        Double hargaTemp;
        final String  TAMBAH_TIKET_YES = "YES";
        final String  TAMBAH_TIKET_NO = "NO";

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("'IDR.'##,###.##");
        List<String> daftarTiket = new ArrayList<String>();
        List<Double> hargaTiket = new ArrayList<Double>();
        String tambahMenu = "";
        int konstMenu = 1;

        double totalHarga = 0.0;
        do {
            System.out.println("Selamat Datang Di Applikasi Informasi");
            System.out.println("---------Harga Bioskop Gandaria----------");

            System.out.println("List Film Hari ini :");
            System.out.println("1.Avenger");
            System.out.println("2.Final Destination");
            System.out.println("3.Terminator");
            System.out.println("4.AADC2");
            System.out.println("5.Titanic");

            System.out.println("Pilih No Film :");
            choice = scanner.next();

            if (choice.equals("1")) {
                hargaTemp = 100000.00;
                System.out.println("Avenger Dengan Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Avenger");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("2")) {
                hargaTemp = 50000.00;
                System.out.println("Final Destination Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Final Destination");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("3")) {
                hargaTemp = 40000.000;
                System.out.println("Terminator Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Terminator");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("4")) {
                hargaTemp = 35000.00;
                System.out.println("AADC2 Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("ADDC2");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("5")) {
                hargaTemp = 20000.00;
                System.out.println("Titanic Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Titanic");
                hargaTiket.add(hargaTemp);
            } else {
                System.out.println("No Yang Anda Pilih Tidak Ada ....!");
                return;
            }
            boolean isTypo = false;
            do {
                System.out.println("Apakah anda ingin membeli tiket lagi (YES/NO)");
                tambahMenu = scanner.next();
                if(TAMBAH_TIKET_YES.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu =1;
                }else if(TAMBAH_TIKET_NO.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu = 0;
                }else {
                    System.out.println("Jangan Typo Periksa Kembali ...!");
                }
            } while (!isTypo);
        } while (1==konstMenu);
        System.out.println("Total Pembelian Pada Bioskop Gandaria");
        int noIndex = 0;
        for (int i = 0; i <daftarTiket.size();i++){
            noIndex++;
            System.out.println(noIndex+". "+daftarTiket.get(i) +" "+ decimalFormat.format(hargaTiket.get(i)));
            totalHarga = totalHarga + hargaTiket.get(i).intValue();
        }
        System.out.println("Total Harga "+decimalFormat.format(totalHarga));
        System.out.println("Jumlah Tiket "+daftarTiket.size());
    }
    public static void BIOSKOP_SENAYAN(){
        String choice;
        Double hargaTemp;
        final String  TAMBAH_TIKET_YES = "YES";
        final String  TAMBAH_TIKET_NO = "NO";

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("'IDR.'##,###.##");
        List<String> daftarTiket = new ArrayList<String>();
        List<Double> hargaTiket = new ArrayList<Double>();
        String tambahMenu = "";
        int konstMenu = 1;

        double totalHarga = 0.0;
        do {
            System.out.println("Selamat Datang Di Applikasi Informasi");
            System.out.println("---------Harga Bioskop Senayan----------");

            System.out.println("List Film Hari ini :");
            System.out.println("1.Avenger");
            System.out.println("2.Final Destination");
            System.out.println("3.Terminator");
            System.out.println("4.AADC2");
            System.out.println("5.Titanic");

            System.out.println("Pilih No Film :");
            choice = scanner.next();

            if (choice.equals("1")) {
                hargaTemp = 100000.00;
                System.out.println("Avenger Dengan Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Avenger");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("2")) {
                hargaTemp = 70000.00;
                System.out.println("Final Destination Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Final Destination");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("3")) {
                hargaTemp = 90000.000;
                System.out.println("Terminator Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Terminator");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("4")) {
                hargaTemp = 35000.00;
                System.out.println("AADC2 Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("ADDC2");
                hargaTiket.add(hargaTemp);
            } else if (choice.equals("5")) {
                hargaTemp = 40000.00;
                System.out.println("Titanic Harga Tiket " + decimalFormat.format(hargaTemp));
                daftarTiket.add("Titanic");
                hargaTiket.add(hargaTemp);
            } else {
                System.out.println("No Yang Anda Pilih Tidak Ada ....!");
                return;
            }
            boolean isTypo = false;
            do {
                System.out.println("Apakah anda ingin membeli tiket lagi (YES/NO)");
                tambahMenu = scanner.next();
                if(TAMBAH_TIKET_YES.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu =1;
                }else if(TAMBAH_TIKET_NO.equals(tambahMenu)){
                    isTypo = true;
                    konstMenu = 0;
                }else {
                    System.out.println("Jangan Typo Periksa Kembali ...!");
                }
            } while (!isTypo);
        } while (1==konstMenu);
        System.out.println("Total Pembelian Pada Bioskop Senayan");
        int noIndex = 0;
        for (int i = 0; i <daftarTiket.size();i++){
            noIndex++;
            System.out.println(noIndex+". "+daftarTiket.get(i) +" "+ decimalFormat.format(hargaTiket.get(i)));
            totalHarga = totalHarga + hargaTiket.get(i).intValue();
        }
        System.out.println("Total Harga "+decimalFormat.format(totalHarga));
        System.out.println("Jumlah Tiket "+daftarTiket.size());

    }
}
