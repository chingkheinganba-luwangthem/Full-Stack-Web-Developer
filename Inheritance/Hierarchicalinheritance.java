package HybridInheritance;


class HIA {
	void hiaParent() {
		System.out.println("This is Hierarchical A");
	}
	
}

class HIB extends HIA{
	void hibChild() {
		System.out.println("This is Hierarchical B");
	}
	
}

class HIC extends HIA{
	void hicChild() {
		System.out.println("This is Hierarchical C");
	}
	
}

public class HierarchicalInheritance {
	
	
	public static void main(String [] args) {
		HIA hia = new HIA();
		hia.hiaParent();
		System.out.println("-----------------------");
		HIB hib = new HIB();
		hib.hiaParent();
		hib.hibChild();
		System.out.println("-----------------------");
		HIC hic = new HIC();
		hic.hiaParent();
		hic.hiaParent();

	

}
}
