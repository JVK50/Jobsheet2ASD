public class mataKuliah13 {
    int sks;
    String namaMK;
    String kodeMK;
    int jumlahJam;

    public mataKuliah13() {
    }

    public mataKuliah13(String namaMK, String kodeMK, int sks, int jumlahJam) {
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam - jam >= 0) {
            jumlahJam -= jam;
        } else {
            System.out.println("Jumlah jam tidak bisa negatif.");
        }
    }



}
