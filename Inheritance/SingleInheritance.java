package HybridInheritance;

class SA {
	void saParent() {
		System.out.println("This is Single SA");
	}
	
}

class SB extends SA{
	void sbChild() {
		System.out.println("This is Single SB");
	}
	
}

public class SingleInheritance {
	
	public static void main(String [] args) {
		
		SA sa = new SA();
		sa.saParent();
		System.out.println("-----------------------");
		SB sb = new SB();
		sb.saParent();
		sb.sbChild();
		
	
	}
	}


