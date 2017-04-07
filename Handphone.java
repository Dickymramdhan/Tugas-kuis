public class Handphone {
    String merk;
    
    //konstruktor
    public Handphone(){
        this.merk="Merk Handphone";
    }
    public Handphone(String m){
        this.merk = m;
    }
    public void setMerk(String m){
        this.merk = m;
    }
    public String getMerk(){
        return this.merk;
    }    
    public void video(){
        System.out.println("Handphone dapat merekam video");        
    }
    public void Telepon(){
        System.out.println("Handphone dapat menerima telepon");        
    }
    public void MainGame(){
        System.out.println("Handphone dapat maen game");        
    }
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Handphone");
	}
}