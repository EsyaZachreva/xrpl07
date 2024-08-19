public class Karyawan {
    int id;
    String nama;
    String unit;
    String alamat;

    public Karyawan(int id, String nama, String unit, String alamat) {
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;
    }
    public void printDong() {
        System.out.println();
        System.out.println("Nama: "+nama);
        System.out.println("Id: "+id);
        System.out.println("Unit: "+unit);
        System.out.println("Alamat: "+alamat);
        System.out.println();
    }

}
