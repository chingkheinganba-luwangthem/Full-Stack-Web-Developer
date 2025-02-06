package HybridInheritance;

class MA {
	void maParent() {
		System.out.println("This is Multilevel A");
	}
	
}

class MB extends MA{
	void mbChild() {
		System.out.println("This is Multilevel B");
	}
	
}
class MC extends MB{
	void mcGranChild() {
		System.out.println("This is Multilevel C");
	}
}

public class MultilevelInheritance {
	public static void main(String [] args) {
		
		MA ma = new MA();
		ma.maParent();
		System.out.println("-----------------------");
		MB mb = new MB();
		mb.mbChild();
		mb.maParent();
		
		System.out.println("-----------------------");
		MC mc = new MC();
		mc.maParent();
		mc.mbChild();
		mc.mcGranChild();
		
		
	}
	

}


