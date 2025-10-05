import java.util.Scanner;
public class layananWifiGratis22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan keterangan (Dosen/Mahasiswa)");
        String jenisPengguna = input.next();

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Anda diberikan akses ke jaringan");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS anda");
            int sks = input.nextInt();
            if (sks >= 12) {
                System.out.println("Akses diberikan (Mahasiswa aktif)");
            } else {
                System.out.println("Gagal! jumlah SKS anda kurang dari 12");
            }
        } else {
            System.out.println("Gagal! akses tidsk diberikan");
        }

    }
}
         

