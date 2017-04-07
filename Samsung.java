public class Samsung extends Handphone{
	String nama;
	public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Samsung");
	}
	
	public void Handphone(){
		super.tampilkan();
		System.out.println("===========================");
		super.video();
		super.Telepon();
		super.MainGame();
		System.out.println("===========================");
	}
	public static void main (String[] args){
		Samsung pgl = new Samsung();
		pgl.Handphone();
		
		
		Handphone Handphone1 = new Handphone();
        Handphone1.setMerk("Samsung");        
        System.out.println("Merk Handphone  = "+Handphone1.getMerk());
	}
}