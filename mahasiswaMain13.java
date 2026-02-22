public class mahasiswaMain13 {
    public static void main(String[] args) {
        mahasiswa13 mhs1 = new mahasiswa13();
        mhs1.nama = "Jidan";
        mhs1.nim = "254107060095";
        mhs1.kelas = "SIB 1E";
        mhs1.ipk = 3.79;

        mhs1.tampilkanInformasi();
        System.out.println();
        mhs1.ubahKelas("SIB 2A");
        mhs1.updateIPK(4.0);
        mhs1.tampilkanInformasi();
    }
}
