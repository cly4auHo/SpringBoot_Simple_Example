package ua.itea.lesson14;

public class Pudge {

	private String name;
	private int level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Pudge(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public Pudge() {
	}

	@Override
	public String toString() {
		return "Pudge [name=" + name + ", level=" + level + "]";
	}

}
