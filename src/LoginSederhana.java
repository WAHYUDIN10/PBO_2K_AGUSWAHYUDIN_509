import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tambah dan simpan data dataa
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("Agus Wahyudin", "202410370110509");

        //tambah variabel dataa
        String adminUsername = "admin509";
        String adminPassword = "password509";

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        // masuk ke percabangan
        if (pilihan == 1) {
            //login admin
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine(); //digunakan kalo salah string
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // login siswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            //validasi dicocokkan dengan hashmap siswa
            if (mahasiswa.containsKey(nama) && mahasiswa.get(nama).equals(nim)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            } //jika diluar input 1 dan 2
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        scanner.close();
    }
}
