public class ProdukFactory {
    public Produk createProduk(String namaProduk, String type){
        switch (type){
            case "bajupanjang":
                return new ProdukBajuPanjang(namaProduk);
            case "bajupendek":
                return new ProdukBajuPendek(namaProduk);
            case "celanapanjang":
                return new ProdukCelanaPanjang(namaProduk);
            case "celanapendek":
                return new ProdukCelanaPendek(namaProduk);
            case "jaketzipper":
                return new ProdukJaketZipper(namaProduk);
            case "jakethoodie":
                return new ProdukJaketHoodie(namaProduk);
            default:
                return null;
        }
    }
}
