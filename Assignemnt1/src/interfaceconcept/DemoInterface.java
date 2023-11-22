package interfaceconcept;

 interface DemoInterface {
	int x=10;
	//int add();
	public default void demo() {
		System.out.println("interface method");
	}

}
  class mainclass implements DemoInterface{

	//@Override
	public int add() {
	System.out.println();
		return x;
	}
	
	 
 }
  
