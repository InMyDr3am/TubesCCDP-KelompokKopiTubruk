import java.util.ArrayList;
import java.util.List;

public class Produk {
    private List<Toko> item = new ArrayList<Toko>();
    private double harga;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double Harga) {
        this.harga = Harga;
        notifyAllObservers();
    }

    public void attach(Toko toko){
        item.add(toko);
    }

    public void notifyAllObservers(){
        for (Toko toko : item){
            toko.update();
        }
    }
}
