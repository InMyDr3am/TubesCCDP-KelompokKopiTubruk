public class PakaianMerahDecorator extends PakaianDecorator{
    public PakaianMerahDecorator(Pakaian pakaianDecorator) {
        super(pakaianDecorator);
    }
    @Override
    public void jenis(){
        pakaianDecorator.jenis();
        setWarnaMerah(pakaianDecorator);
    }
    private void setWarnaMerah(Pakaian pakaianDecorator){
        System.out.println("Warna Baju : Merah");
    }
}
