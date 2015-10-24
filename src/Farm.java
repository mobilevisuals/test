import java.util.Random;

public class Farm<T extends Reptile> {

	Reptile reptiles[];
	int amount;
	Random rand = new Random();

	public Farm(Reptile[] reptiles) {
		super();
		this.reptiles = reptiles;
	}

	public Farm(Reptile[] reptiles, int amount) {
		super();
		this.reptiles = reptiles;
		this.amount = amount;
	}

	public Farm(int amount) {
		super();
		this.amount = amount;
		reptiles = new Reptile[amount];

	

	}

	public Farm() {
		super();
	}

	public Reptile[] getReptiles() {
		return reptiles;
	}

	public void setReptiles(Reptile[] reptiles) {
		this.reptiles = reptiles;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	Farm<?> createReptilesInFarm(Farm<?> farm, int type) {

		Reptile reptile = null;
		for (int i = 0; i < farm.getReptiles().length; i++) {
			if (type == 0) {
				reptile = new Snake(33 + (int) (44 * (Math.random())),
						"Jasper " + i, "Squeeky");
				farm.getReptiles()[i] = reptile;
			} else if (type == 1) {
				reptile = new Snake2(33 + (int) (74 * (Math.random())), "Will "
						+ i, "Wizzly");
				farm.getReptiles()[i] = reptile;
			}
		}

		return farm;
	}

}
