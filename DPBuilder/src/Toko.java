import java.util.*;

public class Toko {
    private List<Barang> barangList = new ArrayList<>();

    public void add(Barang barang){
        barangList.add(barang);
    }

    public int getharga(){
        int harga = (int) 0.0f;
        for (Barang barang: barangList){
            harga += barang.harga();
        }
        return harga;
    }

    public void tampilbarang(){
        for(Barang barang: barangList){
            System.out.println("Barang : "+barang.jenis());
            System.out.println("Harga : "+barang.harga());

        }
    }
}
