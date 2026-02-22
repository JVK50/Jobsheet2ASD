public class dosenMain13 {
    public static void main(String[] args) {
        dosen13 dosen1 = new dosen13();
        dosen1.idDosen = "0014088502";
        dosen1.nama = "Dr. Ir. H. Lorem Ipsum, M.T.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Teknik Informatika";

        dosen1.tampilInformasi();
        System.out.println();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Sistem Informasi");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");

        dosen13 dosen2 = new dosen13("0014088503", "Dr. Ir. H. Dolor Sit Amet, M.T.", true, 2015, "Rekayasa Perangkat Lunak");
        dosen2.tampilInformasi();
        System.out.println();
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Manajemen Proyek");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2024) + " tahun");

    }
}
