public class MainClass {
    public static void main(String[] args) {
        ProdukFactory produkFactory = new ProdukFactory();
        System.out.println(produkFactory.createProduk("Baju Panjang ","bajupanjang").toString());
        System.out.println(produkFactory.createProduk("Baju Pendek ","bajupendek").toString());
        System.out.println(produkFactory.createProduk("Celana Panjang ","celanapanjang").toString());
        System.out.println(produkFactory.createProduk("Celana Pendek ","celanapendek").toString());
        System.out.println(produkFactory.createProduk("Jaket Zipper ","jaketzipper").toString());
        System.out.println(produkFactory.createProduk("Jaket Hoodie ","jakethoodie").toString());
    }
}
