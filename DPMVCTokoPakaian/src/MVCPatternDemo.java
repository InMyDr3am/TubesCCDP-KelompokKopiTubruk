public class MVCPatternDemo {

    public static void main(String[] args) {

        // Fetch pegawai record based on his role id from the database
        Pegawai model = retrievePegawaiFromDatabase();

        PegawaiView view = new PegawaiView();

        PegawaiController controller = new PegawaiController(model, view);

        controller.updateView();

        controller.setPegawaiNama("Diaz Ramdhani");
        controller.updateView();
    }

    private static Pegawai retrievePegawaiFromDatabase(){
        return new Pegawai("1", "Farhan Fauzi", "P001", "Pelayan");
    }
}
