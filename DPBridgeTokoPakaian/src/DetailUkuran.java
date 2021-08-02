public class DetailUkuran extends Ukuran {

    private int p,l;
    private String size;

    public DetailUkuran(String size, int p, int l, Pakaian pakaian){
        super(pakaian);
        this.size = size;
        this.p = p;
        this.l = l;
    }

    @Override
    public void view() {
        pakaian.ukuranPakaian(size,p,l);
    }
}
