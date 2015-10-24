
public class AnimalsMain {

	public static void main(String[] args) {
		Animal a = new Dog(38.0f,"Fido","Vov");
		Animal b = new Snake(30.0f,"Sir Väs", "Väs");
		Reptile c = new Snake(30.0f,"Sir Väs", "Väs");
		AnimalsMain animalsMain =new AnimalsMain ();
		animalsMain.tester();
	}
	
	void tester()
	{
		Farm<Snake> farm1=new Farm<Snake>(10);
		Farm<Snake2> farm2=new Farm<Snake2>(10);		
		farm1.createReptilesInFarm(farm2,0);
		
	}
	


}
