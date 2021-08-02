public class Hoodie implements Jaket {

    private String namaJaket = Hoodie.class.getSimpleName();

    @Override
    public void kodeJaket() {
        System.out.println("JH002 : "+namaJaket);
    }

    @Override
    public void hargaJaket() {
        System.out.println("Rp 250.000 ");
    }
}
