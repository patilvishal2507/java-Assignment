package hospital;
public class Patient{

	public int patientId;
	public int bedType;
	public int noOfDays;
	
	public Patient(int id, int bed, int days ){

		patientId = id;
		bedType = bed;
		noOfDays = days;

	}
	public Patient (){
		
		this(101,1,5);
	}
	public int getPatientId(){
		return patientId;
	}
	public void setPatientId(int id){
		patientId = id;
	}
	public int getBedType(){
		return bedType;
	}
	public void setBedType(int bed){
		bedType = bed;
	}
	public int getNoOfDays(){
		return noOfDays;
	}
	public void setNoOfDays(int day){
		noOfDays = day;
	}
	
	public double getBillAmount(){

		int price=0;
		
		if (bedType == 1)
			price = 500;

		if (bedType == 2)
		   	price = 300;

		if (bedType == 3)
			price = 200;
		return noOfDays * price;
	}
}
