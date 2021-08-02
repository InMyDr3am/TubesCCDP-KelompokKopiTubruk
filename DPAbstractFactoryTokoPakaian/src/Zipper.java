public class Zipper implements Jaket {

    private String namaJaket = Zipper.class.getSimpleName();

    @Override
    public void kodeJaket() {
        System.out.println("JZ001 : "+namaJaket);
    }

    @Override
    public void hargaJaket() {
        System.out.println("Rp 220.000 ");
    }
}
