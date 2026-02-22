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
        
        mahasiswa13 mhs2 = new mahasiswa13("Dina", "254107060096", "SIB 1E", 3.5);
        mhs2.updateIPK(3.30);
        System.out.println();
        mhs2.tampilkanInformasi();

        mahasiswa13 mhs3 = new mahasiswa13("Rina", "254107060097", "SIB 1E", 2.5);
        mhs3.updateIPK(3.0);
        System.out.println();
        mhs3.tampilkanInformasi();
    }
}
