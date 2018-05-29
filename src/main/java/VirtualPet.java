
public class VirtualPet {

	public int grow = 10;
	int blossom = 10;
	int sing = 10;
	int shine = 10;
	
	public VirtualPet(int grow, int blossom, int sing, int shine) {
		this.grow = grow;
		this.blossom = blossom;
		this.sing = sing;
		this.shine = shine; 
	}

	public void tick() {
		grow -= 1;
		blossom -= 1;
		sing -= 1;
		shine -= 1;
	}

	public void water() {
		grow += 2;
		blossom += 1;
		sing -= 3;
		shine -= 1;
	}

	public void feed() {
		grow += 2;
		blossom += 3;
		sing -= 2;
		shine -= 2;
	}

	public void sunlight() {
		grow -= 1;
		blossom += 1;
		sing += 2;
		shine -= 2;
	}
	
	public void attention() {
		grow += 1;
		blossom -= 1;
		sing -= 1;
		shine += 2;
	}


	public boolean myPlantLives() {
		if (grow > 0 && blossom > 0 && shine > 0 && sing > 0) {
			return true;
		}
		return false;
	}		
	
}