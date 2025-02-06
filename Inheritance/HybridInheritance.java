package HybridInheritance;

class HYA{
	void hyaParent() {
		System.out.println("This is Hybrid1");
	}
}

class HYB extends HYA{
	
	void hybChild() {
		System.out.println("This is Hybrid B");
		
	}
}

class HYC extends HYB{
	
	void hycGrandChild() {
		System.out.println("This is Hybrid B");
		
	}
}

class HYD extends HYA{
	
	void hydChildParent() {
		System.out.println("This is Hybrid D");
		
	}
}

class HYE extends HYD{
	
	void hyeChild() {
		System.out.println("This is Hybrid E");
		
	}
}
class HYF extends HYD{
	
	void hyfChild() {
		System.out.println("This is Hybrid F");
		
	}
}




public class Hybrid {

	public static void main(String[] args) {
		
		HYA hya = new HYA();
		hya.hyaParent();
		System.out.println("-----------------------");
		HYB hyb = new HYB();
		hyb.hyaParent();
		hyb.hybChild();
		System.out.println("-----------------------");
		HYC hyc = new HYC();
		hyc.hyaParent();
		hyc.hybChild();
		hyc.hycGrandChild();
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		HYD hyd = new HYD();
		hyd.hyaParent();
		hyd.hydChildParent();
		System.out.println("-----------------------");
		HYE hye = new HYE();
		hye.hyaParent();
		hye.hydChildParent();
		hye.hyeChild();
		System.out.println("-----------------------");
		HYF hyf = new HYF();
		hyf.hyaParent();
		hyf.hydChildParent();
		hyf.hyfChild();
	

	}

}
