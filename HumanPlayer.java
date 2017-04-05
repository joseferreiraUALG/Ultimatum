import java.util.Scanner;

public class HumanPlayer implements IPlayer{

	int pool = 0;
	
	@Override
	public int getSplit() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	@Override
	public boolean acceptSplit(int amount) {
		System.out.println("Accept " + amount);
		Scanner sc = new Scanner(System.in);
		return sc.next().equals("T");	
	}

	@Override
	public void setPool(int a){
		this.pool += a;
	}

	@Override
	public int getPool() {
		return this.pool;
	}

}
