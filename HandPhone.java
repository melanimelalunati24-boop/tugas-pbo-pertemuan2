public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    // Method untuk mengisi data (Setter)
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Method untuk mengambil jenis HP (Getter)
    public String getJenisHP() {
        return jenis_hp;
    }

    // Method untuk mengambil tahun pembuatan (Getter)
    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        // Membuat object baru
        HandPhone hp = new HandPhone();
        
        // Mengisi data ke object
        hp.setDataHP("Smartphone Android", 2024);
        
        // Menampilkan hasil ke layar
        System.out.println("Jenis Handphone   : " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan   : " + hp.getTahunPembuatan());
    }
}