public class LinkedList {
    Simpul pertama = null, posisi, pendahulu;

    public void isiData(String nim, String nama, int nilai) {
        Simpul ptrBaru = new Simpul(nim, nama, nilai);
        ptrBaru.berikutnya = pertama;
        pertama = ptrBaru;
    }

    public void TampilRantai() {
        System.out.println("[Isi Linked List]");
        posisi = pertama;
        while (posisi != null) {
            posisi.infoData();
            posisi = posisi.berikutnya;
        }
    }

    public boolean findData(String x) {
        posisi = pertama;
        pendahulu = null;
        boolean ditemukan = false;

        while (posisi != null) {
            if (posisi.nim.equals(x)) {
                ditemukan = true;
                break;
            }
            pendahulu = posisi;
            posisi = posisi.berikutnya;
        }

        return ditemukan;
    }

    public boolean hapusData(String x) {
        posisi = pertama;
        pendahulu = null;

        if (!findData(x)) {
            System.out.println("Data yang akan dihapus tidak ditemukan.");
            return false;
        }

        if (pendahulu == null) {
            pertama = posisi.berikutnya;
        } else {
            pendahulu.berikutnya = posisi.berikutnya;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Menambahkan data ke linked list
        list.isiData("123", "Alice", 90);
        list.isiData("124", "Bob", 85);
        list.isiData("125", "Charlie", 95);

        // Menampilkan data di linked list
        System.out.println("Sebelum penghapusan:");
        list.TampilRantai();

        // Mencari data
        System.out.println("Mencari NIM 124:");
        boolean ditemukan = list.findData("124");
        if (ditemukan) {
            System.out.println("Data ditemukan.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }

        // Menghapus data
        System.out.println("Menghapus NIM 124:");
        list.hapusData("124");

        // Menampilkan data setelah penghapusan
        System.out.println("Setelah penghapusan:");
        list.TampilRantai();
    }
}

class Simpul {
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
}
