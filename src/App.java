import java.util.Scanner;

/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===Program Penarikan Uang===");
        Scanner u = new Scanner(System.in);
        System.out.print("Masukan Saldo Awal : ");
        int saldoAwal = u.nextInt();
        System.out.print("Jumlah uang yang di ambil : ");
        int ambilUang = u.nextInt();
        System.out.println("Saldo Anda Sekarang : " + (saldoAwal-ambilUang));

    }
}
