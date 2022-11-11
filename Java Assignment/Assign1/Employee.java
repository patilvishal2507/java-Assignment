class Employee {
	public static void main(String [] args) {

		int a = Integer.parseInt(args[0]);
                    
                int b = Integer.parseInt(args[1]);

		double c = Double.parseDouble(args[2]);
                 
		Income emp = new Income(a,b,c);
		emp.printIncome();
		System.out.printf("Income = %.2f%n",emp.getIncome());

		System.out.printf("NetIncome = %.2f%n",emp.getNetIncome());
	}
}
