import java.util.Scanner;
public class sistemperpustakaan22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukka keterangan dibuku absensi");
        System.out.println("Apakah anda membawa KTM (True/false)");
        boolean MembawKtm = input.nextBoolean();
    

        boolean diberiAkses = MembawKtm;

        System.out.println(" -- Cek Syarat Masuk Perpustakaan");
        System.out.println("Status Kartu Mahasiswa: " + (MembawKtm ? "Ada" : " Tizdak Ada"));

        if (diberiAkses) {
            System.out.println("Keputusan: ANDA DIIZINKAN MASUKPERPUSTAKAAN");
            System.out.println("selamat datang!");
        } else {
            System.out.println("Keputusan: ANDA TIDAK DIIIZINKAN MASUK PERPUSTAKAAN");
            System.out.println("Mohon lengkapi syarat (Kartu mahasiswa atau kartu mahasiswa berbentuk dokumen)");
        }

        //
    }
}
