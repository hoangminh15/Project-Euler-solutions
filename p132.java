/* 
 * Solution to Project Euler problem 132
 * By Nayuki Minase
 * 
 * http://nayuki.eigenstate.org/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */


public final class p132 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new p132().run());
	}
	
	
	public String run() {
		int sum = 0;
		int count = 0;
		for (int i = 2; count < 40; i++) {
			if (isPrime(i) && repunitMod(1000000000, i) == 0) {
				sum += i;
				count++;
			}
		}
		return Integer.toString(sum);
	}
	
	
	private static int repunitMod(int k, int m) {
		return (Library.powMod(10, k, m * 9) - 1) / 9;
	}
	
	
	private boolean[] isPrime = {};
	
	private boolean isPrime(int n) {
		if (n >= isPrime.length)
			isPrime = Library.listPrimality(n * 4);
		return isPrime[n];
	}
	
}