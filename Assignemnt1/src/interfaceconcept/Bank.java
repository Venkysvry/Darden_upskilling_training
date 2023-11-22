package interfaceconcept;

 interface Bank {
	float rateOfInterst();

}
class SBI implements Bank{

	@Override
	public float rateOfInterst() {
		
		return 9.1f;
	}
	
}
class HDFC implements Bank{

	@Override
	public float rateOfInterst() {
		
		return 10.25f;
	}

}
 
	



