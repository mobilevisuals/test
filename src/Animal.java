
public abstract class Animal {
	protected float bodyTemp;
	protected String name;
	protected String sound;
	
	public Animal(float bodyTemp, String name, String sound) {
		this.bodyTemp = bodyTemp;
		this.name = name;
		this.sound = sound;
	}

	public float getBodyTemp() {
		return bodyTemp;
	}

	public void setBodyTemp(float bodyTemp) {
		this.bodyTemp = bodyTemp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	

}
