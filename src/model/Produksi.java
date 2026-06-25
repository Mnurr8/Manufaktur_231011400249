package model;

public class Produksi {

    private int idProduksi;
    private String kodeProduk;
    private int jumlah;
    private String tanggalProduksi;
    private String status;

    public int getIdProduksi() {
        return idProduksi;
    }

    public void setIdProduksi(int idProduksi) {
        this.idProduksi = idProduksi;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getTanggalProduksi() {
        return tanggalProduksi;
    }

    public void setTanggalProduksi(String tanggalProduksi) {
        this.tanggalProduksi = tanggalProduksi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}