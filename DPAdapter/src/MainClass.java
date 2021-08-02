public class MainClass {
    public static void main(String[] args) {
        BajuAdapter bajuAdapter = new BajuAdapter();
        CelanaAdapter celanaAdapter = new CelanaAdapter();
        JaketAdapter jaketAdapter = new JaketAdapter();

        bajuAdapter.namaBaju();
        bajuAdapter.hargaBaju();
        bajuAdapter.warnaBaju();
        System.out.println("-------------");
        celanaAdapter.namaCelana();
        celanaAdapter.hargaCelana();
        celanaAdapter.warnaCelana();
        System.out.println("-------------");
        jaketAdapter.namaJaket();
        jaketAdapter.hargaJaket();
        jaketAdapter.warnaJaket();
    }
}
