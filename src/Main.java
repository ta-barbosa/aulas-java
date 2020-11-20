	
public class Main {

	public static void main(String[] args) {

		int processa(int n)
		{
			if (n>0) return n % 10 * processa(n / 10);
			else return 1;
		}
		void imprime()
		{
			println(processa(353));
		}

	}

}
	