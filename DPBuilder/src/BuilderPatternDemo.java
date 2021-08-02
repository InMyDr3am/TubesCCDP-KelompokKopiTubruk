public class BuilderPatternDemo {

    public static void main(String[] args) {
        TokoBuilder tokoBuilder = new TokoBuilder();

        Toko paket1 = tokoBuilder.paket1();
        System.out.println("Paket 1");
        paket1.tampilbarang();

        Toko paket2 = tokoBuilder.paket2();
        System.out.println("\n\nPaket 2");
        paket2.tampilbarang();
    }
}
