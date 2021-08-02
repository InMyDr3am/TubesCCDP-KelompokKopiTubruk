public class PakaianDecorator implements Pakaian{
    protected Pakaian pakaianDecorator;
    public PakaianDecorator(Pakaian pakaianDecorator){
        this.pakaianDecorator = pakaianDecorator;
    }
    @Override
    public void jenis() {
        pakaianDecorator.jenis();
    }
}
