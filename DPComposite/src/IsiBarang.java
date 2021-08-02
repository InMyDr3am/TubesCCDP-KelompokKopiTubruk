public class IsiBarang {
    public static void main(String[] args) {
        Barang pakaian = new Barang("Pakaian", 100000);
        Barang baju = new Barang("Baju", 50000);
        Barang celana = new Barang("Celana", 30000);
        Barang jaket = new Barang("Jaket", 250000);
        Barang bajupendek = new Barang("Baju Pendek", 45000);
        Barang celanapendek = new Barang("Celana Pendek", 25000);
        Barang zipper = new Barang("Jaket Zipper", 200000);

        pakaian.add(baju);
        pakaian.add(celana);
        pakaian.add(jaket);

        baju.add(bajupendek);
        celana.add(celanapendek);
        jaket.add(zipper);

        for(Barang listpakaian : pakaian.getBarangList()){
            System.out.println();
            System.out.println(listpakaian);

            for(Barang Barang : listpakaian.getBarangList()){
                System.out.println(" - "+Barang);
            }
        }
    }
}
