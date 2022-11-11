import math.MathUtil;

class Assign {
	public static void main(String [] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if (MathUtil.isEvent(a))
			System.out.printf("%d Even %n",a);
		else
			System.out.printf("%d is Not Even %n",a);


		if (MathUtil.isOdd(a))
			System.out.printf("%d Odd %n",a);
		else
			System.out.printf("%d is Not Odd %n",a);
 
		if (MathUtil.isPrime(a))
			System.out.printf("%d Prime %n",a);
		else
			System.out.printf("%d is Not Prime %n",a);

		System.out.printf("Total prime numbers between %d and %d are : %d%n",a,b,MathUtil.countPrimes(a,b));

		System.out.printf("Reverse of %d is %d%n",a,MathUtil.reverse(a));

	}
}
