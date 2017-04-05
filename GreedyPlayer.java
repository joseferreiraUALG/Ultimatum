
public class GreedyPlayer implements IPlayer {

	int pool = 0;
	@Override
	public int getSplit() {
		return 100;
	}

	@Override
	public boolean acceptSplit(int amount) {
		return amount/2 <= 100;
	}

	public void setPool(int a){
		this.pool += a;
	}

	@Override
	public int getPool() {
		return this.pool;
	}
}
