import java.util.Scanner;

public class tugasFlowchart {
    public static void main(String[] args) {
      
        Scanner sc =  new Scanner(System.in);

        System.out.println("Angka");
        int angka = sc.nextInt();

        if (angka  %2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
