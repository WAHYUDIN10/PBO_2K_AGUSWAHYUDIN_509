public class Hewan {
    //Atribut(data)
    String nama;
    String jenis;
    String suara;
    int jumlah;

    //Constructor
    public Hewan(String nama, String jenis, String suara, int jumlah) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
        this.jumlah = jumlah;
    }

    //Method
    public void tampilkanInfo() {
        System.out.println("nama = " + nama);
        System.out.println("jenis = " + jenis);
        System.out.println("suara = " + suara);
        System.out.println("jumlah = " + jumlah);
    }
}