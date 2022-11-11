class Income {

	private int id;
	private int hours;
	private double rate;

	public Income (int ids, int hrs, double r){
	       id = ids;
	       hours = hrs;
               rate = r;
	}
  	 public void printIncome(){
	 System.out.printf("Employee id= %d%n",id);
	 System.out.printf("No of hours = %d%n",hours);	 
	 System.out.printf("Rate= %f%n",rate);

	 }
	 
	 public double getIncome(){
		 return hours * rate;
	 }
	 public double getNetIncome(){
		 return (hours * rate + (hours * 100));

         }
}

