public class Main {
    public static void main(String[] args){

        Pakaian baju = new Baju();

        Pakaian bajumerah = new PakaianMerahDecorator(new Baju());

        Pakaian celanamerah = new PakaianMerahDecorator(new Celana());

        System.out.println("Baju");
        baju.jenis();

        System.out.println("\nBaju berwarna merah");
        bajumerah.jenis();

        System.out.println("\nCelana berwarna merah");
        celanamerah.jenis();
    }
}
