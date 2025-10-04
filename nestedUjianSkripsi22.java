import java.util.Scanner;
public class nestedUjianSkripsi22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("Apakah mahasiwa sudah bebas komen? (Ya/Tidak); ");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pendamping 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "semua syarat terpenuhi. Mahasiswa boleh mendaftra ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! log bimbingn P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8){
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali.";
            } else {
                pesan = "Gagal! log bimbingan P2 kurang dari 4 kali.";
            }
        } else {
            pesan ="Gagal! Mahasiswa masih memiliki tangungan kompen";
        }

        System.out.print(pesan);
        sc.close();
    }
}
