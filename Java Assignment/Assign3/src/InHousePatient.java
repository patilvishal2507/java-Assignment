package hospital;

public class InHousePatient extends Patient{
	
	public double discount;

	public InHousePatient(int id, int bedT, int d, double dis){
		super(id,bedT,d);
		discount = dis;
	}
	public double getDiscount(){
		return discount;
	}
	public double getBillAmount(){
		
		double i = super.getBillAmount();

		if(i >= 5000)
			return i - ( i * discount);
		return i;
	}
	
}
