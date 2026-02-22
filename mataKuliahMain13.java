public class mataKuliahMain13 {
    public static void main(String[] args) {
        mataKuliah13 mk1 = new mataKuliah13();
        mk1.namaMK = "Basis Data";
        mk1.kodeMK = "SIB001";
        mk1.sks = 3;
        mk1.jumlahJam = 48;

        mk1.tampilkanInformasi();
        System.out.println();
        mk1.ubahSKS(4);
        mk1.tambahJam(16);
        mk1.tampilkanInformasi();
        mk1.kurangiJam(7);
        System.out.println();
        mk1.tampilkanInformasi();


        mataKuliah13 mk2 = new mataKuliah13("Algoritma dan Pemrograman", "SIB002", 3, 48);
        mk2.tampilkanInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(16);
        System.out.println();
        mk2.tampilkanInformasi();
        mk2.kurangiJam(10);
        System.out.println();
        mk2.tampilkanInformasi();
    }
}
