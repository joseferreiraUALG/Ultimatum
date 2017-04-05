
public class Ultimatum {
	IPlayer a;
	IPlayer b;
	
	int amount = 100;
	
	public Ultimatum(){
		a = new HumanPlayer();
		b = new EmphaticPlayer();
	}
	
	public void play(){
		for(int i = 0; i < 20; i++){
			System.out.println("Split the pool: " + amount);
			if(i%2 == 0) {
				int split = a.getSplit();
				if(b.acceptSplit(split)) {
					a.setPool(split);
					b.setPool(amount - split);
				}
			}
			else {
				int split = b.getSplit();
				b.acceptSplit(split);
				if(a.acceptSplit(split)) {
					b.setPool(split);
					a.setPool(amount - split);
				}
			}
			
			System.out.println("Player A: " + a.getPool());
			System.out.println("Player B: " + b.getPool());
		}
	}
}
