
public class EmphaticPlayer implements IPlayer{

	int pool = 0;
	@Override
	public int getSplit() {
		return 50;
	}

	@Override
	public boolean acceptSplit(int amount) {
		return true;
	}
	
	public void setPool(int a){
		this.pool += a;
	}

	@Override
	public int getPool() {
		return this.pool;
	}

	
}
