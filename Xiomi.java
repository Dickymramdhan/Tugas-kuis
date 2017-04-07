public class Xiomi extends Handphone{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Xiomi");
	}
	
	public void Handphone(){
		tampilkan();
		super.tampilkan();
		System.out.println("===========================");
		super.video();
		super.Telepon();
		super.MainGame();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Xiomi pgl = new Xiomi();
		pgl.Handphone();
		
		Handphone Handphone1 = new Handphone();
        Handphone1.setMerk("Xiomi");        
        System.out.println("Merk Handphone  = "+Handphone1.getMerk());
	}
}