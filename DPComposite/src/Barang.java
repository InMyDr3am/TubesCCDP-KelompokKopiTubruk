import java.util.*;
public class Barang {
    private String namabarang;
    private int harga;
    private List< Barang > barangList;

    public Barang(String namabarang, int harga){
        this.namabarang = namabarang;
        this.harga = harga;
        barangList = new ArrayList< Barang >();
    }
    public void add(Barang add){
        barangList.add(add);
    }
    public void remove(Barang remove){
        barangList.remove(remove);
    }

    public List< Barang > getBarangList(){
        return barangList;
    }

    @Override
    public String toString(){
        return (" Nama Barang : " + namabarang + ", Harga : Rp " + harga+"");
    }

}
