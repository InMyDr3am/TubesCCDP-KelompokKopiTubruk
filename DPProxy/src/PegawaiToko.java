public class PegawaiToko {
    String userName;
    String password;
    String jabatan;

    public PegawaiToko(String userName, String password, String jabatan) {
        this.userName = userName;
        this.password = password;
        this.jabatan = jabatan;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
