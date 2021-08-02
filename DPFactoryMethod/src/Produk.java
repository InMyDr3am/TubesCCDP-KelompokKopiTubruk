public class Produk {
    private String namaProduk;
    private String hargaProduk;
    private String warnaProduk;

    public Produk(String namaProduk, String hargaProduk, String warnaProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.warnaProduk = warnaProduk;
    }

    public Produk(String namaProduk) {
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(String hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public String getWarnaProduk() {
        return warnaProduk;
    }

    public void setWarnaProduk(String warnaProduk) {
        this.warnaProduk = warnaProduk;
    }

    @Override
    public String toString(){
        return this.namaProduk+this.hargaProduk+this.warnaProduk;
    }
}
