
public class Simpul {
    String nim;
    String nama;
    int nilai;
    Simpul berikutnya;

    public Simpul(String xnim, String xnama, int xnilai) {
        nim = xnim;
        nama = xnama;
        nilai = xnilai;
        berikutnya = null;
    }

    public void infoData() {
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("NILAI : " + nilai);
        System.out.println("Pointer Next : " + berikutnya);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        
        Simpul simpul1 = new Simpul("12345", "John Doe", 85);
    
        
        simpul1.infoData();
    }
}
