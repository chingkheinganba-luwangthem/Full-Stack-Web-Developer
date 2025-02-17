package Abstraction;

abstract class Swarga{
	abstract void urvashi();
	abstract void rambha();
	abstract void Meneka();
	
	void narad() {
		System.out.println("Narayan Narayan..");
		}
}

abstract class Indra extends Swarga{
	
	@Override
	void urvashi() {
		System.out.println("Bharattnatyam");
		}
	@Override
	void rambha() {
		System.out.println("Kathak...");
	}
	
}

class Abishek extends Indra{
	@Override
	void Meneka() {
		System.out.println("Abishek... Ke sath dance");
	}
}

public class JeevanChakra {
	public static void main(String[]args) {
		
		Swarga s1 = new Abishek(); // upcasting
		s1.urvashi();
		s1.rambha();
		s1.Meneka();
		s1.narad();
	}
	

}
