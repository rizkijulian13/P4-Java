public class B_Orang {
    String nama;
    int umur;
    String WarnaRambut;
    String WarnaKulit;
    int TinggiBadan;
    int BeratBadan;

    public B_Orang() {
    }

    public B_Orang(String nama){
        this.nama = nama;
    }
    public void menangis() {
        System.out.println("hu.... hu....");
    }
    public void tertawa(){
        System.out.println("Ha.... Ha....");
    }

    public static void main(String[] args) {
        B_Orang dido = new B_Orang();
        dido.nama = "Dido";
        dido.umur = 4;
        System.out.println("Nama :" +dido.nama);
        System.out.println("Umur :" +dido.umur + "tahun");
        dido.tertawa();
    }
}
